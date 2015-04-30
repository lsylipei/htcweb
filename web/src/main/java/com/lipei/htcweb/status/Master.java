package com.lipei.htcweb.status;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Master {
	@Id
	public int id;

	// @ManyToOne(fetch = FetchType.LAZY)
	// public CondorServer server;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public int getmASTER_Timestamp() {
		return mASTER_Timestamp;
	}

	public void setmASTER_Timestamp(int mASTER_Timestamp) {
		this.mASTER_Timestamp = mASTER_Timestamp;
	}

	public String getAuthenticatedIdentity() {
		return authenticatedIdentity;
	}

	public void setAuthenticatedIdentity(String authenticatedIdentity) {
		this.authenticatedIdentity = authenticatedIdentity;
	}

	public int getUpdatesSequenced() {
		return updatesSequenced;
	}

	public void setUpdatesSequenced(int updatesSequenced) {
		this.updatesSequenced = updatesSequenced;
	}

	public int getnEGOTIATOR_Timestamp() {
		return nEGOTIATOR_Timestamp;
	}

	public void setnEGOTIATOR_Timestamp(int nEGOTIATOR_Timestamp) {
		this.nEGOTIATOR_Timestamp = nEGOTIATOR_Timestamp;
	}

	public float getDaemonCoreDutyCycle() {
		return daemonCoreDutyCycle;
	}

	public void setDaemonCoreDutyCycle(float daemonCoreDutyCycle) {
		this.daemonCoreDutyCycle = daemonCoreDutyCycle;
	}

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMyType() {
		return myType;
	}

	public void setMyType(String myType) {
		this.myType = myType;
	}

	public int getsCHEDD_Timestamp() {
		return sCHEDD_Timestamp;
	}

	public void setsCHEDD_Timestamp(int sCHEDD_Timestamp) {
		this.sCHEDD_Timestamp = sCHEDD_Timestamp;
	}

	public String getMasterIpAddr() {
		return masterIpAddr;
	}

	public void setMasterIpAddr(String masterIpAddr) {
		this.masterIpAddr = masterIpAddr;
	}

	public String getCondorVersion() {
		return condorVersion;
	}

	public void setCondorVersion(String condorVersion) {
		this.condorVersion = condorVersion;
	}

	public int getsTARTD_StartTime() {
		return sTARTD_StartTime;
	}

	public void setsTARTD_StartTime(int sTARTD_StartTime) {
		this.sTARTD_StartTime = sTARTD_StartTime;
	}

	public String getCondorPlatform() {
		return condorPlatform;
	}

	public void setCondorPlatform(String condorPlatform) {
		this.condorPlatform = condorPlatform;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getMyAddress() {
		return myAddress;
	}

	public void setMyAddress(String myAddress) {
		this.myAddress = myAddress;
	}

	public int getsCHEDD_StartTime() {
		return sCHEDD_StartTime;
	}

	public void setsCHEDD_StartTime(int sCHEDD_StartTime) {
		this.sCHEDD_StartTime = sCHEDD_StartTime;
	}

	public int getLastHeardFrom() {
		return lastHeardFrom;
	}

	public void setLastHeardFrom(int lastHeardFrom) {
		this.lastHeardFrom = lastHeardFrom;
	}

	public int getDetectedCpus() {
		return detectedCpus;
	}

	public void setDetectedCpus(int detectedCpus) {
		this.detectedCpus = detectedCpus;
	}

	public int getMonitorSelfRegisteredSocketCount() {
		return monitorSelfRegisteredSocketCount;
	}

	public void setMonitorSelfRegisteredSocketCount(int monitorSelfRegisteredSocketCount) {
		this.monitorSelfRegisteredSocketCount = monitorSelfRegisteredSocketCount;
	}

	public int getsTARTD_Timestamp() {
		return sTARTD_Timestamp;
	}

	public void setsTARTD_Timestamp(int sTARTD_Timestamp) {
		this.sTARTD_Timestamp = sTARTD_Timestamp;
	}

	public int getMonitorSelfResidentSetSize() {
		return monitorSelfResidentSetSize;
	}

	public void setMonitorSelfResidentSetSize(int monitorSelfResidentSetSize) {
		this.monitorSelfResidentSetSize = monitorSelfResidentSetSize;
	}

	public String getUpdatesHistory() {
		return updatesHistory;
	}

	public void setUpdatesHistory(String updatesHistory) {
		this.updatesHistory = updatesHistory;
	}

	public float getMonitorSelfImageSize() {
		return monitorSelfImageSize;
	}

	public void setMonitorSelfImageSize(float monitorSelfImageSize) {
		this.monitorSelfImageSize = monitorSelfImageSize;
	}

	public int getMyCurrentTime() {
		return myCurrentTime;
	}

	public void setMyCurrentTime(int myCurrentTime) {
		this.myCurrentTime = myCurrentTime;
	}

	public int getMonitorSelfSecuritySessions() {
		return monitorSelfSecuritySessions;
	}

	public void setMonitorSelfSecuritySessions(int monitorSelfSecuritySessions) {
		this.monitorSelfSecuritySessions = monitorSelfSecuritySessions;
	}

	public int getDetectedMemory() {
		return detectedMemory;
	}

	public void setDetectedMemory(int detectedMemory) {
		this.detectedMemory = detectedMemory;
	}

	public int getServerTime() {
		return serverTime;
	}

	public void setServerTime(int serverTime) {
		this.serverTime = serverTime;
	}

	public int getUpdatesLost() {
		return updatesLost;
	}

	public void setUpdatesLost(int updatesLost) {
		this.updatesLost = updatesLost;
	}

	public int getDaemonStartTime() {
		return daemonStartTime;
	}

	public void setDaemonStartTime(int daemonStartTime) {
		this.daemonStartTime = daemonStartTime;
	}

	public int getUpdatesTotal() {
		return updatesTotal;
	}

	public void setUpdatesTotal(int updatesTotal) {
		this.updatesTotal = updatesTotal;
	}

	public int getnEGOTIATOR_StartTime() {
		return nEGOTIATOR_StartTime;
	}

	public void setnEGOTIATOR_StartTime(int nEGOTIATOR_StartTime) {
		this.nEGOTIATOR_StartTime = nEGOTIATOR_StartTime;
	}

	public float getRecentDaemonCoreDutyCycle() {
		return recentDaemonCoreDutyCycle;
	}

	public void setRecentDaemonCoreDutyCycle(float recentDaemonCoreDutyCycle) {
		this.recentDaemonCoreDutyCycle = recentDaemonCoreDutyCycle;
	}

	public int getUpdateSequenceNumber() {
		return updateSequenceNumber;
	}

	public void setUpdateSequenceNumber(int updateSequenceNumber) {
		this.updateSequenceNumber = updateSequenceNumber;
	}

	public int getcOLLECTOR_Timestamp() {
		return cOLLECTOR_Timestamp;
	}

	public void setcOLLECTOR_Timestamp(int cOLLECTOR_Timestamp) {
		this.cOLLECTOR_Timestamp = cOLLECTOR_Timestamp;
	}

	public int getmASTER_StartTime() {
		return mASTER_StartTime;
	}

	public void setmASTER_StartTime(int mASTER_StartTime) {
		this.mASTER_StartTime = mASTER_StartTime;
	}

	public int getMonitorSelfAge() {
		return monitorSelfAge;
	}

	public void setMonitorSelfAge(int monitorSelfAge) {
		this.monitorSelfAge = monitorSelfAge;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public float getMonitorSelfCPUUsage() {
		return monitorSelfCPUUsage;
	}

	public void setMonitorSelfCPUUsage(float monitorSelfCPUUsage) {
		this.monitorSelfCPUUsage = monitorSelfCPUUsage;
	}

	public int getcOLLECTOR_StartTime() {
		return cOLLECTOR_StartTime;
	}

	public void setcOLLECTOR_StartTime(int cOLLECTOR_StartTime) {
		this.cOLLECTOR_StartTime = cOLLECTOR_StartTime;
	}

	public int getMonitorSelfTime() {
		return monitorSelfTime;
	}

	public void setMonitorSelfTime(int monitorSelfTime) {
		this.monitorSelfTime = monitorSelfTime;
	}

}