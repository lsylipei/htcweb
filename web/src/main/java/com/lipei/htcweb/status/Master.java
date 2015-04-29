package com.lipei.htcweb.status;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.lipei.htcweb.data.CondorServer;

@Entity
public class Master {
	@Id
	public int id;

	@ManyToOne(fetch = FetchType.LAZY)
	public CondorServer server;

	public long index;

	// generate
	public int mASTER_Timestamp;
	public String authenticatedIdentity;
	public int updatesSequenced;
	public int nEGOTIATOR_Timestamp;
	public float daemonCoreDutyCycle;
	public String machine;
	public String name;
	public String myType;
	public int sCHEDD_Timestamp;
	public String masterIpAddr;
	public String condorVersion;
	public int sTARTD_StartTime;
	public String condorPlatform;
	public String targetType;
	public String myAddress;
	public int sCHEDD_StartTime;
	public int lastHeardFrom;
	public int detectedCpus;
	public int monitorSelfRegisteredSocketCount;
	public int sTARTD_Timestamp;
	public int monitorSelfResidentSetSize;
	public String updatesHistory;
	public float monitorSelfImageSize;
	public int myCurrentTime;
	public int monitorSelfSecuritySessions;
	public int detectedMemory;
	public int serverTime;
	public int updatesLost;
	public int daemonStartTime;
	public int updatesTotal;
	public int nEGOTIATOR_StartTime;
	public float recentDaemonCoreDutyCycle;
	public int updateSequenceNumber;
	public int cOLLECTOR_Timestamp;
	public int mASTER_StartTime;
	public int monitorSelfAge;
	public String currentTime;
	public float monitorSelfCPUUsage;
	public int cOLLECTOR_StartTime;
	public int monitorSelfTime;
}