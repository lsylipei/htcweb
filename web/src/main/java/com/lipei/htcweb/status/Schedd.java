package com.lipei.htcweb.status;

import javax.persistence.Entity;

@Entity
public class Schedd extends AbstractClassAdsInfo {

	public String authenticatedIdentity;
	public int autoclusters;
	public String collectorHost;
	public String condorPlatform;
	public String condorVersion;
	public String currentTime;
	public float daemonCoreDutyCycle;
	public int daemonStartTime;
	public int detectedCpus;
	public int detectedMemory;
	public float fileTransferDownloadBytes;
	public float fileTransferDownloadBytesPerSecond_1h;
	public float fileTransferDownloadBytesPerSecond_1m;
	public float fileTransferDownloadBytesPerSecond_5m;
	public float fileTransferFileReadLoad_1h;
	public float fileTransferFileReadLoad_1m;
	public float fileTransferFileReadLoad_5m;
	public float fileTransferFileReadSeconds;
	public float fileTransferFileWriteLoad_1h;
	public float fileTransferFileWriteLoad_1m;
	public float fileTransferFileWriteLoad_5m;
	public float fileTransferFileWriteSeconds;
	public float fileTransferMBWaitingToDownload;
	public float fileTransferMBWaitingToUpload;
	public float fileTransferNetReadLoad_1h;
	public float fileTransferNetReadLoad_1m;
	public float fileTransferNetReadLoad_5m;
	public float fileTransferNetReadSeconds;
	public float fileTransferNetWriteLoad_1h;
	public float fileTransferNetWriteLoad_1m;
	public float fileTransferNetWriteLoad_5m;
	public float fileTransferNetWriteSeconds;
	public float fileTransferUploadBytes;
	public float fileTransferUploadBytesPerSecond_1h;
	public float fileTransferUploadBytesPerSecond_1m;
	public float fileTransferUploadBytesPerSecond_5m;
	public boolean hasSOAPInterface;
	public int jobQueueBirthdate;
	public int jobsAccumBadputTime;
	public int jobsAccumChurnTime;
	public int jobsAccumExecuteAltTime;
	public int jobsAccumExecuteTime;
	public int jobsAccumPostExecuteTime;
	public int jobsAccumPreExecuteTime;
	public int jobsAccumRunningTime;
	public int jobsAccumTimeToStart;
	public String jobsBadputRuntimes;
	public String jobsBadputSizes;
	public int jobsCheckpointed;
	public int jobsCompleted;
	public String jobsCompletedRuntimes;
	public String jobsCompletedSizes;
	public int jobsCoredumped;
	public int jobsDebugLogError;
	public int jobsExecFailed;
	public int jobsExited;
	public int jobsExitedAndClaimClosing;
	public int jobsExitedNormally;
	public int jobsExitException;
	public int jobsKilled;
	public int jobsMissedDeferralTime;
	public int jobsNotStarted;
	public String jobsRunningRuntimes;
	public String jobsRunningSizes;
	public String jobsRuntimesHistogramBuckets;
	public int jobsShadowNoMemory;
	public int jobsShouldHold;
	public int jobsShouldRemove;
	public int jobsShouldRequeue;
	public String jobsSizesHistogramBuckets;
	public int jobsStarted;
	public int jobsSubmitted;
	public int jobsWierdTimestamps;
	public int lastHeardFrom;
	public String machine;
	public int maxJobsRunning;
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
	public int numUsers;
	public int recentAutoclusters;
	public float recentDaemonCoreDutyCycle;
	public int recentJobsAccumBadputTime;
	public int recentJobsAccumChurnTime;
	public int recentJobsAccumExecuteAltTime;
	public int recentJobsAccumExecuteTime;
	public int recentJobsAccumPostExecuteTime;
	public int recentJobsAccumPreExecuteTime;
	public int recentJobsAccumRunningTime;
	public int recentJobsAccumTimeToStart;
	public String recentJobsBadputRuntimes;
	public String recentJobsBadputSizes;
	public int recentJobsCheckpointed;
	public int recentJobsCompleted;
	public String recentJobsCompletedRuntimes;
	public String recentJobsCompletedSizes;
	public int recentJobsCoredumped;
	public int recentJobsDebugLogError;
	public int recentJobsExecFailed;
	public int recentJobsExited;
	public int recentJobsExitedAndClaimClosing;
	public int recentJobsExitedNormally;
	public int recentJobsExitException;
	public int recentJobsKilled;
	public int recentJobsMissedDeferralTime;
	public int recentJobsNotStarted;
	public int recentJobsShadowNoMemory;
	public int recentJobsShouldHold;
	public int recentJobsShouldRemove;
	public int recentJobsShouldRequeue;
	public int recentJobsStarted;
	public int recentJobsSubmitted;
	public int recentJobsWierdTimestamps;
	public int recentShadowsStarted;
	public int recentStatsLifetime;
	public String scheddIpAddr;
	public boolean scheddSwapExhausted;
	public int serverTime;
	public int shadowsRunning;
	public int shadowsRunningPeak;
	public int shadowsStarted;
	public String startLocalUniverse;
	public String startSchedulerUniverse;
	public int statsLifetime;
	public String targetType;
	public int totalFlockedJobs;
	public int totalHeldJobs;
	public int totalIdleJobs;
	public int totalJobAds;
	public int totalLocalJobsIdle;
	public int totalLocalJobsRunning;
	public int totalRemovedJobs;
	public int totalRunningJobs;
	public int totalSchedulerJobsIdle;
	public int totalSchedulerJobsRunning;
	public int transferQueueDownloadWaitTime;
	public int transferQueueDownloadWaitTimePeak;
	public int transferQueueMaxDownloading;
	public int transferQueueMaxUploading;
	public int transferQueueNumDownloading;
	public int transferQueueNumDownloadingPeak;
	public int transferQueueNumUploading;
	public int transferQueueNumUploadingPeak;
	public int transferQueueNumWaitingToDownload;
	public int transferQueueNumWaitingToDownloadPeak;
	public int transferQueueNumWaitingToUpload;
	public int transferQueueNumWaitingToUploadPeak;
	public int transferQueueUploadWaitTime;
	public int transferQueueUploadWaitTimePeak;
	public String transferQueueUserExpr;
	public int updateSequenceNumber;
	public String updatesHistory;
	public int updatesLost;
	public int updatesSequenced;
	public int updatesTotal;
	public int virtualMemory;
	public boolean wantResAd;

