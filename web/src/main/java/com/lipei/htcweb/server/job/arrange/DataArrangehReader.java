package com.lipei.htcweb.server.job.arrange;

import java.util.ArrayList;
import java.util.List;

import javax.batch.api.chunk.AbstractItemReader;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lipei.htcweb.server.Server;
import com.lipei.htcweb.server.ServerDataDelegate;
import com.lipei.htcweb.server.ServerEJB;

@Dependent
@Named("DataArrangehReader")
public class DataArrangehReader extends AbstractItemReader {

	@PersistenceContext
	EntityManager em;

	@Inject
	ServerEJB serverejb;

	private boolean firsttime = true;

	public DataArrangehReader() {
		super();
	}

	@Override
	public Object readItem() throws Exception {
		if (firsttime) {
			firsttime = false;
			List<Server> serverList = serverejb.getServerList();

			ArrayList<ServerDataDelegate> temp = new ArrayList<ServerDataDelegate>();
			for (Server server : serverList) {
				temp.add(server.getData());
			}
			return temp;
		} else {
			return null;
		}

	}

}
