package com.lipei.htcweb.status;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Job extends AbstractClassAdsInfo {

	public String args;
	public String autoClusterAttrs;
	public int autoClusterId;
	public int bufferBlockSize;
	public int bufferSize;
	public int clusterId;
	public String cmd;
	public int committedSlotTime;
	public int committedSuspensionTime;
	public int committedTime;
	public int completionDate;
	public String condorPlatform;
	public String condorVersion;
	public int coreSize;
	public int cumulativeSlotTime;
	public int cumulativeSuspensionTime;
	public int currentHosts;
	public String currentTime;
	public int diskUsage;
	public int diskUsage_RAW;
	public int enteredCurrentStatus;
	public String environment;
	public String err;
	public int executableSize;
	public int executableSize_RAW;
	public boolean exitBySignal;
	public int exitStatus;
	public String fileSystemDomain;

	public String globalJobId;

	public int imageSize;
	public int imageSize_RAW;

	@Column(name = "job_in")
	public String in;
	public String iwd;
	public String jarFiles;
	public int jobCurrentStartDate;
	public int jobLeaseDuration;
	public int jobNotification;
	public int jobPrio;
	public int jobRunCount;
	public int jobStartDate;
	public int jobStatus;
	public int jobUniverse;
	public int lastJobLeaseRenewal;
	public int lastJobStatus;
	public int lastMatchTime;
	public int lastSuspensionTime;
	public boolean leaveJobInQueue;
	public float localSysCpu;
	public float localUserCpu;
	public int machineAttrCpus0;
	public int machineAttrSlotWeight0;
	public int maxHosts;
	public int minHosts;
	public String myType;
	public boolean niceUser;
	public String nTDomain;
	public int numCkpts;
	public int numCkpts_RAW;
	public int numJobMatches;
	public int numJobStarts;
	public int numRestarts;
	public int numShadowStarts;
	public int numSystemHolds;
	public boolean onExitHold;
	public boolean onExitRemove;
	public int origMaxHosts;

	@Column(name = "job_out")
	public String out;
	public String owner;
	public boolean periodicHold;
	public boolean periodicRelease;
	public boolean periodicRemove;
	public int procId;
	public String publicClaimId;
	public int qDate;
	public float rank;
	public String remoteHost;
	public int remoteSlotID;
	public float remoteSysCpu;
	public float remoteUserCpu;
	public float remoteWallClockTime;
	public int requestCpus;
	public String requestDisk;
	public String requestMemory;
	public String requirements;
	public int serverTime;
	public int shadowBday;
	public String shouldTransferFiles;
	public String startdIpAddr;
	public String startdPrincipal;
	public String targetType;
	public int totalSuspensions;
	public boolean transferErr;
	public boolean transferExecutable;
	public boolean transferIn;
	public String transferInput;
	public int transferInputSizeMB;
	public boolean transferOut;
	public String user;
	public String userLog;
	public boolean wantCheckpoint;
	public boolean wantRemoteIO;
	public boolean wantRemoteSyscalls;
	public String whenToTransferOutput;
	public int windowsBuildNumber;
	public int windowsMajorVersion;
	public int windowsMinorVersion;
	public int windowsProductType;
	public int windowsServicePackMajorVersion;
	public int windowsServicePackMinorVersion;

	public String getArgs() {
		return args;
	}

	public void setArgs(String args) {
		this.args = args;
	}

	public String getAutoClusterAttrs() {
		return autoClusterAttrs;
	}

	public void setAutoClusterAttrs(String autoClusterAttrs) {
		this.autoClusterAttrs = autoClusterAttrs;
	}

	public int getAutoClusterId() {
		return autoClusterId;
	}

	public void setAutoClusterId(int autoClusterId) {
		this.autoClusterId = autoClusterId;
	}

	public int getBufferBlockSize() {
		return bufferBlockSize;
	}

	public void setBufferBlockSize(int bufferBlockSize) {
		this.bufferBlockSize = bufferBlockSize;
	}

	public int getBufferSize() {
		return bufferSize;
	}

	public void setBufferSize(int bufferSize) {
		this.bufferSize = bufferSize;
	}

	public int getClusterId() {
		return clusterId;
	}

	public void setClusterId(int clusterId) {
		this.clusterId = clusterId;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public int getCommittedSlotTime() {
		return committedSlotTime;
	}

	public void setCommittedSlotTime(int committedSlotTime) {
		this.committedSlotTime = committedSlotTime;
	}

	public int getCommittedSuspensionTime() {
		return committedSuspensionTime;
	}

	public void setCommittedSuspensionTime(int committedSuspensionTime) {
		this.committedSuspensionTime = committedSuspensionTime;
	}

	public int getCommittedTime() {
		return committedTime;
	}

	public void setCommittedTime(int committedTime) {
		this.committedTime = committedTime;
	}

	public int getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(int completionDate) {
		this.completionDate = completionDate;
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

	public int getCoreSize() {
		return coreSize;
	}

	public void setCoreSize(int coreSize) {
		this.coreSize = coreSize;
	}

	public int getCumulativeSlotTime() {
		return cumulativeSlotTime;
	}

	public void setCumulativeSlotTime(int cumulativeSlotTime) {
		this.cumulativeSlotTime = cumulativeSlotTime;
	}

	public int getCumulativeSuspensionTime() {
		return cumulativeSuspensionTime;
	}

	public void setCumulativeSuspensionTime(int cumulativeSuspensionTime) {
		this.cumulativeSuspensionTime = cumulativeSuspensionTime;
	}

	public int getCurrentHosts() {
		return currentHosts;
	}

	public void setCurrentHosts(int currentHosts) {
		this.currentHosts = currentHosts;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public int getDiskUsage() {
		return diskUsage;
	}

	public void setDiskUsage(int diskUsage) {
		this.diskUsage = diskUsage;
	}

	public int getDiskUsage_RAW() {
		return diskUsage_RAW;
	}

	public void setDiskUsage_RAW(int diskUsage_RAW) {
		this.diskUsage_RAW = diskUsage_RAW;
	}

	public int getEnteredCurrentStatus() {
		return enteredCurrentStatus;
	}

	public void setEnteredCurrentStatus(int enteredCurrentStatus) {
		this.enteredCurrentStatus = enteredCurrentStatus;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
	}

	public int getExecutableSize() {
		return executableSize;
	}

	public void setExecutableSize(int executableSize) {
		this.executableSize = executableSize;
	}

	public int getExecutableSize_RAW() {
		return executableSize_RAW;
	}

	public void setExecutableSize_RAW(int executableSize_RAW) {
		this.executableSize_RAW = executableSize_RAW;
	}

	public boolean isExitBySignal() {
		return exitBySignal;
	}

	public void setExitBySignal(boolean exitBySignal) {
		this.exitBySignal = exitBySignal;
	}

	public int getExitStatus() {
		return exitStatus;
	}

	public void setExitStatus(int exitStatus) {
		this.exitStatus = exitStatus;
	}

	public String getFileSystemDomain() {
		return fileSystemDomain;
	}

	public void setFileSystemDomain(String fileSystemDomain) {
		this.fileSystemDomain = fileSystemDomain;
	}

	public String getGlobalJobId() {
		return globalJobId;
	}

	public void setGlobalJobId(String globalJobId) {
		this.globalJobId = globalJobId;
	}

	public int getImageSize() {
		return imageSize;
	}

	public void setImageSize(int imageSize) {
		this.imageSize = imageSize;
	}

	public int getImageSize_RAW() {
		return imageSize_RAW;
	}

	public void setImageSize_RAW(int imageSize_RAW) {
		this.imageSize_RAW = imageSize_RAW;
	}

	public String getIn() {
		return in;
	}

	public void setIn(String in) {
		this.in = in;
	}

	public String getIwd() {
		return iwd;
	}

	public void setIwd(String iwd) {
		this.iwd = iwd;
	}

	public String getJarFiles() {
		return jarFiles;
	}

	public void setJarFiles(String jarFiles) {
		this.jarFiles = jarFiles;
	}

	public int getJobCurrentStartDate() {
		return jobCurrentStartDate;
	}

	public void setJobCurrentStartDate(int jobCurrentStartDate) {
		this.jobCurrentStartDate = jobCurrentStartDate;
	}

	public int getJobLeaseDuration() {
		return jobLeaseDuration;
	}

	public void setJobLeaseDuration(int jobLeaseDuration) {
		this.jobLeaseDuration = jobLeaseDuration;
	}

	public int getJobNotification() {
		return jobNotification;
	}

	public void setJobNotification(int jobNotification) {
		this.jobNotification = jobNotification;
	}

	public int getJobPrio() {
		return jobPrio;
	}

	public void setJobPrio(int jobPrio) {
		this.jobPrio = jobPrio;
	}

	public int getJobRunCount() {
		return jobRunCount;
	}

	public void setJobRunCount(int jobRunCount) {
		this.jobRunCount = jobRunCount;
	}

	public int getJobStartDate() {
		return jobStartDate;
	}

	public void setJobStartDate(int jobStartDate) {
		this.jobStartDate = jobStartDate;
	}

	public int getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(int jobStatus) {
		this.jobStatus = jobStatus;
	}

	public int getJobUniverse() {
		return jobUniverse;
	}

	public void setJobUniverse(int jobUniverse) {
		this.jobUniverse = jobUniverse;
	}

	public int getLastJobLeaseRenewal() {
		return lastJobLeaseRenewal;
	}

	public void setLastJobLeaseRenewal(int lastJobLeaseRenewal) {
		this.lastJobLeaseRenewal = lastJobLeaseRenewal;
	}

	public int getLastJobStatus() {
		return lastJobStatus;
	}

	public void setLastJobStatus(int lastJobStatus) {
		this.lastJobStatus = lastJobStatus;
	}

	public int getLastMatchTime() {
		return lastMatchTime;
	}

	public void setLastMatchTime(int lastMatchTime) {
		this.lastMatchTime = lastMatchTime;
	}

	public int getLastSuspensionTime() {
		return lastSuspensionTime;
	}

	public void setLastSuspensionTime(int lastSuspensionTime) {
		this.lastSuspensionTime = lastSuspensionTime;
	}

	public boolean isLeaveJobInQueue() {
		return leaveJobInQueue;
	}

	public void setLeaveJobInQueue(boolean leaveJobInQueue) {
		this.leaveJobInQueue = leaveJobInQueue;
	}

	public float getLocalSysCpu() {
		return localSysCpu;
	}

	public void setLocalSysCpu(float localSysCpu) {
		this.localSysCpu = localSysCpu;
	}

	public float getLocalUserCpu() {
		return localUserCpu;
	}

	public void setLocalUserCpu(float localUserCpu) {
		this.localUserCpu = localUserCpu;
	}

	public int getMachineAttrCpus0() {
		return machineAttrCpus0;
	}

	public void setMachineAttrCpus0(int machineAttrCpus0) {
		this.machineAttrCpus0 = machineAttrCpus0;
	}

	public int getMachineAttrSlotWeight0() {
		return machineAttrSlotWeight0;
	}

	public void setMachineAttrSlotWeight0(int machineAttrSlotWeight0) {
		this.machineAttrSlotWeight0 = machineAttrSlotWeight0;
	}

	public int getMaxHosts() {
		return maxHosts;
	}

	public void setMaxHosts(int maxHosts) {
		this.maxHosts = maxHosts;
	}

	public int getMinHosts() {
		return minHosts;
	}

	public void setMinHosts(int minHosts) {
		this.minHosts = minHosts;
	}

	public String getMyType() {
		return myType;
	}

	public void setMyType(String myType) {
		this.myType = myType;
	}

	public boolean isNiceUser() {
		return niceUser;
	}

	public void setNiceUser(boolean niceUser) {
		this.niceUser = niceUser;
	}

	public String getnTDomain() {
		return nTDomain;
	}

	public void setnTDomain(String nTDomain) {
		this.nTDomain = nTDomain;
	}

	public int getNumCkpts() {
		return numCkpts;
	}

	public void setNumCkpts(int numCkpts) {
		this.numCkpts = numCkpts;
	}

	public int getNumCkpts_RAW() {
		return numCkpts_RAW;
	}

	public void setNumCkpts_RAW(int numCkpts_RAW) {
		this.numCkpts_RAW = numCkpts_RAW;
	}

	public int getNumJobMatches() {
		return numJobMatches;
	}

	public void setNumJobMatches(int numJobMatches) {
		this.numJobMatches = numJobMatches;
	}

	public int getNumJobStarts() {
		return numJobStarts;
	}

	public void setNumJobStarts(int numJobStarts) {
		this.numJobStarts = numJobStarts;
	}

	public int getNumRestarts() {
		return numRestarts;
	}

	public void setNumRestarts(int numRestarts) {
		this.numRestarts = numRestarts;
	}

	public int getNumShadowStarts() {
		return numShadowStarts;
	}

	public void setNumShadowStarts(int numShadowStarts) {
		this.numShadowStarts = numShadowStarts;
	}

	public int getNumSystemHolds() {
		return numSystemHolds;
	}

	public void setNumSystemHolds(int numSystemHolds) {
		this.numSystemHolds = numSystemHolds;
	}

	public boolean isOnExitHold() {
		return onExitHold;
	}

	public void setOnExitHold(boolean onExitHold) {
		this.onExitHold = onExitHold;
	}

	public boolean isOnExitRemove() {
		return onExitRemove;
	}

	public void setOnExitRemove(boolean onExitRemove) {
		this.onExitRemove = onExitRemove;
	}

	public int getOrigMaxHosts() {
		return origMaxHosts;
	}

	public void setOrigMaxHosts(int origMaxHosts) {
		this.origMaxHosts = origMaxHosts;
	}

	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public boolean isPeriodicHold() {
		return periodicHold;
	}

	public void setPeriodicHold(boolean periodicHold) {
		this.periodicHold = periodicHold;
	}

	public boolean isPeriodicRelease() {
		return periodicRelease;
	}

	public void setPeriodicRelease(boolean periodicRelease) {
		this.periodicRelease = periodicRelease;
	}

	public boolean isPeriodicRemove() {
		return periodicRemove;
	}

	public void setPeriodicRemove(boolean periodicRemove) {
		this.periodicRemove = periodicRemove;
	}

	public int getProcId() {
		return procId;
	}

	public void setProcId(int procId) {
		this.procId = procId;
	}

	public String getPublicClaimId() {
		return publicClaimId;
	}

	public void setPublicClaimId(String publicClaimId) {
		this.publicClaimId = publicClaimId;
	}

	public int getqDate() {
		return qDate;
	}

	public void setqDate(int qDate) {
		this.qDate = qDate;
	}

	public float getRank() {
		return rank;
	}

	public void setRank(float rank) {
		this.rank = rank;
	}

	public String getRemoteHost() {
		return remoteHost;
	}

	public void setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

	public int getRemoteSlotID() {
		return remoteSlotID;
	}

	public void setRemoteSlotID(int remoteSlotID) {
		this.remoteSlotID = remoteSlotID;
	}

	public float getRemoteSysCpu() {
		return remoteSysCpu;
	}

	public void setRemoteSysCpu(float remoteSysCpu) {
		this.remoteSysCpu = remoteSysCpu;
	}

	public float getRemoteUserCpu() {
		return remoteUserCpu;
	}

	public void setRemoteUserCpu(float remoteUserCpu) {
		this.remoteUserCpu = remoteUserCpu;
	}

	public float getRemoteWallClockTime() {
		return remoteWallClockTime;
	}

	public void setRemoteWallClockTime(float remoteWallClockTime) {
		this.remoteWallClockTime = remoteWallClockTime;
	}

	public int getRequestCpus() {
		return requestCpus;
	}

	public void setRequestCpus(int requestCpus) {
		this.requestCpus = requestCpus;
	}

	public String getRequestDisk() {
		return requestDisk;
	}

	public void setRequestDisk(String requestDisk) {
		this.requestDisk = requestDisk;
	}

	public String getRequestMemory() {
		return requestMemory;
	}

	public void setRequestMemory(String requestMemory) {
		this.requestMemory = requestMemory;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public int getServerTime() {
		return serverTime;
	}

	public void setServerTime(int serverTime) {
		this.serverTime = serverTime;
	}

	public int getShadowBday() {
		return shadowBday;
	}

	public void setShadowBday(int shadowBday) {
		this.shadowBday = shadowBday;
	}

	public String getShouldTransferFiles() {
		return shouldTransferFiles;
	}

	public void setShouldTransferFiles(String shouldTransferFiles) {
		this.shouldTransferFiles = shouldTransferFiles;
	}

	public String getStartdIpAddr() {
		return startdIpAddr;
	}

	public void setStartdIpAddr(String startdIpAddr) {
		this.startdIpAddr = startdIpAddr;
	}

	public String getStartdPrincipal() {
		return startdPrincipal;
	}

	public void setStartdPrincipal(String startdPrincipal) {
		this.startdPrincipal = startdPrincipal;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public int getTotalSuspensions() {
		return totalSuspensions;
	}

	public void setTotalSuspensions(int totalSuspensions) {
		this.totalSuspensions = totalSuspensions;
	}

	public boolean isTransferErr() {
		return transferErr;
	}

	public void setTransferErr(boolean transferErr) {
		this.transferErr = transferErr;
	}

	public boolean isTransferExecutable() {
		return transferExecutable;
	}

	public void setTransferExecutable(boolean transferExecutable) {
		this.transferExecutable = transferExecutable;
	}

	public boolean isTransferIn() {
		return transferIn;
	}

	public void setTransferIn(boolean transferIn) {
		this.transferIn = transferIn;
	}

	public String getTransferInput() {
		return transferInput;
	}

	public void setTransferInput(String transferInput) {
		this.transferInput = transferInput;
	}

	public int getTransferInputSizeMB() {
		return transferInputSizeMB;
	}

	public void setTransferInputSizeMB(int transferInputSizeMB) {
		this.transferInputSizeMB = transferInputSizeMB;
	}

	public boolean isTransferOut() {
		return transferOut;
	}

	public void setTransferOut(boolean transferOut) {
		this.transferOut = transferOut;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUserLog() {
		return userLog;
	}

	public void setUserLog(String userLog) {
		this.userLog = userLog;
	}

	public boolean isWantCheckpoint() {
		return wantCheckpoint;
	}

	public void setWantCheckpoint(boolean wantCheckpoint) {
		this.wantCheckpoint = wantCheckpoint;
	}

	public boolean isWantRemoteIO() {
		return wantRemoteIO;
	}

	public void setWantRemoteIO(boolean wantRemoteIO) {
		this.wantRemoteIO = wantRemoteIO;
	}

	public boolean isWantRemoteSyscalls() {
		return wantRemoteSyscalls;
	}

	public void setWantRemoteSyscalls(boolean wantRemoteSyscalls) {
		this.wantRemoteSyscalls = wantRemoteSyscalls;
	}

	public String getWhenToTransferOutput() {
		return whenToTransferOutput;
	}

	public void setWhenToTransferOutput(String whenToTransferOutput) {
		this.whenToTransferOutput = whenToTransferOutput;
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

}