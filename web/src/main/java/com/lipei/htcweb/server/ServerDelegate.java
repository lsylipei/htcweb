package com.lipei.htcweb.server;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;

import com.lipei.htcweb.data.CondorServer;
import com.lipei.htcweb.status.Master;

import condor.ClassAdStruct;
import condor.ClassAdStructArray;
import condor.ClassAdStructAttr;
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

	public Master requestStatus() throws Exception {

		ClassAdStructArray ads = colport.queryMasterAds(null);

		Master obj = new Master();
		// obj.setServer(serverdata);
		// dumpads(ads, obj);

		return obj;
	}

	private void dumpads(ClassAdStructArray ads, Object obj) throws Exception {

		List<ClassAdStruct> list = ads.getItem();
		for (ClassAdStruct cads : list) {
			List<ClassAdStructAttr> items = cads.getItem();
			for (ClassAdStructAttr atr : items) {
				String uncapitalize = StringUtils.uncapitalize(atr.getName());
				String value = atr.getValue();

				System.out.println(uncapitalize);
				System.out.println(value);
				System.out.println();
				BeanUtils.setProperty(obj, uncapitalize, value);
			}
		}
	}
}
