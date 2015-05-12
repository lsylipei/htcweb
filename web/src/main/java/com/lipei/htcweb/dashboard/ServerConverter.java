package com.lipei.htcweb.dashboard;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;

import com.lipei.htcweb.server.Server;
import com.lipei.htcweb.server.ServerEJB;

@FacesConverter("ServerConverter")
public class ServerConverter implements Converter {

	@Inject
	ServerEJB ejb;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {

		List<Server> list = ejb.getServerList();
		for (Server server : list) {
			if (StringUtils.equals(server.getCondorServer().getAddress(), value)) {
				return server;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof Server) {
			Server server = (Server) value;
			return server.getCondorServer().getAddress();
		}
		return null;
	}

}
