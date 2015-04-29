package com.lipei.htcweb.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;

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

	@Override
	public boolean equals(Object arg0) {
		if (arg0 == this) {
			return true;
		}
		if (arg0 instanceof CondorServer) {
			CondorServer other = (CondorServer) arg0;

			return StringUtils.equals(id, other.id) && StringUtils.equals(address, other.address) && port == other.port;

		}
		return false;
	}
}
