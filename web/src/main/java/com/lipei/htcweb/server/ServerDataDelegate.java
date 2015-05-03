package com.lipei.htcweb.server;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.primefaces.model.chart.MeterGaugeChartModel;

import com.lipei.htcweb.status.AbstractClassAdsInfo_;
import com.lipei.htcweb.status.Master;

@Dependent
public class ServerDataDelegate extends AbstractServer {

	@PersistenceContext
	EntityManager em;

	private Master master;

	private MeterGaugeChartModel cpuGauge;

	public void init() {

		queryMaster();
		createCPUGauge();
	}

	public void update() {

	}

	private void createCPUGauge() {
		ArrayList<Number> intervals = new ArrayList<Number>();
		intervals.add(0);
		intervals.add(20);
		intervals.add(40);
		intervals.add(60);
		intervals.add(80);
		intervals.add(100);
		cpuGauge = new MeterGaugeChartModel(100, intervals);

		cpuGauge.setTitle("CPU utilize");
		cpuGauge.setGaugeLabel("%");
		cpuGauge.setValue(0);
	}

	public MeterGaugeChartModel getCpuGauge() {
		return cpuGauge;
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
		buf.append(condorServer.getPort());

		buf.append(")");
		return buf.toString();
	}
}
