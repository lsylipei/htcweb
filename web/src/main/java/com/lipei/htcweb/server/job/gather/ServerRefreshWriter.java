package com.lipei.htcweb.server.job.gather;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.commons.beanutils.BeanUtils;

import com.lipei.htcweb.status.Job;
import com.lipei.htcweb.status.Job_;
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
				List<Object> list = (List<Object>) object;

				for (Object obj : list) {

					if (obj instanceof Master) {
						Master master = (Master) obj;
						em.persist(obj);
						em.merge(master.getServer());
					} else if (obj instanceof Job) {
						Job job = (Job) obj;

						Job prejob = findjob(job);
						if (prejob == null) {
							em.persist(job);
						} else {
							job.setId(prejob.getId());
							job.setServer(prejob.getServer());
							BeanUtils.copyProperties(prejob, job);
						}

					} else {
						em.persist(obj);
					}

				}
			}
		}

	}

	private Job findjob(Job job) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Job> cq = cb.createQuery(Job.class);
		Root<Job> from = cq.from(Job.class);
		cq.select(from).where(cb.equal(from.get(Job_.globalJobId), job.getGlobalJobId()));

		TypedQuery<Job> query = em.createQuery(cq);
		List<Job> list = query.setMaxResults(1).getResultList();
		if (list.isEmpty()) {
			return null;
		}

		return list.get(0);
	}
}
