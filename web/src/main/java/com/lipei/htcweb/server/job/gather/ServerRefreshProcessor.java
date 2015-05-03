package com.lipei.htcweb.server.job.gather;

import java.util.ArrayList;
import java.util.List;

import javax.batch.api.chunk.ItemProcessor;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

import com.lipei.htcweb.server.ServerWebService;
import com.lipei.htcweb.status.Master;

@Dependent
@Named("ServerRefreshProcessor")
public class ServerRefreshProcessor implements ItemProcessor {

	public ServerRefreshProcessor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object processItem(Object item) throws Exception {

		ArrayList<Object> result = new ArrayList<Object>();
		if (item instanceof List) {
			List<ServerWebService> list = (List<ServerWebService>) item;

			for (ServerWebService server : list) {

				Master master = server.requestMaster();
				result.add(master);
				result.addAll(server.requestStatus());

			}
		}

		return result;
	}

}
