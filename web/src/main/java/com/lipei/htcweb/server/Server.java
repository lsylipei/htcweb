package com.lipei.htcweb.server;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.spi.CDI;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Dependent
public class Server extends AbstractServer {

	private ServerWebService webservice;
	private ServerDataDelegate data;

	@PersistenceContext
	private EntityManager em;

	public void init() {
		webservice = CDI.current().select(ServerWebService.class).get();
		webservice.setCondorServer(condorServer);
		webservice.init();

		data = CDI.current().select(ServerDataDelegate.class).get();
		data.setCondorServer(condorServer);
		data.init();
	}

	public ServerWebService getWebservice() {
		return webservice;
	}

	public ServerDataDelegate getData() {
		return data;
	}
}
