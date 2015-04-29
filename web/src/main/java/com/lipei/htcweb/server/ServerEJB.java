package com.lipei.htcweb.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lipei.htcweb.admin.AdminEJB;
import com.lipei.htcweb.data.CondorServer;

@Named
@Singleton
@Startup
public class ServerEJB {

	private final static Logger logger = Logger.getLogger(ServerEJB.class.getName());

	private List<ServerDelegate> serverlist = Collections.synchronizedList(new ArrayList<ServerDelegate>());

	@PersistenceContext
	private EntityManager em;

	@Inject
	private AdminEJB admin;

	public ServerEJB() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() throws Exception {
		List<CondorServer> list = admin.getServerList();

		for (CondorServer condorServer : list) {
			serverlist.add(createServer(condorServer));
		}

	}

	private ServerDelegate createServer(CondorServer condorServer) throws Exception {
		ServerDelegate delegate = new ServerDelegate(condorServer);
		delegate.init();
		return delegate;
	}

	@Schedule(hour = "*", minute = "*", second = "*/50", persistent = false)
	public void startUpdateJob() {
		JobOperator op = BatchRuntime.getJobOperator();

		logger.severe("update job id:" + op.start("ServerRefresh", new Properties()));
	}

	public void add(CondorServer server) throws Exception {
		serverlist.add(createServer(server));
	}

	public List<ServerDelegate> getServerList() {
		return new ArrayList<ServerDelegate>(serverlist);
	}
}