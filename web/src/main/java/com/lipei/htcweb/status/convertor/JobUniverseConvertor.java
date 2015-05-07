package com.lipei.htcweb.status.convertor;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("JobUniverseConvertor")
public class JobUniverseConvertor implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {

		if (value instanceof Integer) {
			Integer i = (Integer) value;
			return JobUniverse.getByValue(i).getName();
		}
		return null;
	}

}
