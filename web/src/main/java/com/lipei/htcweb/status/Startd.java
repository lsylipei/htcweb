package com.lipei.htcweb.status;

import javax.persistence.Entity;

@Entity
public class Startd extends AbstractClassAdsInfo {

	public String activity;
	public boolean canHibernate;
	public int clockDay;
	public int clockMin;
	public float condorLoadAvg;
	public int consoleIdle;
	public int cpuBusyTime;
	public boolean cpuIsBusy;
	public int cpus;
	public float currentRank;
	public int enteredCurrentActivity;
	public int enteredCurrentState;
//	public String hardwareAddress;
//	public boolean has_none;
//	public boolean hasFileTransfer;
//	public String hasFileTransferPluginMethods;
	public boolean hasIOProxy;
	public boolean hasJava;
	public boolean hasJICLocalConfig;
	public boolean hasJICLocalStdin;
	public boolean hasJobDeferral;
	public boolean hasMPI;
	public boolean hasPerFileEncryption;
	public boolean hasReconnect;
	public boolean hasTDP;
	public boolean hasVM;
	public boolean hasWindowsRunAsOwner;
//	public int hibernationLevel;
//	public String hibernationState;
//	public String hibernationSupportedStates;
//	public boolean isLocalStartd;
//	public boolean isWakeAble;
//	public boolean isWakeOnLanEnabled;
//	public boolean isWakeOnLanSupported;
//	public float javaMFlops;
//	public String javaSpecificationVersion;
//	public String javaVendor;
//	public String javaVersion;
//	public int jobPreemptions;
//	public int jobRankPreemptions;
//	public int jobStarts;
//	public int jobUserPrioPreemptions;
//	public int keyboardIdle;
//	public int lastBenchmark;
//	public int lastFetchWorkCompleted;
//	public int lastFetchWorkSpawned;
	public int lastHeardFrom;
	public float loadAvg;
//	public String machine;
	public String machineMaxVacateTime;
	public String machineResources;
//	public int maxJobRetirementTime;
	public int memory;
	public int monitorSelfAge;
//	public float monitorSelfCPUUsage;
//	public float monitorSelfImageSize;
//	public int monitorSelfRegisteredSocketCount;
//	public int monitorSelfResidentSetSize;
//	public int monitorSelfSecuritySessions;
//	public int monitorSelfTime;
//	public String myAddress;
//	public int myCurrentTime;
//	public String myType;
	public String name;
//	public int nextFetchWorkDelay;
//	public int numPids;
//	public String opSys;
//	public String opSysAndVer;
//	public String opSysLegacy;
//	public String opSysLongName;
//	public int opSysMajorVer;
//	public String opSysName;
//	public String opSysShortName;
//	public int opSysVer;
//	public float rank;
//	public float recentDaemonCoreDutyCycle;
//	public int recentJobPreemptions;
//	public int recentJobRankPreemptions;
//	public int recentJobStarts;
//	public int recentJobUserPrioPreemptions;
//	public String requirements;
//	public int retirementTimeRemaining;
//	public int serverTime;
	public int slotID;
	public String slotType;
	public int slotTypeID;
	public String slotWeight;
	public boolean start;
	public String startdIpAddr;
	public String starterAbilityList;
	public String state;
//	public String subnetMask;
	public String targetType;
	public int timeToLive;
	public float totalCondorLoadAvg;
//	public float totalCpus;
//	public int totalDisk;
//	public float totalLoadAvg;
//	public int totalMemory;
//	public int totalSlotCpus;
//	public float totalSlotDisk;
//	public int totalSlotMemory;
//	public int totalSlots;
//	public int totalTimeOwnerIdle;
//	public int totalTimeUnclaimedBenchmarking;
//	public int totalTimeUnclaimedIdle;
//	public int totalVirtualMemory;
//	public String uidDomain;
//	public String unhibernate;
//	public int updateSequenceNumber;
//	public String updatesHistory;
	public int updatesLost;

//	public int updatesSequenced;
//	public int updatesTotal;
//	public int virtualMemory;
//	public String wakeOnLanEnabledFlags;
//	public String wakeOnLanSupportedFlags;
//	public int windowsBuildNumber;
//	public int windowsMajorVersion;
//	public int windowsMinorVersion;
//	public int windowsProductType;
//	public int windowsServicePackMajorVersion;
//	public int windowsServicePackMinorVersion;

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public boolean isCanHibernate() {
		return canHibernate;
	}

	public void setCanHibernate(boolean canHibernate) {
		this.canHibernate = canHibernate;
	}

	public int getClockDay() {
		return clockDay;
	}

	public void setClockDay(int clockDay) {
		this.clockDay = clockDay;
	}

	public int getClockMin() {
		return clockMin;
	}

	public void setClockMin(int clockMin) {
		this.clockMin = clockMin;
	}

	public float getCondorLoadAvg() {
		return condorLoadAvg;
	}

	public void setCondorLoadAvg(float condorLoadAvg) {
		this.condorLoadAvg = condorLoadAvg;
	}

	public int getConsoleIdle() {
		return consoleIdle;
	}

	public void setConsoleIdle(int consoleIdle) {
		this.consoleIdle = consoleIdle;
	}

	public int getCpuBusyTime() {
		return cpuBusyTime;
	}

	public void setCpuBusyTime(int cpuBusyTime) {
		this.cpuBusyTime = cpuBusyTime;
	}

	public boolean isCpuIsBusy() {
		return cpuIsBusy;
	}

