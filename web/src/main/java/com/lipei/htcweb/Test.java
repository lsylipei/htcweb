package com.lipei.htcweb;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import condor.CondorScheddPortType;

public class Test {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:1984/condorSchedd.wsdl");

		QName name = new QName("urn:condor", "condorSchedd");

		Service service = Service.create(url, name);
		CondorScheddPortType shedd = service.getPort(CondorScheddPortType.class);

		System.out.println(shedd.toString());
		System.out.println(shedd.getPlatformString());
		System.out.println(shedd.getVersionString());
	}

}
