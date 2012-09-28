package com.byclosure.gwtinput.ui.widgets;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.TextBox;

public class BaseInput extends TextBox implements IsUserInput {

	private static final String REQUIRED = "required";
	private static final String TYPE = "type";

	public BaseInput(){}
	
	public BaseInput(InputType type) {
		super();
		setType(type.getType());
	}
	
	public IValidityState getValidityState(){
		return getNativeValidityState(getElement());
	}
	
	public boolean isValid(){
		return checkValidity(getElement());
	}
	
	/*
	 * UIBuinder API 
	 */
	@Override
	public void setRequired(boolean isRequired){
		getElement().setAttribute(REQUIRED, String.valueOf(isRequired));
	}
	
	@Override
	public void setType(String type) {
		getElement().setAttribute(TYPE, type);
	}
	
	/*
	 *  Helper native methods
	 */
	protected final native ValidityState getNativeValidityState(Element element)/*-{
		return element.validity;
	}-*/;
	
	protected final native  boolean  checkValidity(Element element)/*-{
		return element.checkValidity();
	}-*/;
	
	protected final native  boolean  willValidate(Element element)/*-{
		return element.willValidate();
	}-*/;

}
