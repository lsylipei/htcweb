package com.lipei.htcweb.status;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.lipei.htcweb.data.CondorServer;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractClassAdsInfo {

	@Id
	@GeneratedValue
	protected long id;

	protected long serid;

	@ManyToOne(fetch = FetchType.LAZY)
	public CondorServer server;

	public long getSerid() {
		return serid;
	}

	public void setSerid(long serid) {
		this.serid = serid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CondorServer getServer() {
		return server;
	}

	public void setServer(CondorServer server) {
		this.server = server;
	}

}
