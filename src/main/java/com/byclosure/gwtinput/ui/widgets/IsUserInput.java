package com.byclosure.gwtinput.ui.widgets;

import com.google.gwt.user.client.ui.HasText;

public interface IsUserInput {
	
	static final String REQUIRED = "required";
	static final String TYPE = "type";
	
	void setRequired(boolean isRequired);
	
	void setType(String type);
	
	void setName(String name);
	
	void setErrorLabel(HasText errorLabel);
	
	void setErrorMessage(String message);
	
	void checkValidity();
}
