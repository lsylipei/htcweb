package com.lipei.htcweb.status.convertor;

import java.util.HashMap;
import java.util.Map;

public enum JobUniverse {
	Unknown(0, "Unknown"), standard(1, "Standard"), vanilla(5, "Vanilla"), scheduler(7, "Scheduler"), MPI(8, "MPI"), grid(
			9, "Grid"), java(10, "Java"), parallel(11, "Parallel"), local(12, "Local"), vm(13, "VM");
	private String name;
	private int value;

	private JobUniverse(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	private static Map<Integer, JobUniverse> map = new HashMap<Integer, JobUniverse>();
	static {
		for (JobUniverse job : JobUniverse.values()) {
			map.put(job.value, job);
		}
	}

	public static JobUniverse getByValue(int value) {
		JobUniverse jobUniverse = map.get(value);
		if (jobUniverse == null) {
			return Unknown;
		}
		return jobUniverse;
	}
}
