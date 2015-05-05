package com.lipei.htcweb.server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.model.chart.MeterGaugeChartModel;

import com.lipei.htcweb.status.Startd;

public class Cluster {
	final static Logger log = Logger.getLogger(Cluster.class.getName());

	Map<Integer, Startd> slotmap = new HashMap<Integer, Startd>();

	private int cpuUsage;
	private int slotnum;
	private int usednum;
	private MeterGaugeChartModel cpuGauge;

	private Startd refStartd;

	public Cluster() {
		super();
		createCPUGauge();
	}

	public MeterGaugeChartModel getCpuGauge() {
		return cpuGauge;
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

	public void updateSlot(Startd startd) {
		slotmap.put(startd.getSlotID(), startd);
	}

	public void reset() {
		slotmap.clear();
		slotnum = 0;
		usednum = 0;
		cpuUsage = 0;
		cpuGauge.setValue(0);
	}

	public void calulate() {
		slotnum = slotmap.size();
		Collection<Startd> values = slotmap.values();
		float sum = 0;
		Startd temp = null;

		for (Startd startd : values) {
			if (StringUtils.equals(startd.getActivity(), "Busy")) {
				usednum++;
				sum += startd.getLoadAvg() > 1.0f ? 1.0f : startd.getLoadAvg();
			}
			temp = startd;
		}

		if (temp != null) {
			refStartd = temp;
		}

		if (usednum == 0) {
			cpuUsage = 0;
		} else {
			cpuUsage = (int) (100 * (sum / usednum) * (usednum / slotnum));
		}

		log.log(Level.SEVERE, refStartd.getMachine() + " cpuUsage is :" + cpuUsage);
		cpuGauge.setValue(cpuUsage);
	}

	public Startd getRefStartd() {
		return refStartd;
	}

}
