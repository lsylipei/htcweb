package com.lipei.htcweb.server;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.primefaces.model.UploadedFile;

import com.lipei.htcweb.status.Job;
import com.lipei.htcweb.status.Master;
import com.lipei.htcweb.status.Schedd;
import com.lipei.htcweb.status.Startd;

import condor.ClassAdAttrType;
import condor.ClassAdStruct;
import condor.ClassAdStructArray;
import condor.ClassAdStructArrayAndStatus;
import condor.ClassAdStructAttr;
import condor.CondorCollectorPortType;
import condor.CondorScheddPortType;
import condor.HashType;
import condor.Transaction;
import condor.TransactionAndStatus;
import condor.UniverseType;

public class ServerWebService extends AbstractServer {

	static QName colname = new QName("urn:condor", "condorCollector");
	static QName schname = new QName("urn:condor", "condorSchedd");

	private CondorCollectorPortType colport;
	private CondorScheddPortType schport;

	public void init() {

		try {
			URL colurl = new URL("http://" + condorServer.getAddress() + ":" + condorServer.getColPort() + "/"
					+ "condorCollector.wsdl");

			URL schurl = new URL("http://" + condorServer.getAddress() + ":" + condorServer.getSchPort() + "/"
					+ "condorSchedd.wsdl");

			Service service = Service.create(colurl, colname);
			colport = service.getPort(CondorCollectorPortType.class);

			service = Service.create(schurl, schname);
			schport = service.getPort(CondorScheddPortType.class);
		} catch (MalformedURLException e) {
			throw new RuntimeException("error in create webservice", e);
		}

	}

	public Collection<? extends Object> requestJobList(long time) throws Exception {
		ClassAdStructArrayAndStatus ads = schport.getJobAds(null, null);

		JAXBElement<ClassAdStructArray> array = ads.getClassAdArray();
		ClassAdStructArray value = array.getValue();
		List<ClassAdStruct> items = value.getItem();
		ArrayList<Job> list = new ArrayList<Job>();
		for (ClassAdStruct cads : items) {
			Job job = new Job();
			dumpcads(job, cads);
			job.setServer(condorServer);
			job.setSerid(time);
			list.add(job);
		}

		return list;
	}

	public List<Master> requestMaster(long time) throws Exception {

		ClassAdStructArray ads = colport.queryMasterAds(null);

		List<Master> list = dumpads(ads, Master.class);

		for (Master master : list) {
			master.setServer(condorServer);
			master.setSerid(time);
		}
		return list;
	}

	private <T> List<T> dumpads(ClassAdStructArray ads, Class<T> cls) throws Exception {

		List<ClassAdStruct> list = ads.getItem();

		List<T> result = new ArrayList<T>();
		for (ClassAdStruct cads : list) {
			T obj = cls.newInstance();
			result.add(obj);
			dumpcads(obj, cads);
		}
		return result;
	}

	private void dumpcads(Object obj, ClassAdStruct cads) throws IllegalAccessException, InvocationTargetException {
		List<ClassAdStructAttr> items = cads.getItem();
		for (ClassAdStructAttr atr : items) {
			String uncapitalize = StringUtils.uncapitalize(atr.getName());
			String value = atr.getValue();
			try {
				BeanUtils.setProperty(obj, uncapitalize, value);
			} catch (IllegalAccessException | InvocationTargetException e) {
				continue;
			}
		}
	}

	public List requestStatus(long time) throws Exception {
		ClassAdStructArray ads = colport.queryStartdAds(null);

		List<ClassAdStruct> items = ads.getItem();
		List<Object> list = new ArrayList<Object>();
		for (ClassAdStruct cads : items) {
			Startd startd = new Startd();
			startd.setSerid(time);
			dumpcads(startd, cads);
			startd.setServer(condorServer);
			list.add(startd);

			System.out.println("slot:" + startd.getSlotID() + " load:" + startd.getLoadAvg() + " condor:"
					+ startd.getCondorLoadAvg());
		}

		ads = colport.queryScheddAds(null);
		List<Schedd> result = dumpads(ads, Schedd.class);

		for (Schedd schedd : result) {
			schedd.setSerid(time);
			schedd.setServer(condorServer);
		}

		list.addAll(result);

		return list;
	}

