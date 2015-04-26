package com.lipei.htcweb.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CondorServer {
	@Id
	@GeneratedValue
	private String id;

	private String address;
	private int port;

	@Transient
	private CondorServerStatus status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public CondorServerStatus getStatus() {
		return status;
	}

	public void setStatus(CondorServerStatus status) {
		this.status = status;
	}

}
