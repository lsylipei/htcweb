package com.lipei.htcweb.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Admin {
	@Id
	@GeneratedValue
	private String id;
	@NotNull
	private String name;
	@NotNull
	private String password;

}
