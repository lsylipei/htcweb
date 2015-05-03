package com.lipei.htcweb.server.log;

import org.eclipse.persistence.logging.AbstractSessionLog;
import org.eclipse.persistence.logging.SessionLog;
import org.eclipse.persistence.logging.SessionLogEntry;

public class CustomLogSession extends AbstractSessionLog implements SessionLog {

	@Override
	public void log(SessionLogEntry sessionLogEntry) {
		System.out.println("CUSTOM: " + sessionLogEntry.getMessage());
	}
}
