package com.lipei.htcweb.server.job;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lipei.htcweb.status.Master;

@Named("ServerRefreshWriter")
@Dependent
public class ServerRefreshWriter extends AbstractItemWriter {

	public ServerRefreshWriter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PersistenceContext
	EntityManager em;

	@Override
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public void writeItems(List<Object> items) throws Exception {
		for (Object object : items) {
			if (object instanceof List) {
				List<Master> list = (List<Master>) object;

				for (Master master : list) {
					em.persist(master);
				}
			}
		}
	}

}
