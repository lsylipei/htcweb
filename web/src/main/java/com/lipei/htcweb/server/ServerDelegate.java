package com.lipei.htcweb.server;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;

import com.lipei.htcweb.data.CondorServer;
import com.lipei.htcweb.status.Master;
import com.lipei.htcweb.status.Schedd;
import com.lipei.htcweb.status.Startd;

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

	public CondorServer getServerdata() {
		return serverdata;
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

	public Master requestMaster() throws Exception {

		ClassAdStructArray ads = colport.queryMasterAds(null);

		Master obj = new Master();
		obj.setServer(serverdata);
		obj.setSerid(new Date().getTime());
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

	public List requestStatus() throws Exception {
		long time = new Date().getTime();
		ClassAdStructArray ads = colport.queryStartdAds(null);

		List<ClassAdStruct> items = ads.getItem();
		List<Object> list = new ArrayList<Object>();
		for (ClassAdStruct cads : items) {
			Startd startd = new Startd();
			startd.setSerid(time);
			dumpcads(startd, cads);
			list.add(startd);

			System.out.println("slot:" + startd.getSlotID() + " load:" + startd.getLoadAvg() + " condor:"
					+ startd.getCondorLoadAvg());
		}

		Schedd schedd = new Schedd();

		ads = colport.queryScheddAds(null);
		dumpads(ads, schedd);

		schedd.setSerid(time);
		list.add(schedd);

		return list;
	}
}
