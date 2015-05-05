package com.lipei.htcweb.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.lipei.htcweb.status.AbstractClassAdsInfo_;
import com.lipei.htcweb.status.Master;

@Dependent
public class ServerDataDelegate extends AbstractServer {

	@PersistenceContext
	EntityManager em;

	private Master master;

	private HashMap<String, Cluster> clusterMap;

	public void init() {
		queryMaster();
	}

	public void update() {

	}

	private void queryMaster() {

		if (master != null) {
			return;
		}

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Object> cq = cb.createQuery();
		Root<Master> from = cq.from(Master.class);
		cq.select(from).where(cb.equal(from.get(AbstractClassAdsInfo_.server), condorServer));
		cq.orderBy(cb.desc(from.get(AbstractClassAdsInfo_.serid)));

		TypedQuery<Object> query = em.createQuery(cq);
		List<Object> list = query.setMaxResults(1).getResultList();

		if (!list.isEmpty()) {
			master = (Master) list.get(0);
		}
	}

	public Master getMaster() {
		queryMaster();
		return master;
	}

	public String getDisplayName() {
		queryMaster();

		StringBuffer buf = new StringBuffer();

		buf.append(master.getName());
		buf.append("(");

		buf.append(condorServer.getAddress());
		buf.append(":");
		buf.append(condorServer.getColPort());

		buf.append(")");
		return buf.toString();
	}

	public Map<String, Cluster> getClusterMap() {
		if (clusterMap == null) {
			clusterMap = new HashMap<String, Cluster>();
		}
		return clusterMap;
	}

	public List<Cluster> getClusters() {
		return new ArrayList<Cluster>(clusterMap.values());
	}
}
