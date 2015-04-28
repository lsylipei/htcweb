package com.lipei.htcweb.server;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.ejb.Singleton;
import javax.inject.Named;

@Named
@Singleton
public class ServerEJB {

	private long jobid;

	@PostConstruct
	public void init() {

		JobOperator jobop = BatchRuntime.getJobOperator();

		jobid = jobop.start("ServerRefresh", new Properties());
	}

}
