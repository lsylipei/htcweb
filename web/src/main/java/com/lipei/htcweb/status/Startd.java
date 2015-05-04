package com.lipei.htcweb.status;

import javax.persistence.Entity;

@Entity
public class Startd extends AbstractClassAdsInfo {

	public String activity;
	public String arch;
	public String authenticatedIdentity;
	public boolean canHibernate;
	public String checkpointPlatform;
	public int clockDay;
	public int clockMin;
	public String cOLLECTOR_HOST_STRING;
	public float condorLoadAvg;
	public String condorPlatform;
	public String condorVersion;
	public int consoleIdle;
	public String cpuBusy;
	public int cpuBusyTime;
	public boolean cpuIsBusy;
	public int cpus;
	public float currentRank;
	public String currentTime;
	public float daemonCoreDutyCycle;
	public int daemonStartTime;
	public int detectedCpus;
	public int detectedMemory;
	public int disk;
	public String dotNetVersions;
	public int enteredCurrentActivity;
	public int enteredCurrentState;
	public int expectedMachineGracefulDrainingBadput;
	public int expectedMachineGracefulDrainingCompletion;
	public int expectedMachineQuickDrainingBadput;
	public int expectedMachineQuickDrainingCompletion;
	public String fileSystemDomain;
	public String hardwareAddress;
	public boolean has_none;
	public boolean hasFileTransfer;
	public String hasFileTransferPluginMethods;
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
	public int hibernationLevel;
	public String hibernationState;
	public String hibernationSupportedStates;
	public boolean isLocalStartd;
	public String isValidCheckpointPlatform;
	public boolean isWakeAble;
	public boolean isWakeOnLanEnabled;
	public boolean isWakeOnLanSupported;
	public float javaMFlops;
	public String javaSpecificationVersion;
	public String javaVendor;
	public String javaVersion;
	public int jobPreemptions;
	public int jobRankPreemptions;
	public int jobStarts;
	public int jobUserPrioPreemptions;
	public int keyboardIdle;
	public int lastBenchmark;
	public int lastFetchWorkCompleted;
	public int lastFetchWorkSpawned;
	public int lastHeardFrom;
	public float loadAvg;
	public String machine;
	public String machineMaxVacateTime;
	public String machineResources;
	public int maxJobRetirementTime;
	public int memory;
	public int monitorSelfAge;
	public float monitorSelfCPUUsage;
	public float monitorSelfImageSize;
	public int monitorSelfRegisteredSocketCount;
	public int monitorSelfResidentSetSize;
	public int monitorSelfSecuritySessions;
	public int monitorSelfTime;
	public String myAddress;
	public int myCurrentTime;
	public String myType;
	public String name;
	public int nextFetchWorkDelay;
	public int numPids;
	public String opSys;
	public String opSysAndVer;
	public String opSysLegacy;
	public String opSysLongName;
	public int opSysMajorVer;
	public String opSysName;
	public String opSysShortName;
	public int opSysVer;
	public float rank;
	public float recentDaemonCoreDutyCycle;
	public int recentJobPreemptions;
	public int recentJobRankPreemptions;
	public int recentJobStarts;
	public int recentJobUserPrioPreemptions;
	public String requirements;
	public int retirementTimeRemaining;
	public int serverTime;
	public int slotID;
	public String slotType;
	public int slotTypeID;
	public String slotWeight;
	public boolean start;
	public String startdIpAddr;
	public String starterAbilityList;
	public String state;
	public String subnetMask;
	public String targetType;
	public int timeToLive;
	public float totalCondorLoadAvg;
	public float totalCpus;
	public int totalDisk;
	public float totalLoadAvg;
	public int totalMemory;
	public int totalSlotCpus;
	public float totalSlotDisk;
	public int totalSlotMemory;
	public int totalSlots;
	public int totalTimeOwnerIdle;
	public int totalTimeUnclaimedBenchmarking;
	public int totalTimeUnclaimedIdle;
	public int totalVirtualMemory;
	public String uidDomain;
	public String unhibernate;
	public int updateSequenceNumber;
	public String updatesHistory;

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getArch() {
		return arch;
	}

	public void setArch(String arch) {
		this.arch = arch;
	}

	public String getAuthenticatedIdentity() {
		return authenticatedIdentity;
	}