	public String getAuthenticatedIdentity() {
		return authenticatedIdentity;
	}

	public void setAuthenticatedIdentity(String authenticatedIdentity) {
		this.authenticatedIdentity = authenticatedIdentity;
	}

	public int getAutoclusters() {
		return autoclusters;
	}

	public void setAutoclusters(int autoclusters) {
		this.autoclusters = autoclusters;
	}

	public String getCollectorHost() {
		return collectorHost;
	}

	public void setCollectorHost(String collectorHost) {
		this.collectorHost = collectorHost;
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

	public float getFileTransferDownloadBytes() {
		return fileTransferDownloadBytes;
	}

	public void setFileTransferDownloadBytes(float fileTransferDownloadBytes) {
		this.fileTransferDownloadBytes = fileTransferDownloadBytes;
	}

	public float getFileTransferDownloadBytesPerSecond_1h() {
		return fileTransferDownloadBytesPerSecond_1h;
	}

	public void setFileTransferDownloadBytesPerSecond_1h(float fileTransferDownloadBytesPerSecond_1h) {
		this.fileTransferDownloadBytesPerSecond_1h = fileTransferDownloadBytesPerSecond_1h;
	}

	public float getFileTransferDownloadBytesPerSecond_1m() {
		return fileTransferDownloadBytesPerSecond_1m;
	}

	public void setFileTransferDownloadBytesPerSecond_1m(float fileTransferDownloadBytesPerSecond_1m) {
		this.fileTransferDownloadBytesPerSecond_1m = fileTransferDownloadBytesPerSecond_1m;
	}

	public float getFileTransferDownloadBytesPerSecond_5m() {
		return fileTransferDownloadBytesPerSecond_5m;
	}

	public void setFileTransferDownloadBytesPerSecond_5m(float fileTransferDownloadBytesPerSecond_5m) {
		this.fileTransferDownloadBytesPerSecond_5m = fileTransferDownloadBytesPerSecond_5m;
	}

	public float getFileTransferFileReadLoad_1h() {
		return fileTransferFileReadLoad_1h;
	}

	public void setFileTransferFileReadLoad_1h(float fileTransferFileReadLoad_1h) {
		this.fileTransferFileReadLoad_1h = fileTransferFileReadLoad_1h;
	}

	public float getFileTransferFileReadLoad_1m() {
		return fileTransferFileReadLoad_1m;
	}

	public void setFileTransferFileReadLoad_1m(float fileTransferFileReadLoad_1m) {
		this.fileTransferFileReadLoad_1m = fileTransferFileReadLoad_1m;
	}

	public float getFileTransferFileReadLoad_5m() {
		return fileTransferFileReadLoad_5m;
	}

	public void setFileTransferFileReadLoad_5m(float fileTransferFileReadLoad_5m) {
		this.fileTransferFileReadLoad_5m = fileTransferFileReadLoad_5m;
	}

	public float getFileTransferFileReadSeconds() {
		return fileTransferFileReadSeconds;
	}

	public void setFileTransferFileReadSeconds(float fileTransferFileReadSeconds) {
		this.fileTransferFileReadSeconds = fileTransferFileReadSeconds;
	}

	public float getFileTransferFileWriteLoad_1h() {
		return fileTransferFileWriteLoad_1h;
	}

	public void setFileTransferFileWriteLoad_1h(float fileTransferFileWriteLoad_1h) {
		this.fileTransferFileWriteLoad_1h = fileTransferFileWriteLoad_1h;
	}

	public float getFileTransferFileWriteLoad_1m() {
		return fileTransferFileWriteLoad_1m;
	}

	public void setFileTransferFileWriteLoad_1m(float fileTransferFileWriteLoad_1m) {
		this.fileTransferFileWriteLoad_1m = fileTransferFileWriteLoad_1m;
	}

	public float getFileTransferFileWriteLoad_5m() {
		return fileTransferFileWriteLoad_5m;
	}

	public void setFileTransferFileWriteLoad_5m(float fileTransferFileWriteLoad_5m) {
		this.fileTransferFileWriteLoad_5m = fileTransferFileWriteLoad_5m;
	}

	public float getFileTransferFileWriteSeconds() {
		return fileTransferFileWriteSeconds;
	}

	public void setFileTransferFileWriteSeconds(float fileTransferFileWriteSeconds) {
		this.fileTransferFileWriteSeconds = fileTransferFileWriteSeconds;
	}

	public float getFileTransferMBWaitingToDownload() {
		return fileTransferMBWaitingToDownload;
	}

	public void setFileTransferMBWaitingToDownload(float fileTransferMBWaitingToDownload) {
		this.fileTransferMBWaitingToDownload = fileTransferMBWaitingToDownload;
	}

	public float getFileTransferMBWaitingToUpload() {
		return fileTransferMBWaitingToUpload;
	}

	public void setFileTransferMBWaitingToUpload(float fileTransferMBWaitingToUpload) {
		this.fileTransferMBWaitingToUpload = fileTransferMBWaitingToUpload;
	}

	public float getFileTransferNetReadLoad_1h() {
		return fileTransferNetReadLoad_1h;
	}

	public void setFileTransferNetReadLoad_1h(float fileTransferNetReadLoad_1h) {
		this.fileTransferNetReadLoad_1h = fileTransferNetReadLoad_1h;
	}

	public float getFileTransferNetReadLoad_1m() {
		return fileTransferNetReadLoad_1m;
	}

	public void setFileTransferNetReadLoad_1m(float fileTransferNetReadLoad_1m) {
		this.fileTransferNetReadLoad_1m = fileTransferNetReadLoad_1m;
	}

	public float getFileTransferNetReadLoad_5m() {
		return fileTransferNetReadLoad_5m;
	}

	public void setFileTransferNetReadLoad_5m(float fileTransferNetReadLoad_5m) {
		this.fileTransferNetReadLoad_5m = fileTransferNetReadLoad_5m;
	}

	public float getFileTransferNetReadSeconds() {
		return fileTransferNetReadSeconds;
	}

	public void setFileTransferNetReadSeconds(float fileTransferNetReadSeconds) {
		this.fileTransferNetReadSeconds = fileTransferNetReadSeconds;
	}

	public float getFileTransferNetWriteLoad_1h() {
		return fileTransferNetWriteLoad_1h;
	}

	public void setFileTransferNetWriteLoad_1h(float fileTransferNetWriteLoad_1h) {
		this.fileTransferNetWriteLoad_1h = fileTransferNetWriteLoad_1h;
	}

	public float getFileTransferNetWriteLoad_1m() {
		return fileTransferNetWriteLoad_1m;
	}

	public void setFileTransferNetWriteLoad_1m(float fileTransferNetWriteLoad_1m) {
		this.fileTransferNetWriteLoad_1m = fileTransferNetWriteLoad_1m;
	}

	public float getFileTransferNetWriteLoad_5m() {
		return fileTransferNetWriteLoad_5m;
	}

	public void setFileTransferNetWriteLoad_5m(float fileTransferNetWriteLoad_5m) {
		this.fileTransferNetWriteLoad_5m = fileTransferNetWriteLoad_5m;
	}

	public float getFileTransferNetWriteSeconds() {
		return fileTransferNetWriteSeconds;
	}

	public void setFileTransferNetWriteSeconds(float fileTransferNetWriteSeconds) {
		this.fileTransferNetWriteSeconds = fileTransferNetWriteSeconds;
	}

	public float getFileTransferUploadBytes() {
		return fileTransferUploadBytes;
	}

	public void setFileTransferUploadBytes(float fileTransferUploadBytes) {
		this.fileTransferUploadBytes = fileTransferUploadBytes;
	}

	public float getFileTransferUploadBytesPerSecond_1h() {
		return fileTransferUploadBytesPerSecond_1h;
	}

	public void setFileTransferUploadBytesPerSecond_1h(float fileTransferUploadBytesPerSecond_1h) {
		this.fileTransferUploadBytesPerSecond_1h = fileTransferUploadBytesPerSecond_1h;
	}

	public float getFileTransferUploadBytesPerSecond_1m() {
		return fileTransferUploadBytesPerSecond_1m;
	}

	public void setFileTransferUploadBytesPerSecond_1m(float fileTransferUploadBytesPerSecond_1m) {
		this.fileTransferUploadBytesPerSecond_1m = fileTransferUploadBytesPerSecond_1m;
	}

	public float getFileTransferUploadBytesPerSecond_5m() {
		return fileTransferUploadBytesPerSecond_5m;
	}

	public void setFileTransferUploadBytesPerSecond_5m(float fileTransferUploadBytesPerSecond_5m) {
		this.fileTransferUploadBytesPerSecond_5m = fileTransferUploadBytesPerSecond_5m;
	}

	public boolean isHasSOAPInterface() {
		return hasSOAPInterface;
	}

	public void setHasSOAPInterface(boolean hasSOAPInterface) {
		this.hasSOAPInterface = hasSOAPInterface;
	}

	public int getJobQueueBirthdate() {
		return jobQueueBirthdate;
	}

	public void setJobQueueBirthdate(int jobQueueBirthdate) {
		this.jobQueueBirthdate = jobQueueBirthdate;
	}

	public int getJobsAccumBadputTime() {
		return jobsAccumBadputTime;
	}

	public void setJobsAccumBadputTime(int jobsAccumBadputTime) {
		this.jobsAccumBadputTime = jobsAccumBadputTime;
	}

	public int getJobsAccumChurnTime() {
		return jobsAccumChurnTime;
	}

	public void setJobsAccumChurnTime(int jobsAccumChurnTime) {
		this.jobsAccumChurnTime = jobsAccumChurnTime;
	}

	public int getJobsAccumExecuteAltTime() {
		return jobsAccumExecuteAltTime;
	}

	public void setJobsAccumExecuteAltTime(int jobsAccumExecuteAltTime) {
		this.jobsAccumExecuteAltTime = jobsAccumExecuteAltTime;
	}

	public int getJobsAccumExecuteTime() {
		return jobsAccumExecuteTime;
	}

	public void setJobsAccumExecuteTime(int jobsAccumExecuteTime) {
		this.jobsAccumExecuteTime = jobsAccumExecuteTime;
	}

	public int getJobsAccumPostExecuteTime() {
		return jobsAccumPostExecuteTime;
	}

	public void setJobsAccumPostExecuteTime(int jobsAccumPostExecuteTime) {
		this.jobsAccumPostExecuteTime = jobsAccumPostExecuteTime;
	}

	public int getJobsAccumPreExecuteTime() {
		return jobsAccumPreExecuteTime;
	}

	public void setJobsAccumPreExecuteTime(int jobsAccumPreExecuteTime) {
		this.jobsAccumPreExecuteTime = jobsAccumPreExecuteTime;
	}

	public int getJobsAccumRunningTime() {
		return jobsAccumRunningTime;
	}

	public void setJobsAccumRunningTime(int jobsAccumRunningTime) {
		this.jobsAccumRunningTime = jobsAccumRunningTime;
	}

	public int getJobsAccumTimeToStart() {
		return jobsAccumTimeToStart;
	}

	public void setJobsAccumTimeToStart(int jobsAccumTimeToStart) {
		this.jobsAccumTimeToStart = jobsAccumTimeToStart;
	}

	public String getJobsBadputRuntimes() {
		return jobsBadputRuntimes;
	}

	public void setJobsBadputRuntimes(String jobsBadputRuntimes) {
		this.jobsBadputRuntimes = jobsBadputRuntimes;
	}

	public String getJobsBadputSizes() {
		return jobsBadputSizes;
	}

	public void setJobsBadputSizes(String jobsBadputSizes) {
		this.jobsBadputSizes = jobsBadputSizes;
	}

	public int getJobsCheckpointed() {
		return jobsCheckpointed;
	}

	public void setJobsCheckpointed(int jobsCheckpointed) {
		this.jobsCheckpointed = jobsCheckpointed;
	}

	public int getJobsCompleted() {
		return jobsCompleted;
	}

	public void setJobsCompleted(int jobsCompleted) {
		this.jobsCompleted = jobsCompleted;
	}

	public String getJobsCompletedRuntimes() {
		return jobsCompletedRuntimes;
	}

	public void setJobsCompletedRuntimes(String jobsCompletedRuntimes) {
		this.jobsCompletedRuntimes = jobsCompletedRuntimes;
	}

	public String getJobsCompletedSizes() {
		return jobsCompletedSizes;
	}

	public void setJobsCompletedSizes(String jobsCompletedSizes) {
		this.jobsCompletedSizes = jobsCompletedSizes;
	}

	public int getJobsCoredumped() {
		return jobsCoredumped;
	}

	public void setJobsCoredumped(int jobsCoredumped) {
		this.jobsCoredumped = jobsCoredumped;
	}

	public int getJobsDebugLogError() {
		return jobsDebugLogError;
	}

	public void setJobsDebugLogError(int jobsDebugLogError) {
		this.jobsDebugLogError = jobsDebugLogError;
	}

	public int getJobsExecFailed() {
		return jobsExecFailed;
	}

	public void setJobsExecFailed(int jobsExecFailed) {
		this.jobsExecFailed = jobsExecFailed;
	}

	public int getJobsExited() {
		return jobsExited;
	}

	public void setJobsExited(int jobsExited) {
		this.jobsExited = jobsExited;
	}

	public int getJobsExitedAndClaimClosing() {
		return jobsExitedAndClaimClosing;
	}

	public void setJobsExitedAndClaimClosing(int jobsExitedAndClaimClosing) {
		this.jobsExitedAndClaimClosing = jobsExitedAndClaimClosing;
	}

	public int getJobsExitedNormally() {
		return jobsExitedNormally;
	}

	public void setJobsExitedNormally(int jobsExitedNormally) {
		this.jobsExitedNormally = jobsExitedNormally;
	}

	public int getJobsExitException() {
		return jobsExitException;
	}

	public void setJobsExitException(int jobsExitException) {
		this.jobsExitException = jobsExitException;
	}

	public int getJobsKilled() {
		return jobsKilled;
	}

	public void setJobsKilled(int jobsKilled) {
		this.jobsKilled = jobsKilled;
	}

	public int getJobsMissedDeferralTime() {
		return jobsMissedDeferralTime;
	}

	public void setJobsMissedDeferralTime(int jobsMissedDeferralTime) {
		this.jobsMissedDeferralTime = jobsMissedDeferralTime;
	}

	public int getJobsNotStarted() {
		return jobsNotStarted;
	}

	public void setJobsNotStarted(int jobsNotStarted) {
		this.jobsNotStarted = jobsNotStarted;
	}

	public String getJobsRunningRuntimes() {
		return jobsRunningRuntimes;
	}

	public void setJobsRunningRuntimes(String jobsRunningRuntimes) {
		this.jobsRunningRuntimes = jobsRunningRuntimes;
	}

	public String getJobsRunningSizes() {
		return jobsRunningSizes;
	}

	public void setJobsRunningSizes(String jobsRunningSizes) {
		this.jobsRunningSizes = jobsRunningSizes;
	}

	public String getJobsRuntimesHistogramBuckets() {
		return jobsRuntimesHistogramBuckets;
	}

	public void setJobsRuntimesHistogramBuckets(String jobsRuntimesHistogramBuckets) {
		this.jobsRuntimesHistogramBuckets = jobsRuntimesHistogramBuckets;
	}

	public int getJobsShadowNoMemory() {
		return jobsShadowNoMemory;
	}

	public void setJobsShadowNoMemory(int jobsShadowNoMemory) {
		this.jobsShadowNoMemory = jobsShadowNoMemory;
	}

	public int getJobsShouldHold() {
		return jobsShouldHold;
	}

	public void setJobsShouldHold(int jobsShouldHold) {
		this.jobsShouldHold = jobsShouldHold;
	}

	public int getJobsShouldRemove() {
		return jobsShouldRemove;
	}

	public void setJobsShouldRemove(int jobsShouldRemove) {
		this.jobsShouldRemove = jobsShouldRemove;
	}

	public int getJobsShouldRequeue() {
		return jobsShouldRequeue;
	}

	public void setJobsShouldRequeue(int jobsShouldRequeue) {
		this.jobsShouldRequeue = jobsShouldRequeue;
	}

	public String getJobsSizesHistogramBuckets() {
		return jobsSizesHistogramBuckets;
	}

	public void setJobsSizesHistogramBuckets(String jobsSizesHistogramBuckets) {
		this.jobsSizesHistogramBuckets = jobsSizesHistogramBuckets;
	}

	public int getJobsStarted() {
		return jobsStarted;
	}

	public void setJobsStarted(int jobsStarted) {
		this.jobsStarted = jobsStarted;
	}

	public int getJobsSubmitted() {
		return jobsSubmitted;
	}

	public void setJobsSubmitted(int jobsSubmitted) {
		this.jobsSubmitted = jobsSubmitted;
	}

	public int getJobsWierdTimestamps() {
		return jobsWierdTimestamps;
	}

	public void setJobsWierdTimestamps(int jobsWierdTimestamps) {
		this.jobsWierdTimestamps = jobsWierdTimestamps;
	}

	public int getLastHeardFrom() {
		return lastHeardFrom;
	}

	public void setLastHeardFrom(int lastHeardFrom) {
		this.lastHeardFrom = lastHeardFrom;
	}

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	public int getMaxJobsRunning() {
		return maxJobsRunning;
	}

	public void setMaxJobsRunning(int maxJobsRunning) {
		this.maxJobsRunning = maxJobsRunning;
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

	public int getNumUsers() {
		return numUsers;
	}

	public void setNumUsers(int numUsers) {
		this.numUsers = numUsers;
	}

	public int getRecentAutoclusters() {
		return recentAutoclusters;
	}

	public void setRecentAutoclusters(int recentAutoclusters) {
		this.recentAutoclusters = recentAutoclusters;
	}

	public float getRecentDaemonCoreDutyCycle() {
		return recentDaemonCoreDutyCycle;
	}

	public void setRecentDaemonCoreDutyCycle(float recentDaemonCoreDutyCycle) {
		this.recentDaemonCoreDutyCycle = recentDaemonCoreDutyCycle;
	}

	public int getRecentJobsAccumBadputTime() {
		return recentJobsAccumBadputTime;
	}

	public void setRecentJobsAccumBadputTime(int recentJobsAccumBadputTime) {
		this.recentJobsAccumBadputTime = recentJobsAccumBadputTime;
	}

	public int getRecentJobsAccumChurnTime() {
		return recentJobsAccumChurnTime;
	}

	public void setRecentJobsAccumChurnTime(int recentJobsAccumChurnTime) {
		this.recentJobsAccumChurnTime = recentJobsAccumChurnTime;
	}

	public int getRecentJobsAccumExecuteAltTime() {
		return recentJobsAccumExecuteAltTime;
	}

	public void setRecentJobsAccumExecuteAltTime(int recentJobsAccumExecuteAltTime) {
		this.recentJobsAccumExecuteAltTime = recentJobsAccumExecuteAltTime;
	}

	public int getRecentJobsAccumExecuteTime() {
		return recentJobsAccumExecuteTime;
	}

	public void setRecentJobsAccumExecuteTime(int recentJobsAccumExecuteTime) {
		this.recentJobsAccumExecuteTime = recentJobsAccumExecuteTime;
	}

	public int getRecentJobsAccumPostExecuteTime() {
		return recentJobsAccumPostExecuteTime;
	}

	public void setRecentJobsAccumPostExecuteTime(int recentJobsAccumPostExecuteTime) {
		this.recentJobsAccumPostExecuteTime = recentJobsAccumPostExecuteTime;
	}

	public int getRecentJobsAccumPreExecuteTime() {
		return recentJobsAccumPreExecuteTime;
	}

	public void setRecentJobsAccumPreExecuteTime(int recentJobsAccumPreExecuteTime) {
		this.recentJobsAccumPreExecuteTime = recentJobsAccumPreExecuteTime;
	}

	public int getRecentJobsAccumRunningTime() {
		return recentJobsAccumRunningTime;
	}

	public void setRecentJobsAccumRunningTime(int recentJobsAccumRunningTime) {
		this.recentJobsAccumRunningTime = recentJobsAccumRunningTime;
	}

	public int getRecentJobsAccumTimeToStart() {
		return recentJobsAccumTimeToStart;
	}

	public void setRecentJobsAccumTimeToStart(int recentJobsAccumTimeToStart) {
		this.recentJobsAccumTimeToStart = recentJobsAccumTimeToStart;
	}

	public String getRecentJobsBadputRuntimes() {
		return recentJobsBadputRuntimes;
	}

	public void setRecentJobsBadputRuntimes(String recentJobsBadputRuntimes) {
		this.recentJobsBadputRuntimes = recentJobsBadputRuntimes;
	}

	public String getRecentJobsBadputSizes() {
		return recentJobsBadputSizes;
	}

	public void setRecentJobsBadputSizes(String recentJobsBadputSizes) {
		this.recentJobsBadputSizes = recentJobsBadputSizes;
	}

	public int getRecentJobsCheckpointed() {
		return recentJobsCheckpointed;
	}

	public void setRecentJobsCheckpointed(int recentJobsCheckpointed) {
		this.recentJobsCheckpointed = recentJobsCheckpointed;
	}

	public int getRecentJobsCompleted() {
		return recentJobsCompleted;
	}

	public void setRecentJobsCompleted(int recentJobsCompleted) {
		this.recentJobsCompleted = recentJobsCompleted;
	}

	public String getRecentJobsCompletedRuntimes() {
		return recentJobsCompletedRuntimes;
	}

	public void setRecentJobsCompletedRuntimes(String recentJobsCompletedRuntimes) {
		this.recentJobsCompletedRuntimes = recentJobsCompletedRuntimes;
	}

	public String getRecentJobsCompletedSizes() {
		return recentJobsCompletedSizes;
	}

	public void setRecentJobsCompletedSizes(String recentJobsCompletedSizes) {
		this.recentJobsCompletedSizes = recentJobsCompletedSizes;
	}

	public int getRecentJobsCoredumped() {
		return recentJobsCoredumped;
	}

	public void setRecentJobsCoredumped(int recentJobsCoredumped) {
		this.recentJobsCoredumped = recentJobsCoredumped;
	}

	public int getRecentJobsDebugLogError() {
		return recentJobsDebugLogError;
	}

	public void setRecentJobsDebugLogError(int recentJobsDebugLogError) {
		this.recentJobsDebugLogError = recentJobsDebugLogError;
	}

	public int getRecentJobsExecFailed() {
		return recentJobsExecFailed;
	}

	public void setRecentJobsExecFailed(int recentJobsExecFailed) {
		this.recentJobsExecFailed = recentJobsExecFailed;
	}

	public int getRecentJobsExited() {
		return recentJobsExited;
	}

	public void setRecentJobsExited(int recentJobsExited) {
		this.recentJobsExited = recentJobsExited;
	}

	public int getRecentJobsExitedAndClaimClosing() {
		return recentJobsExitedAndClaimClosing;
	}

	public void setRecentJobsExitedAndClaimClosing(int recentJobsExitedAndClaimClosing) {
		this.recentJobsExitedAndClaimClosing = recentJobsExitedAndClaimClosing;
	}

	public int getRecentJobsExitedNormally() {
		return recentJobsExitedNormally;
	}

	public void setRecentJobsExitedNormally(int recentJobsExitedNormally) {
		this.recentJobsExitedNormally = recentJobsExitedNormally;
	}

	public int getRecentJobsExitException() {
		return recentJobsExitException;
	}

	public void setRecentJobsExitException(int recentJobsExitException) {
		this.recentJobsExitException = recentJobsExitException;
	}

	public int getRecentJobsKilled() {
		return recentJobsKilled;
	}

	public void setRecentJobsKilled(int recentJobsKilled) {
		this.recentJobsKilled = recentJobsKilled;
	}

	public int getRecentJobsMissedDeferralTime() {
		return recentJobsMissedDeferralTime;
	}

	public void setRecentJobsMissedDeferralTime(int recentJobsMissedDeferralTime) {
		this.recentJobsMissedDeferralTime = recentJobsMissedDeferralTime;
	}

	public int getRecentJobsNotStarted() {
		return recentJobsNotStarted;
	}

	public void setRecentJobsNotStarted(int recentJobsNotStarted) {
		this.recentJobsNotStarted = recentJobsNotStarted;
	}

	public int getRecentJobsShadowNoMemory() {
		return recentJobsShadowNoMemory;
	}

	public void setRecentJobsShadowNoMemory(int recentJobsShadowNoMemory) {
		this.recentJobsShadowNoMemory = recentJobsShadowNoMemory;
	}

	public int getRecentJobsShouldHold() {
		return recentJobsShouldHold;
	}

	public void setRecentJobsShouldHold(int recentJobsShouldHold) {
		this.recentJobsShouldHold = recentJobsShouldHold;
	}

	public int getRecentJobsShouldRemove() {
		return recentJobsShouldRemove;
	}

	public void setRecentJobsShouldRemove(int recentJobsShouldRemove) {
		this.recentJobsShouldRemove = recentJobsShouldRemove;
	}

	public int getRecentJobsShouldRequeue() {
		return recentJobsShouldRequeue;
	}

	public void setRecentJobsShouldRequeue(int recentJobsShouldRequeue) {
		this.recentJobsShouldRequeue = recentJobsShouldRequeue;
	}

	public int getRecentJobsStarted() {
		return recentJobsStarted;
	}

	public void setRecentJobsStarted(int recentJobsStarted) {
		this.recentJobsStarted = recentJobsStarted;
	}

	public int getRecentJobsSubmitted() {
		return recentJobsSubmitted;
	}

	public void setRecentJobsSubmitted(int recentJobsSubmitted) {
		this.recentJobsSubmitted = recentJobsSubmitted;
	}

	public int getRecentJobsWierdTimestamps() {
		return recentJobsWierdTimestamps;
	}

	public void setRecentJobsWierdTimestamps(int recentJobsWierdTimestamps) {
		this.recentJobsWierdTimestamps = recentJobsWierdTimestamps;
	}

	public int getRecentShadowsStarted() {
		return recentShadowsStarted;
	}

	public void setRecentShadowsStarted(int recentShadowsStarted) {
		this.recentShadowsStarted = recentShadowsStarted;
	}

	public int getRecentStatsLifetime() {
		return recentStatsLifetime;
	}

	public void setRecentStatsLifetime(int recentStatsLifetime) {
		this.recentStatsLifetime = recentStatsLifetime;
	}

	public String getScheddIpAddr() {
		return scheddIpAddr;
	}

	public void setScheddIpAddr(String scheddIpAddr) {
		this.scheddIpAddr = scheddIpAddr;
	}

	public boolean isScheddSwapExhausted() {
		return scheddSwapExhausted;
	}

	public void setScheddSwapExhausted(boolean scheddSwapExhausted) {
		this.scheddSwapExhausted = scheddSwapExhausted;
	}

	public int getServerTime() {
		return serverTime;
	}

	public void setServerTime(int serverTime) {
		this.serverTime = serverTime;
	}

	public int getShadowsRunning() {
		return shadowsRunning;
	}

	public void setShadowsRunning(int shadowsRunning) {
		this.shadowsRunning = shadowsRunning;
	}

	public int getShadowsRunningPeak() {
		return shadowsRunningPeak;
	}

	public void setShadowsRunningPeak(int shadowsRunningPeak) {
		this.shadowsRunningPeak = shadowsRunningPeak;
	}

	public int getShadowsStarted() {
		return shadowsStarted;
	}

	public void setShadowsStarted(int shadowsStarted) {
		this.shadowsStarted = shadowsStarted;
	}

	public String getStartLocalUniverse() {
		return startLocalUniverse;
	}

	public void setStartLocalUniverse(String startLocalUniverse) {
		this.startLocalUniverse = startLocalUniverse;
	}

	public String getStartSchedulerUniverse() {
		return startSchedulerUniverse;
	}

	public void setStartSchedulerUniverse(String startSchedulerUniverse) {
		this.startSchedulerUniverse = startSchedulerUniverse;
	}

	public int getStatsLifetime() {
		return statsLifetime;
	}

	public void setStatsLifetime(int statsLifetime) {
		this.statsLifetime = statsLifetime;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public int getTotalFlockedJobs() {
		return totalFlockedJobs;
	}

	public void setTotalFlockedJobs(int totalFlockedJobs) {
		this.totalFlockedJobs = totalFlockedJobs;
	}

	public int getTotalHeldJobs() {
		return totalHeldJobs;
	}

	public void setTotalHeldJobs(int totalHeldJobs) {
		this.totalHeldJobs = totalHeldJobs;
	}

	public int getTotalIdleJobs() {
		return totalIdleJobs;
	}

	public void setTotalIdleJobs(int totalIdleJobs) {
		this.totalIdleJobs = totalIdleJobs;
	}

	public int getTotalJobAds() {
		return totalJobAds;
	}

	public void setTotalJobAds(int totalJobAds) {
		this.totalJobAds = totalJobAds;
	}

	public int getTotalLocalJobsIdle() {
		return totalLocalJobsIdle;
	}

	public void setTotalLocalJobsIdle(int totalLocalJobsIdle) {
		this.totalLocalJobsIdle = totalLocalJobsIdle;
	}

	public int getTotalLocalJobsRunning() {
		return totalLocalJobsRunning;
	}

	public void setTotalLocalJobsRunning(int totalLocalJobsRunning) {
		this.totalLocalJobsRunning = totalLocalJobsRunning;
	}

	public int getTotalRemovedJobs() {
		return totalRemovedJobs;
	}

	public void setTotalRemovedJobs(int totalRemovedJobs) {
		this.totalRemovedJobs = totalRemovedJobs;
	}

	public int getTotalRunningJobs() {
		return totalRunningJobs;
	}

	public void setTotalRunningJobs(int totalRunningJobs) {
		this.totalRunningJobs = totalRunningJobs;
	}

	public int getTotalSchedulerJobsIdle() {
		return totalSchedulerJobsIdle;
	}

	public void setTotalSchedulerJobsIdle(int totalSchedulerJobsIdle) {
		this.totalSchedulerJobsIdle = totalSchedulerJobsIdle;
	}

	public int getTotalSchedulerJobsRunning() {
		return totalSchedulerJobsRunning;
	}

	public void setTotalSchedulerJobsRunning(int totalSchedulerJobsRunning) {
		this.totalSchedulerJobsRunning = totalSchedulerJobsRunning;
	}

	public int getTransferQueueDownloadWaitTime() {
		return transferQueueDownloadWaitTime;
	}

	public void setTransferQueueDownloadWaitTime(int transferQueueDownloadWaitTime) {
		this.transferQueueDownloadWaitTime = transferQueueDownloadWaitTime;
	}

	public int getTransferQueueDownloadWaitTimePeak() {
		return transferQueueDownloadWaitTimePeak;
	}

	public void setTransferQueueDownloadWaitTimePeak(int transferQueueDownloadWaitTimePeak) {
		this.transferQueueDownloadWaitTimePeak = transferQueueDownloadWaitTimePeak;
	}

	public int getTransferQueueMaxDownloading() {
		return transferQueueMaxDownloading;
	}

	public void setTransferQueueMaxDownloading(int transferQueueMaxDownloading) {
		this.transferQueueMaxDownloading = transferQueueMaxDownloading;
	}

	public int getTransferQueueMaxUploading() {
		return transferQueueMaxUploading;
	}

	public void setTransferQueueMaxUploading(int transferQueueMaxUploading) {
		this.transferQueueMaxUploading = transferQueueMaxUploading;
	}

	public int getTransferQueueNumDownloading() {
		return transferQueueNumDownloading;
	}

	public void setTransferQueueNumDownloading(int transferQueueNumDownloading) {
		this.transferQueueNumDownloading = transferQueueNumDownloading;
	}

	public int getTransferQueueNumDownloadingPeak() {
		return transferQueueNumDownloadingPeak;
	}

	public void setTransferQueueNumDownloadingPeak(int transferQueueNumDownloadingPeak) {
		this.transferQueueNumDownloadingPeak = transferQueueNumDownloadingPeak;
	}

	public int getTransferQueueNumUploading() {
		return transferQueueNumUploading;
	}

	public void setTransferQueueNumUploading(int transferQueueNumUploading) {
		this.transferQueueNumUploading = transferQueueNumUploading;
	}

	public int getTransferQueueNumUploadingPeak() {
		return transferQueueNumUploadingPeak;
	}

	public void setTransferQueueNumUploadingPeak(int transferQueueNumUploadingPeak) {
		this.transferQueueNumUploadingPeak = transferQueueNumUploadingPeak;
	}

	public int getTransferQueueNumWaitingToDownload() {
		return transferQueueNumWaitingToDownload;
	}

	public void setTransferQueueNumWaitingToDownload(int transferQueueNumWaitingToDownload) {
		this.transferQueueNumWaitingToDownload = transferQueueNumWaitingToDownload;
	}

	public int getTransferQueueNumWaitingToDownloadPeak() {
		return transferQueueNumWaitingToDownloadPeak;
	}

	public void setTransferQueueNumWaitingToDownloadPeak(int transferQueueNumWaitingToDownloadPeak) {
		this.transferQueueNumWaitingToDownloadPeak = transferQueueNumWaitingToDownloadPeak;
	}

	public int getTransferQueueNumWaitingToUpload() {
		return transferQueueNumWaitingToUpload;
	}

	public void setTransferQueueNumWaitingToUpload(int transferQueueNumWaitingToUpload) {
		this.transferQueueNumWaitingToUpload = transferQueueNumWaitingToUpload;
	}

	public int getTransferQueueNumWaitingToUploadPeak() {
		return transferQueueNumWaitingToUploadPeak;
	}

	public void setTransferQueueNumWaitingToUploadPeak(int transferQueueNumWaitingToUploadPeak) {
		this.transferQueueNumWaitingToUploadPeak = transferQueueNumWaitingToUploadPeak;
	}

	public int getTransferQueueUploadWaitTime() {
		return transferQueueUploadWaitTime;
	}

	public void setTransferQueueUploadWaitTime(int transferQueueUploadWaitTime) {
		this.transferQueueUploadWaitTime = transferQueueUploadWaitTime;
	}

	public int getTransferQueueUploadWaitTimePeak() {
		return transferQueueUploadWaitTimePeak;
	}

	public void setTransferQueueUploadWaitTimePeak(int transferQueueUploadWaitTimePeak) {
		this.transferQueueUploadWaitTimePeak = transferQueueUploadWaitTimePeak;
	}

	public String getTransferQueueUserExpr() {
		return transferQueueUserExpr;
	}

	public void setTransferQueueUserExpr(String transferQueueUserExpr) {
		this.transferQueueUserExpr = transferQueueUserExpr;
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

	public boolean isWantResAd() {
		return wantResAd;
	}

	public void setWantResAd(boolean wantResAd) {
		this.wantResAd = wantResAd;
	}

}