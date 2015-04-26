package com.lipei.htcweb.filter;

import java.io.IOException;

import javax.faces.application.ResourceHandler;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lipei.htcweb.admin.AdminEJB;

public class ProcessFilter implements Filter {

	private static final String LOGIN_URL = "/login.xhtml";
	private FilterConfig fc;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

		fc = filterConfig;
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException,
			ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpSession session = request.getSession(true);

		Object auth;
		if (session != null) {
			auth = (Object) session.getAttribute(AdminEJB.AUTH);
		} else {
			auth = null;
		}
		String loginURL = request.getContextPath() + "/login.xhtml";

		boolean loggedIn = auth != null;
		boolean loginRequest = request.getRequestURI().equals(loginURL);
		boolean resourceRequest = request.getRequestURI().startsWith(
				request.getContextPath() + ResourceHandler.RESOURCE_IDENTIFIER);

		if (loggedIn || loginRequest || resourceRequest) {
			if (!resourceRequest) {
				response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP
																							// 1.1.
				response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
				response.setDateHeader("Expires", 0); // Proxies.
			}

			chain.doFilter(request, response);
		} else {
			response.sendRedirect(loginURL);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