	public void upload(UploadedFile file) throws IOException {
		TransactionAndStatus transs = schport.beginTransaction(6000);
		Transaction trans = transs.getTransaction();
		try {

			int cluster = schport.newCluster(trans).getInteger();

			int interval = 50000;

			for (int i = 0; i < 999999; i += interval) {

				int job = schport.newJob(trans, cluster).getInteger();
				String args = "com.lipei.condor.test.Brute " + i + " " + (i + interval - 1);
				ClassAdStruct jobdesc = schport
						.createJobTemplate(cluster, job, "lipei", UniverseType.JAVA, "java", args, null).getClassAd()
						.getValue();

				setupJob(jobdesc, args);

				byte[] byteArray = IOUtils.toByteArray(new FileInputStream("C:\\condor\\test\\test.jar"));
				schport.declareFile(trans, cluster, job, "test.jar", byteArray.length, HashType.NOHASH, null);
				schport.sendFile(trans, cluster, job, "test.jar", 0, byteArray);

				byteArray = IOUtils.toByteArray(file.getInputstream());
				schport.declareFile(trans, cluster, job, "name.zip", byteArray.length, HashType.NOHASH, null);
				schport.sendFile(trans, cluster, job, "name.zip", 0, byteArray);

				schport.submit(trans, cluster, job, jobdesc);
			}

			schport.commitTransaction(trans);
		} catch (IOException e) {
			schport.abortTransaction(trans);
		}
	}

	private void setupJob(ClassAdStruct jobdesc, String args) {

		List<ClassAdStructAttr> items = jobdesc.getItem();
		for (ClassAdStructAttr item : items) {
			System.out.println(item.getName() + "=" + item.getValue());

			if (StringUtils.equals(item.getName(), "Requirements")) {
				item.setType(ClassAdAttrType.EXPRESSION_ATTR);
				item.setValue("( TARGET.HasJava ) && ( TARGET.Disk >= RequestDisk ) && ( TARGET.Memory >= RequestMemory ) && ( ( TARGET.HasFileTransfer ) || ( TARGET.FileSystemDomain == MY.FileSystemDomain ) )");
			} else if (StringUtils.equals(item.getName(), "CoreSize")) {
				item.setValue("0");
			} else if (StringUtils.equals(item.getName(), "ImageSize")) {
				item.setValue("0");
			}

		}

		Iterator<ClassAdStructAttr> it = items.iterator();
		while (it.hasNext()) {
			ClassAdStructAttr cad = it.next();
			if (StringUtils.equals(cad.getName(), "")) {
				it.remove();
			}
		}
		ClassAdStructAttr e = null;

		e = new ClassAdStructAttr();
		e.setName("TransferExecutable");
		e.setType(ClassAdAttrType.BOOLEAN_ATTR);
		e.setValue("false");
		items.add(e);

		e = new ClassAdStructAttr();
		e.setName("TransferErr");
		e.setType(ClassAdAttrType.BOOLEAN_ATTR);
		e.setValue("false");
		items.add(e);

		e = new ClassAdStructAttr();
		e.setName("TransferInput");
		e.setType(ClassAdAttrType.STRING_ATTR);
		e.setValue("test.jar,test.jar,name.zip");
		items.add(e);

		e = new ClassAdStructAttr();
		e.setName("Args");
		e.setType(ClassAdAttrType.STRING_ATTR);
		e.setValue(args);
		items.add(e);

		e = new ClassAdStructAttr();
		e.setName("TransferOutput");
		e.setType(ClassAdAttrType.STRING_ATTR);
		e.setValue("name.pptx");
		items.add(e);

		e = new ClassAdStructAttr();
		e.setName("JarFiles");
		e.setType(ClassAdAttrType.STRING_ATTR);
		e.setValue("test.jar");
		items.add(e);

//		e = new ClassAdStructAttr();
//		e.setName("User");
//		e.setType(ClassAdAttrType.STRING_ATTR);
//		e.setValue("lipei@lipei-PC");
//		items.add(e);
	}
}
