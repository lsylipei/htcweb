package com.lipei.htcweb.status;

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
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.commons.lang3.StringUtils;

import condor.ClassAdStruct;
import condor.ClassAdStructArray;
import condor.ClassAdStructArrayAndStatus;
import condor.ClassAdStructAttr;
import condor.CondorScheddPortType;

public class Test {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:18493/condorSchedd.wsdl");

		QName name = new QName("urn:condor", "condorSchedd");

		Service service = Service.create(url, name);
		CondorScheddPortType shedd = service.getPort(CondorScheddPortType.class);

		// ClassAdStructArrayAndStatus ads = shedd.getJobAds(null, null);
		ClassAdStructArrayAndStatus ads = shedd.getJobAds(null, null);

		adsdump(ads.getClassAdArray().getValue());

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
