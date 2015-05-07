package com.lipei.htcweb.status.convertor;

import java.util.HashMap;
import java.util.Map;

public enum JobStatus {
	Unknown(0, "Unknown"), Idle(1, "Idle"), Running(2, "Running"), Removed(3, "Removed"), Completed(4, "Completed"), Held(
			5, "Held"), Transferring(6, "Transferring Output"), Suspended(7, "Suspended");
	private String name;
	private int value;

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	private JobStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}

	private static Map<Integer, JobStatus> map = new HashMap<Integer, JobStatus>();
	static {
		for (JobStatus job : JobStatus.values()) {
			map.put(job.value, job);
		}
	}

	public static JobStatus getByValue(int value) {
		JobStatus jobStatus = map.get(value);
		if (jobStatus == null) {
			return Unknown;
		}
		return jobStatus;
	}
}
