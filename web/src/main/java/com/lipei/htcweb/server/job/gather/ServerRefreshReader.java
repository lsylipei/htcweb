package com.lipei.htcweb.server.job.gather;

import java.util.ArrayList;
import java.util.List;

import javax.batch.api.chunk.AbstractItemReader;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lipei.htcweb.server.Server;
import com.lipei.htcweb.server.ServerEJB;
import com.lipei.htcweb.server.ServerWebService;

@Dependent
@Named("ServerRefreshReader")
public class ServerRefreshReader extends AbstractItemReader {

	@PersistenceContext
	EntityManager em;

	@Inject
	ServerEJB serverejb;

	private boolean firsttime = true;

	public ServerRefreshReader() {
		super();
	}

	@Override
	public Object readItem() throws Exception {
		if (firsttime) {
			firsttime = false;
			List<Server> serverList = serverejb.getServerList();

			ArrayList<ServerWebService> temp = new ArrayList<ServerWebService>();
			for (Server server : serverList) {
				temp.add(server.getWebservice());
			}
			return temp;
		} else {
			return null;
		}

	}

}
