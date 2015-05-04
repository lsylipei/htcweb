package com.lipei.htcweb.server.job.arrange;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lipei.htcweb.status.Master;

@Named("DataArrangeWriter")
@Dependent
public class DataArrangeWriter extends AbstractItemWriter {

	public DataArrangeWriter() {
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
				List<Object> list = (List<Object>) object;

				for (Object obj : list) {
					em.persist(obj);
					if (obj instanceof Master) {
						Master master = (Master) obj;
						em.merge(master.getServer());
					}
				}
			}
		}

	}

}
