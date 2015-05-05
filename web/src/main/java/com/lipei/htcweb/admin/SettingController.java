package com.lipei.htcweb.admin;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import com.lipei.htcweb.data.CondorServer;

@Named
@RequestScoped
public class SettingController {
	private String address;
	private int colPort;

	private int schPort;

	@Inject
	AdminEJB admin;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getColPort() {
		return colPort;
	}

	public void setColPort(int port) {
		this.colPort = port;
	}

	public void addServer() throws Exception {
		CondorServer server = admin.addServer(address, colPort, schPort);
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
	}

	public int getSchPort() {
		return schPort;
	}

	public void setSchPort(int schPort) {
		this.schPort = schPort;
	}
}
