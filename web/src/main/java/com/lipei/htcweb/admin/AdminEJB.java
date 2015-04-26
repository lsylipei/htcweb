package com.lipei.htcweb.admin;

import java.util.List;

import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.lipei.htcweb.data.CondorServer;

@Named
@Stateless
public class AdminEJB {

	public static final String AUTH = "auth";

	@PersistenceContext
	private EntityManager em;

	public String login(String user, String pass) {

		if (StringUtils.equals(user, "admin") && StringUtils.equals(pass, "admin")) {

			FacesContext ctx = FacesContext.getCurrentInstance();
			HttpServletRequest req = (HttpServletRequest) ctx.getExternalContext().getRequest();
			req.getSession().setAttribute(AUTH, new Object());
			return "dashboard.xhtml";

		}

		return "login.xhtml";
	}

	public List<CondorServer> getServerList() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<CondorServer> query = builder.createQuery(CondorServer.class);
		TypedQuery<CondorServer> q = em.createQuery(query);
		return q.getResultList();
	}
}
