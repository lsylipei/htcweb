package com.lipei.htcweb.server;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.lipei.htcweb.data.CondorServer;
import com.lipei.htcweb.status.Master;

import condor.CondorCollectorPortType;
import condor.CondorScheddPortType;

public class ServerDelegate {

	static QName colname = new QName("urn:condor", "condorCollector");
	static QName schname = new QName("urn:condor", "condorSchedd");

	private CondorServer serverdata;
	private CondorCollectorPortType colport;
	private CondorScheddPortType schport;

	public ServerDelegate(CondorServer serverdata) {
		super();
		this.serverdata = serverdata;
	}

	public void init() throws Exception {

		String base = "http://" + serverdata.getAddress() + ":" + serverdata.getPort() + "/";
		URL colurl = new URL(base + "condorCollector.wsdl");
		URL schurl = new URL(base + "condorSchedd.wsdl");

		Service service = Service.create(colurl, colname);
		colport = service.getPort(CondorCollectorPortType.class);

		service = Service.create(schurl, schname);
		schport = service.getPort(CondorScheddPortType.class);

	}

	public Master requestStatus() {
		// TODO Auto-generated method stub
		return null;
	}
}
