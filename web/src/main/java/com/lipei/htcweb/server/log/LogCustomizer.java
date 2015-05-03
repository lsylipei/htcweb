package com.lipei.htcweb.server.log;

import org.eclipse.persistence.dynamic.DynamicHelper.SessionCustomizer;
import org.eclipse.persistence.sessions.Session;

public class LogCustomizer extends SessionCustomizer {

	@Override
	public void customize(Session session) throws Exception {
		CustomLogSession logger = new CustomLogSession();
		logger.setLevel(1);
		session.setSessionLog(logger);
	}

}