	public void setAuthenticatedIdentity(String authenticatedIdentity) {
		this.authenticatedIdentity = authenticatedIdentity;
	}

	public boolean isCanHibernate() {
		return canHibernate;
	}

	public void setCanHibernate(boolean canHibernate) {
		this.canHibernate = canHibernate;
	}

	public String getCheckpointPlatform() {
		return checkpointPlatform;
	}

	public void setCheckpointPlatform(String checkpointPlatform) {
		this.checkpointPlatform = checkpointPlatform;
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

	public String getcOLLECTOR_HOST_STRING() {
		return cOLLECTOR_HOST_STRING;
	}

	public void setcOLLECTOR_HOST_STRING(String cOLLECTOR_HOST_STRING) {
		this.cOLLECTOR_HOST_STRING = cOLLECTOR_HOST_STRING;
	}

	public float getCondorLoadAvg() {
		return condorLoadAvg;
	}

	public void setCondorLoadAvg(float condorLoadAvg) {
		this.condorLoadAvg = condorLoadAvg;
	}

	public String getCondorPlatform() {
		return condorPlatform;
	}

	public void setCondorPlatform(String condorPlatform) {
		this.condorPlatform = condorPlatform;
	}

	public String getCondorVersion() {
		return condorVersion;
	}

	public void setCondorVersion(String condorVersion) {
		this.condorVersion = condorVersion;
	}

	public int getConsoleIdle() {
		return consoleIdle;
	}

	public void setConsoleIdle(int consoleIdle) {
		this.consoleIdle = consoleIdle;
	}

	public String getCpuBusy() {
		return cpuBusy;
	}

	public void setCpuBusy(String cpuBusy) {
		this.cpuBusy = cpuBusy;
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

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public float getDaemonCoreDutyCycle() {
		return daemonCoreDutyCycle;
	}

	public void setDaemonCoreDutyCycle(float daemonCoreDutyCycle) {
		this.daemonCoreDutyCycle = daemonCoreDutyCycle;
	}

	public int getDaemonStartTime() {
		return daemonStartTime;
	}

	public void setDaemonStartTime(int daemonStartTime) {
		this.daemonStartTime = daemonStartTime;
	}

	public int getDetectedCpus() {
		return detectedCpus;
	}

	public void setDetectedCpus(int detectedCpus) {
		this.detectedCpus = detectedCpus;
	}

	public int getDetectedMemory() {
		return detectedMemory;
	}

	public void setDetectedMemory(int detectedMemory) {
		this.detectedMemory = detectedMemory;
	}

	public int getDisk() {
		return disk;
	}

	public void setDisk(int disk) {
		this.disk = disk;
	}

	public String getDotNetVersions() {
		return dotNetVersions;
	}

	public void setDotNetVersions(String dotNetVersions) {
		this.dotNetVersions = dotNetVersions;
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

	public int getExpectedMachineGracefulDrainingBadput() {
		return expectedMachineGracefulDrainingBadput;
	}

	public void setExpectedMachineGracefulDrainingBadput(int expectedMachineGracefulDrainingBadput) {
		this.expectedMachineGracefulDrainingBadput = expectedMachineGracefulDrainingBadput;
	}

	public int getExpectedMachineGracefulDrainingCompletion() {
		return expectedMachineGracefulDrainingCompletion;
	}

	public void setExpectedMachineGracefulDrainingCompletion(int expectedMachineGracefulDrainingCompletion) {
		this.expectedMachineGracefulDrainingCompletion = expectedMachineGracefulDrainingCompletion;
	}

	public int getExpectedMachineQuickDrainingBadput() {
		return expectedMachineQuickDrainingBadput;
	}

	public void setExpectedMachineQuickDrainingBadput(int expectedMachineQuickDrainingBadput) {
		this.expectedMachineQuickDrainingBadput = expectedMachineQuickDrainingBadput;
	}

	public int getExpectedMachineQuickDrainingCompletion() {
		return expectedMachineQuickDrainingCompletion;
	}

	public void setExpectedMachineQuickDrainingCompletion(int expectedMachineQuickDrainingCompletion) {
		this.expectedMachineQuickDrainingCompletion = expectedMachineQuickDrainingCompletion;
	}

	public String getFileSystemDomain() {
		return fileSystemDomain;
	}

	public void setFileSystemDomain(String fileSystemDomain) {
		this.fileSystemDomain = fileSystemDomain;
	}

	public String getHardwareAddress() {
		return hardwareAddress;
	}

	public void setHardwareAddress(String hardwareAddress) {
		this.hardwareAddress = hardwareAddress;
	}

	public boolean isHas_none() {
		return has_none;
	}

	public void setHas_none(boolean has_none) {
		this.has_none = has_none;
	}

	public boolean isHasFileTransfer() {
		return hasFileTransfer;
	}

	public void setHasFileTransfer(boolean hasFileTransfer) {
		this.hasFileTransfer = hasFileTransfer;
	}

	public String getHasFileTransferPluginMethods() {
		return hasFileTransferPluginMethods;
	}

	public void setHasFileTransferPluginMethods(String hasFileTransferPluginMethods) {
		this.hasFileTransferPluginMethods = hasFileTransferPluginMethods;
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

	public int getHibernationLevel() {
		return hibernationLevel;
	}

	public void setHibernationLevel(int hibernationLevel) {
		this.hibernationLevel = hibernationLevel;
	}

	public String getHibernationState() {
		return hibernationState;
	}

	public void setHibernationState(String hibernationState) {
		this.hibernationState = hibernationState;
	}

	public String getHibernationSupportedStates() {
		return hibernationSupportedStates;
	}

	public void setHibernationSupportedStates(String hibernationSupportedStates) {
		this.hibernationSupportedStates = hibernationSupportedStates;
	}

	public boolean isLocalStartd() {
		return isLocalStartd;
	}

	public void setLocalStartd(boolean isLocalStartd) {
		this.isLocalStartd = isLocalStartd;
	}

	public String getIsValidCheckpointPlatform() {
		return isValidCheckpointPlatform;
	}

	public void setIsValidCheckpointPlatform(String isValidCheckpointPlatform) {
		this.isValidCheckpointPlatform = isValidCheckpointPlatform;
	}

	public boolean isWakeAble() {
		return isWakeAble;
	}

	public void setWakeAble(boolean isWakeAble) {
		this.isWakeAble = isWakeAble;
	}

	public boolean isWakeOnLanEnabled() {
		return isWakeOnLanEnabled;
	}

	public void setWakeOnLanEnabled(boolean isWakeOnLanEnabled) {
		this.isWakeOnLanEnabled = isWakeOnLanEnabled;
	}

	public boolean isWakeOnLanSupported() {
		return isWakeOnLanSupported;
	}

	public void setWakeOnLanSupported(boolean isWakeOnLanSupported) {
		this.isWakeOnLanSupported = isWakeOnLanSupported;
	}

	public float getJavaMFlops() {
		return javaMFlops;
	}

	public void setJavaMFlops(float javaMFlops) {
		this.javaMFlops = javaMFlops;
	}

	public String getJavaSpecificationVersion() {
		return javaSpecificationVersion;
	}

	public void setJavaSpecificationVersion(String javaSpecificationVersion) {
		this.javaSpecificationVersion = javaSpecificationVersion;
	}

	public String getJavaVendor() {
		return javaVendor;
	}

	public void setJavaVendor(String javaVendor) {
		this.javaVendor = javaVendor;
	}

	public String getJavaVersion() {
		return javaVersion;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public int getJobPreemptions() {
		return jobPreemptions;
	}

	public void setJobPreemptions(int jobPreemptions) {
		this.jobPreemptions = jobPreemptions;
	}

	public int getJobRankPreemptions() {
		return jobRankPreemptions;
	}

	public void setJobRankPreemptions(int jobRankPreemptions) {
		this.jobRankPreemptions = jobRankPreemptions;
	}

	public int getJobStarts() {
		return jobStarts;
	}

	public void setJobStarts(int jobStarts) {
		this.jobStarts = jobStarts;
	}

	public int getJobUserPrioPreemptions() {
		return jobUserPrioPreemptions;
	}

	public void setJobUserPrioPreemptions(int jobUserPrioPreemptions) {
		this.jobUserPrioPreemptions = jobUserPrioPreemptions;
	}

	public int getKeyboardIdle() {
		return keyboardIdle;
	}

	public void setKeyboardIdle(int keyboardIdle) {
		this.keyboardIdle = keyboardIdle;
	}

	public int getLastBenchmark() {
		return lastBenchmark;
	}

	public void setLastBenchmark(int lastBenchmark) {
		this.lastBenchmark = lastBenchmark;
	}

	public int getLastFetchWorkCompleted() {
		return lastFetchWorkCompleted;
	}

	public void setLastFetchWorkCompleted(int lastFetchWorkCompleted) {
		this.lastFetchWorkCompleted = lastFetchWorkCompleted;
	}

	public int getLastFetchWorkSpawned() {
		return lastFetchWorkSpawned;
	}

	public void setLastFetchWorkSpawned(int lastFetchWorkSpawned) {
		this.lastFetchWorkSpawned = lastFetchWorkSpawned;
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

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
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

	public int getMaxJobRetirementTime() {
		return maxJobRetirementTime;
	}

	public void setMaxJobRetirementTime(int maxJobRetirementTime) {
		this.maxJobRetirementTime = maxJobRetirementTime;
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

	public float getMonitorSelfCPUUsage() {
		return monitorSelfCPUUsage;
	}

	public void setMonitorSelfCPUUsage(float monitorSelfCPUUsage) {
		this.monitorSelfCPUUsage = monitorSelfCPUUsage;
	}

	public float getMonitorSelfImageSize() {
		return monitorSelfImageSize;
	}

	public void setMonitorSelfImageSize(float monitorSelfImageSize) {
		this.monitorSelfImageSize = monitorSelfImageSize;
	}

	public int getMonitorSelfRegisteredSocketCount() {
		return monitorSelfRegisteredSocketCount;
	}

	public void setMonitorSelfRegisteredSocketCount(int monitorSelfRegisteredSocketCount) {
		this.monitorSelfRegisteredSocketCount = monitorSelfRegisteredSocketCount;
	}

	public int getMonitorSelfResidentSetSize() {
		return monitorSelfResidentSetSize;
	}

	public void setMonitorSelfResidentSetSize(int monitorSelfResidentSetSize) {
		this.monitorSelfResidentSetSize = monitorSelfResidentSetSize;
	}

	public int getMonitorSelfSecuritySessions() {
		return monitorSelfSecuritySessions;
	}

	public void setMonitorSelfSecuritySessions(int monitorSelfSecuritySessions) {
		this.monitorSelfSecuritySessions = monitorSelfSecuritySessions;
	}

	public int getMonitorSelfTime() {
		return monitorSelfTime;
	}

	public void setMonitorSelfTime(int monitorSelfTime) {
		this.monitorSelfTime = monitorSelfTime;
	}

	public String getMyAddress() {
		return myAddress;
	}

	public void setMyAddress(String myAddress) {
		this.myAddress = myAddress;
	}

	public int getMyCurrentTime() {
		return myCurrentTime;
	}

	public void setMyCurrentTime(int myCurrentTime) {
		this.myCurrentTime = myCurrentTime;
	}

	public String getMyType() {
		return myType;
	}

	public void setMyType(String myType) {
		this.myType = myType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNextFetchWorkDelay() {
		return nextFetchWorkDelay;
	}

	public void setNextFetchWorkDelay(int nextFetchWorkDelay) {
		this.nextFetchWorkDelay = nextFetchWorkDelay;
	}

	public int getNumPids() {
		return numPids;
	}

	public void setNumPids(int numPids) {
		this.numPids = numPids;
	}

	public String getOpSys() {
		return opSys;
	}

	public void setOpSys(String opSys) {
		this.opSys = opSys;
	}

	public String getOpSysAndVer() {
		return opSysAndVer;
	}

	public void setOpSysAndVer(String opSysAndVer) {
		this.opSysAndVer = opSysAndVer;
	}

	public String getOpSysLegacy() {
		return opSysLegacy;
	}

	public void setOpSysLegacy(String opSysLegacy) {
		this.opSysLegacy = opSysLegacy;
	}

	public String getOpSysLongName() {
		return opSysLongName;
	}

	public void setOpSysLongName(String opSysLongName) {
		this.opSysLongName = opSysLongName;
	}

	public int getOpSysMajorVer() {
		return opSysMajorVer;
	}

	public void setOpSysMajorVer(int opSysMajorVer) {
		this.opSysMajorVer = opSysMajorVer;
	}

	public String getOpSysName() {
		return opSysName;
	}

	public void setOpSysName(String opSysName) {
		this.opSysName = opSysName;
	}

	public String getOpSysShortName() {
		return opSysShortName;
	}

	public void setOpSysShortName(String opSysShortName) {
		this.opSysShortName = opSysShortName;
	}

	public int getOpSysVer() {
		return opSysVer;
	}

	public void setOpSysVer(int opSysVer) {
		this.opSysVer = opSysVer;
	}

	public float getRank() {
		return rank;
	}

	public void setRank(float rank) {
		this.rank = rank;
	}

	public float getRecentDaemonCoreDutyCycle() {
		return recentDaemonCoreDutyCycle;
	}

	public void setRecentDaemonCoreDutyCycle(float recentDaemonCoreDutyCycle) {
		this.recentDaemonCoreDutyCycle = recentDaemonCoreDutyCycle;
	}

	public int getRecentJobPreemptions() {
		return recentJobPreemptions;
	}

	public void setRecentJobPreemptions(int recentJobPreemptions) {
		this.recentJobPreemptions = recentJobPreemptions;
	}

	public int getRecentJobRankPreemptions() {
		return recentJobRankPreemptions;
	}

	public void setRecentJobRankPreemptions(int recentJobRankPreemptions) {
		this.recentJobRankPreemptions = recentJobRankPreemptions;
	}

	public int getRecentJobStarts() {
		return recentJobStarts;
	}

	public void setRecentJobStarts(int recentJobStarts) {
		this.recentJobStarts = recentJobStarts;
	}

	public int getRecentJobUserPrioPreemptions() {
		return recentJobUserPrioPreemptions;
	}

	public void setRecentJobUserPrioPreemptions(int recentJobUserPrioPreemptions) {
		this.recentJobUserPrioPreemptions = recentJobUserPrioPreemptions;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public int getRetirementTimeRemaining() {
		return retirementTimeRemaining;
	}

	public void setRetirementTimeRemaining(int retirementTimeRemaining) {
		this.retirementTimeRemaining = retirementTimeRemaining;
	}

	public int getServerTime() {
		return serverTime;
	}

	public void setServerTime(int serverTime) {
		this.serverTime = serverTime;
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

	public String getSubnetMask() {
		return subnetMask;
	}

	public void setSubnetMask(String subnetMask) {
		this.subnetMask = subnetMask;
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

	public float getTotalCpus() {
		return totalCpus;
	}

	public void setTotalCpus(float totalCpus) {
		this.totalCpus = totalCpus;
	}

	public int getTotalDisk() {
		return totalDisk;
	}

	public void setTotalDisk(int totalDisk) {
		this.totalDisk = totalDisk;
	}

	public float getTotalLoadAvg() {
		return totalLoadAvg;
	}

	public void setTotalLoadAvg(float totalLoadAvg) {
		this.totalLoadAvg = totalLoadAvg;
	}

	public int getTotalMemory() {
		return totalMemory;
	}

	public void setTotalMemory(int totalMemory) {
		this.totalMemory = totalMemory;
	}

	public int getTotalSlotCpus() {
		return totalSlotCpus;
	}

	public void setTotalSlotCpus(int totalSlotCpus) {
		this.totalSlotCpus = totalSlotCpus;
	}

	public float getTotalSlotDisk() {
		return totalSlotDisk;
	}

	public void setTotalSlotDisk(float totalSlotDisk) {
		this.totalSlotDisk = totalSlotDisk;
	}

	public int getTotalSlotMemory() {
		return totalSlotMemory;
	}

	public void setTotalSlotMemory(int totalSlotMemory) {
		this.totalSlotMemory = totalSlotMemory;
	}

	public int getTotalSlots() {
		return totalSlots;
	}

	public void setTotalSlots(int totalSlots) {
		this.totalSlots = totalSlots;
	}

	public int getTotalTimeOwnerIdle() {
		return totalTimeOwnerIdle;
	}

	public void setTotalTimeOwnerIdle(int totalTimeOwnerIdle) {
		this.totalTimeOwnerIdle = totalTimeOwnerIdle;
	}

	public int getTotalTimeUnclaimedBenchmarking() {
		return totalTimeUnclaimedBenchmarking;
	}

	public void setTotalTimeUnclaimedBenchmarking(int totalTimeUnclaimedBenchmarking) {
		this.totalTimeUnclaimedBenchmarking = totalTimeUnclaimedBenchmarking;
	}

	public int getTotalTimeUnclaimedIdle() {
		return totalTimeUnclaimedIdle;
	}

	public void setTotalTimeUnclaimedIdle(int totalTimeUnclaimedIdle) {
		this.totalTimeUnclaimedIdle = totalTimeUnclaimedIdle;
	}

	public int getTotalVirtualMemory() {
		return totalVirtualMemory;
	}

	public void setTotalVirtualMemory(int totalVirtualMemory) {
		this.totalVirtualMemory = totalVirtualMemory;
	}

	public String getUidDomain() {
		return uidDomain;
	}

	public void setUidDomain(String uidDomain) {
		this.uidDomain = uidDomain;
	}

	public String getUnhibernate() {
		return unhibernate;
	}

	public void setUnhibernate(String unhibernate) {
		this.unhibernate = unhibernate;
	}

	public int getUpdateSequenceNumber() {
		return updateSequenceNumber;
	}

	public void setUpdateSequenceNumber(int updateSequenceNumber) {
		this.updateSequenceNumber = updateSequenceNumber;
	}

	public String getUpdatesHistory() {
		return updatesHistory;
	}

	public void setUpdatesHistory(String updatesHistory) {
		this.updatesHistory = updatesHistory;
	}

	public int getUpdatesLost() {
		return updatesLost;
	}

	public void setUpdatesLost(int updatesLost) {
		this.updatesLost = updatesLost;
	}

	public int getUpdatesSequenced() {
		return updatesSequenced;
	}

	public void setUpdatesSequenced(int updatesSequenced) {
		this.updatesSequenced = updatesSequenced;
	}

	public int getUpdatesTotal() {
		return updatesTotal;
	}

	public void setUpdatesTotal(int updatesTotal) {
		this.updatesTotal = updatesTotal;
	}

	public int getVirtualMemory() {
		return virtualMemory;
	}

	public void setVirtualMemory(int virtualMemory) {
		this.virtualMemory = virtualMemory;
	}

	public String getWakeOnLanEnabledFlags() {
		return wakeOnLanEnabledFlags;
	}

	public void setWakeOnLanEnabledFlags(String wakeOnLanEnabledFlags) {
		this.wakeOnLanEnabledFlags = wakeOnLanEnabledFlags;
	}

	public String getWakeOnLanSupportedFlags() {
		return wakeOnLanSupportedFlags;
	}

	public void setWakeOnLanSupportedFlags(String wakeOnLanSupportedFlags) {
		this.wakeOnLanSupportedFlags = wakeOnLanSupportedFlags;
	}

	public int getWindowsBuildNumber() {
		return windowsBuildNumber;
	}

	public void setWindowsBuildNumber(int windowsBuildNumber) {
		this.windowsBuildNumber = windowsBuildNumber;
	}

	public int getWindowsMajorVersion() {
		return windowsMajorVersion;
	}

	public void setWindowsMajorVersion(int windowsMajorVersion) {
		this.windowsMajorVersion = windowsMajorVersion;
	}

	public int getWindowsMinorVersion() {
		return windowsMinorVersion;
	}

	public void setWindowsMinorVersion(int windowsMinorVersion) {
		this.windowsMinorVersion = windowsMinorVersion;
	}

	public int getWindowsProductType() {
		return windowsProductType;
	}

	public void setWindowsProductType(int windowsProductType) {
		this.windowsProductType = windowsProductType;
	}

	public int getWindowsServicePackMajorVersion() {
		return windowsServicePackMajorVersion;
	}

	public void setWindowsServicePackMajorVersion(int windowsServicePackMajorVersion) {
		this.windowsServicePackMajorVersion = windowsServicePackMajorVersion;
	}

	public int getWindowsServicePackMinorVersion() {
		return windowsServicePackMinorVersion;
	}

	public void setWindowsServicePackMinorVersion(int windowsServicePackMinorVersion) {
		this.windowsServicePackMinorVersion = windowsServicePackMinorVersion;
	}

	public int updatesLost;
	public int updatesSequenced;
	public int updatesTotal;
	public int virtualMemory;
	public String wakeOnLanEnabledFlags;
	public String wakeOnLanSupportedFlags;
	public int windowsBuildNumber;
	public int windowsMajorVersion;
	public int windowsMinorVersion;
	public int windowsProductType;
	public int windowsServicePackMajorVersion;
	public int windowsServicePackMinorVersion;
}