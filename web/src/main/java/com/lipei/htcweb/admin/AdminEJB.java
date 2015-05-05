package com.lipei.htcweb.admin;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.lipei.htcweb.data.CondorServer;
import com.lipei.htcweb.server.ServerEJB;

@Named
@Stateless
public class AdminEJB {

	public static final String AUTH = "auth";

	@PersistenceContext
	private EntityManager em;

	@Inject
	ServerEJB serverejb;

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

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public CondorServer addServer(String address, int port, int schPort) throws Exception {

		List<CondorServer> list = getServerList();
		CondorServer server = new CondorServer();
		server.setAddress(address);
		server.setColPort(port);
		server.setSchPort(schPort);
		if (list.contains(server)) {
			return null;
		}

		em.persist(server);

		serverejb.add(server);

		return null;
	}
}
