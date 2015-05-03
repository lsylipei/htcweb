package com.lipei.htcweb.server;

import com.lipei.htcweb.data.CondorServer;

public abstract class AbstractServer {
	protected CondorServer condorServer;

	abstract public void init();

	public void setCondorServer(CondorServer condorServer) {
		this.condorServer = condorServer;
	}

	public CondorServer getCondorServer() {
		return condorServer;
	}
}
