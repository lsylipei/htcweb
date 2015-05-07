package com.lipei.htcweb.server;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;

import com.lipei.htcweb.status.Job;
import com.lipei.htcweb.status.Master;
import com.lipei.htcweb.status.Schedd;
import com.lipei.htcweb.status.Startd;

import condor.ClassAdStruct;
import condor.ClassAdStructArray;
import condor.ClassAdStructArrayAndStatus;
import condor.ClassAdStructAttr;
import condor.CondorCollectorPortType;
import condor.CondorScheddPortType;

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

	public Master requestMaster(long time) throws Exception {

		ClassAdStructArray ads = colport.queryMasterAds(null);

		Master obj = new Master();
		obj.setServer(condorServer);
		obj.setSerid(time);
		dumpads(ads, obj);

		return obj;
	}

	private void dumpads(ClassAdStructArray ads, Object obj) throws Exception {

		List<ClassAdStruct> list = ads.getItem();
		for (ClassAdStruct cads : list) {
			dumpcads(obj, cads);
		}
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

		Schedd schedd = new Schedd();

		ads = colport.queryScheddAds(null);
		dumpads(ads, schedd);

		schedd.setSerid(time);
		schedd.setServer(condorServer);
		list.add(schedd);

		return list;
	}
}
