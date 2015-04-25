package com.lipei.htcweb.admin;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class AdminController {

	@Inject
	private AdminEJB adminejb;

}
