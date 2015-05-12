package com.lipei.htcweb.status;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import condor.ClassAdAttrType;
import condor.ClassAdStruct;
import condor.ClassAdStructArray;
import condor.ClassAdStructAttr;
import condor.CondorScheddPortType;
import condor.HashType;
import condor.Transaction;
import condor.TransactionAndStatus;
import condor.UniverseType;

public class Test {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:18493/condorSchedd.wsdl");

		QName name = new QName("urn:condor", "condorSchedd");

		Service service = Service.create(url, name);
		CondorScheddPortType shedd = service.getPort(CondorScheddPortType.class);

		// adsdump(ads.getClassAdArray().getValue());

		upload(shedd);
	}

	private static void upload(CondorScheddPortType schport) {
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

				byteArray = IOUtils.toByteArray(new FileInputStream("C:\\Users\\lipei\\Desktop\\name.zip"));
				schport.declareFile(trans, cluster, job, "name.zip", byteArray.length, HashType.NOHASH, null);
				schport.sendFile(trans, cluster, job, "name.zip", 0, byteArray);

				schport.submit(trans, cluster, job, jobdesc);
			}

			schport.commitTransaction(trans);
		} catch (IOException e) {
			schport.abortTransaction(trans);
		}
	}

	private static void setupJob(ClassAdStruct jobdesc, String args) {

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

	private static void adsdump(ClassAdStructArray ads) {
		Path path = Paths.get("C:\\Users\\lipei\\git\\htcweb\\web\\src\\main\\java\\com\\lipei\\htcweb\\Dump.java");

		StringBuffer buf = new StringBuffer();

		List<ClassAdStruct> items = ads.getItem();

		Map<String, ClassAdStructAttr> map = new HashMap<String, ClassAdStructAttr>();

		for (ClassAdStruct st : items) {
			List<ClassAdStructAttr> items2 = st.getItem();
			for (ClassAdStructAttr sta : items2) {
				map.put(sta.getName(), sta);
			}
		}
		for (ClassAdStructAttr sta : map.values()) {

			buf.append("public ");
			switch (sta.getType()) {
			case INTEGER_ATTR:
				buf.append("int");
				break;
			case FLOAT_ATTR:
				buf.append("float");
				break;
			case STRING_ATTR:
				buf.append("String");
				break;
			case EXPRESSION_ATTR:
				buf.append("String");
				break;
			case BOOLEAN_ATTR:
				buf.append("boolean");
				break;
			case UNDEFINED_ATTR:
				System.out.println(sta);
				break;
			case ERROR_ATTR:
				System.out.println(sta);
				break;
			default:
				System.out.println(sta);
				break;
			}

			buf.append(" ");
			buf.append(StringUtils.uncapitalize(sta.getName()));
			buf.append(";\r\n");
		}

		try {
			OutputStream out = Files.newOutputStream(path, StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
			OutputStreamWriter writer = new OutputStreamWriter(out);
			writer.write(buf.toString());
			writer.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
