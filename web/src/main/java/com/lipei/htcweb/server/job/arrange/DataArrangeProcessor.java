package com.lipei.htcweb.server.job.arrange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.batch.api.chunk.ItemProcessor;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.lipei.htcweb.server.Cluster;
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

		long slots = -1;

		Map<String, Cluster> map = server.getClusterMap();

		{
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Long> cq = cb.createQuery(Long.class);
			cq.select(cb.countDistinct(cq.from(Startd.class).get(AbstractClassAdsInfo_.serid)));
			slots = em.createQuery(cq).getSingleResult();
		}

		{
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Startd> cq = cb.createQuery(Startd.class);
			Root<Startd> from = cq.from(Startd.class);
			cq.select(from).where(cb.equal(from.get(AbstractClassAdsInfo_.server), server.getCondorServer()));
			cq.orderBy(cb.desc(from.get(AbstractClassAdsInfo_.serid)));

			TypedQuery<Startd> query = em.createQuery(cq);
			query.setMaxResults((int) (slots));

			List<Startd> list = query.getResultList();

			Collection<Cluster> clusters = map.values();
			for (Cluster cluster : clusters) {
				cluster.reset();
			}

			for (Startd startd : list) {
				Cluster cluster = map.get(startd.getMachine());
				if (cluster == null) {
					cluster = new Cluster();
					map.put(startd.getMachine(), cluster);
				}

				cluster.updateSlot(startd);
			}

			clusters = map.values();
			for (Cluster cluster : clusters) {
				cluster.calulate();
			}
		}

	}
}
