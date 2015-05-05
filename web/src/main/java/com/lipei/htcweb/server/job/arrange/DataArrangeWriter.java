package com.lipei.htcweb.server.job.arrange;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

	}

}
