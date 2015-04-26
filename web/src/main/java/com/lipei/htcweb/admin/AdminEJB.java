package com.lipei.htcweb.admin;

import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

@Stateless
public class AdminEJB {

	public static final String AUTH = "auth";

	public String login(String user, String pass) {

		if (StringUtils.equals(user, "admin") && StringUtils.equals(pass, "admin")) {

			FacesContext ctx = FacesContext.getCurrentInstance();
			HttpServletRequest req = (HttpServletRequest) ctx.getExternalContext().getRequest();
			req.getSession().setAttribute(AUTH, new Object());
			return "dashboard.xhtml";

		}

		return "login.xhtml";
	}
}
