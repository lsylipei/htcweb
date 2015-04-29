package com.lipei.htcweb.server.job;

import javax.batch.api.chunk.AbstractItemReader;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lipei.htcweb.server.ServerEJB;

@Dependent
@Named("ServerRefreshReader")
public class ServerRefreshReader extends AbstractItemReader {

	@PersistenceContext
	EntityManager em;

	@Inject
	ServerEJB serverejb;

	public ServerRefreshReader() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object readItem() throws Exception {

		return serverejb.getServerList();
	}

}
