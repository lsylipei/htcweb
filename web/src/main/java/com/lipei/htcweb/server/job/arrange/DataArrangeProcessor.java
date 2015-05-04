package com.lipei.htcweb.server.job.arrange;

import java.util.ArrayList;
import java.util.List;

import javax.batch.api.chunk.ItemProcessor;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.lipei.htcweb.server.ServerDataDelegate;
import com.lipei.htcweb.status.AbstractClassAdsInfo_;
import com.lipei.htcweb.status.Startd;

@Dependent
@Named("DataArrangeProcessor")
public class DataArrangeProcessor implements ItemProcessor {

	@PersistenceContext
	private EntityManager em;

	public DataArrangeProcessor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object processItem(Object item) throws Exception {

		ArrayList<Object> result = new ArrayList<Object>();
		if (item instanceof List) {
			List<ServerDataDelegate> list = (List<ServerDataDelegate>) item;

			for (ServerDataDelegate server : list) {

				updateCPU(server);

			}
		}

		return result;
	}

	private void updateCPU(ServerDataDelegate server) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Object> cq = cb.createQuery();
		Root<Startd> from = cq.from(Startd.class);
		cq.select(from).where(cb.equal(from.get(AbstractClassAdsInfo_.server), server.getCondorServer()));
		cq.orderBy(cb.desc(from.get(AbstractClassAdsInfo_.serid)));

		TypedQuery<Object> query = em.createQuery(cq);
		// query.set

	}

}