	public void setCpuIsBusy(boolean cpuIsBusy) {
		this.cpuIsBusy = cpuIsBusy;
	}

	public int getCpus() {
		return cpus;
	}

	public void setCpus(int cpus) {
		this.cpus = cpus;
	}

	public float getCurrentRank() {
		return currentRank;
	}

	public void setCurrentRank(float currentRank) {
		this.currentRank = currentRank;
	}

	public int getEnteredCurrentActivity() {
		return enteredCurrentActivity;
	}

	public void setEnteredCurrentActivity(int enteredCurrentActivity) {
		this.enteredCurrentActivity = enteredCurrentActivity;
	}

	public int getEnteredCurrentState() {
		return enteredCurrentState;
	}

	public void setEnteredCurrentState(int enteredCurrentState) {
		this.enteredCurrentState = enteredCurrentState;
	}

	public boolean isHasIOProxy() {
		return hasIOProxy;
	}

	public void setHasIOProxy(boolean hasIOProxy) {
		this.hasIOProxy = hasIOProxy;
	}

	public boolean isHasJava() {
		return hasJava;
	}

	public void setHasJava(boolean hasJava) {
		this.hasJava = hasJava;
	}

	public boolean isHasJICLocalConfig() {
		return hasJICLocalConfig;
	}

	public void setHasJICLocalConfig(boolean hasJICLocalConfig) {
		this.hasJICLocalConfig = hasJICLocalConfig;
	}

	public boolean isHasJICLocalStdin() {
		return hasJICLocalStdin;
	}

	public void setHasJICLocalStdin(boolean hasJICLocalStdin) {
		this.hasJICLocalStdin = hasJICLocalStdin;
	}

	public boolean isHasJobDeferral() {
		return hasJobDeferral;
	}

	public void setHasJobDeferral(boolean hasJobDeferral) {
		this.hasJobDeferral = hasJobDeferral;
	}

	public boolean isHasMPI() {
		return hasMPI;
	}

	public void setHasMPI(boolean hasMPI) {
		this.hasMPI = hasMPI;
	}

	public boolean isHasPerFileEncryption() {
		return hasPerFileEncryption;
	}

	public void setHasPerFileEncryption(boolean hasPerFileEncryption) {
		this.hasPerFileEncryption = hasPerFileEncryption;
	}

	public boolean isHasReconnect() {
		return hasReconnect;
	}

	public void setHasReconnect(boolean hasReconnect) {
		this.hasReconnect = hasReconnect;
	}

	public boolean isHasTDP() {
		return hasTDP;
	}

	public void setHasTDP(boolean hasTDP) {
		this.hasTDP = hasTDP;
	}

	public boolean isHasVM() {
		return hasVM;
	}

	public void setHasVM(boolean hasVM) {
		this.hasVM = hasVM;
	}

	public boolean isHasWindowsRunAsOwner() {
		return hasWindowsRunAsOwner;
	}

	public void setHasWindowsRunAsOwner(boolean hasWindowsRunAsOwner) {
		this.hasWindowsRunAsOwner = hasWindowsRunAsOwner;
	}

	public int getLastHeardFrom() {
		return lastHeardFrom;
	}

	public void setLastHeardFrom(int lastHeardFrom) {
		this.lastHeardFrom = lastHeardFrom;
	}

	public float getLoadAvg() {
		return loadAvg;
	}

	public void setLoadAvg(float loadAvg) {
		this.loadAvg = loadAvg;
	}

	public String getMachineMaxVacateTime() {
		return machineMaxVacateTime;
	}

	public void setMachineMaxVacateTime(String machineMaxVacateTime) {
		this.machineMaxVacateTime = machineMaxVacateTime;
	}

	public String getMachineResources() {
		return machineResources;
	}

	public void setMachineResources(String machineResources) {
		this.machineResources = machineResources;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getMonitorSelfAge() {
		return monitorSelfAge;
	}

	public void setMonitorSelfAge(int monitorSelfAge) {
		this.monitorSelfAge = monitorSelfAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSlotID() {
		return slotID;
	}

	public void setSlotID(int slotID) {
		this.slotID = slotID;
	}

	public String getSlotType() {
		return slotType;
	}

	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}

	public int getSlotTypeID() {
		return slotTypeID;
	}

	public void setSlotTypeID(int slotTypeID) {
		this.slotTypeID = slotTypeID;
	}

	public String getSlotWeight() {
		return slotWeight;
	}

	public void setSlotWeight(String slotWeight) {
		this.slotWeight = slotWeight;
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public String getStartdIpAddr() {
		return startdIpAddr;
	}

	public void setStartdIpAddr(String startdIpAddr) {
		this.startdIpAddr = startdIpAddr;
	}

	public String getStarterAbilityList() {
		return starterAbilityList;
	}

	public void setStarterAbilityList(String starterAbilityList) {
		this.starterAbilityList = starterAbilityList;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public int getTimeToLive() {
		return timeToLive;
	}

	public void setTimeToLive(int timeToLive) {
		this.timeToLive = timeToLive;
	}

	public float getTotalCondorLoadAvg() {
		return totalCondorLoadAvg;
	}

	public void setTotalCondorLoadAvg(float totalCondorLoadAvg) {
		this.totalCondorLoadAvg = totalCondorLoadAvg;
	}

	public int getUpdatesLost() {
		return updatesLost;
	}

	public void setUpdatesLost(int updatesLost) {
		this.updatesLost = updatesLost;
	}

}