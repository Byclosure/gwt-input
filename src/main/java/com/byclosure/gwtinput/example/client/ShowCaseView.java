package com.byclosure.gwtinput.example.client;

import com.byclosure.gwtinput.ui.widgets.BaseInput;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ShowCaseView extends Composite {

	@UiField(provided=true)
	I18nDict dict;
	
	@UiField
	BaseInput input;
	
	private static ShowCaseViewUiBinder uiBinder = GWT.create(ShowCaseViewUiBinder.class);

	interface ShowCaseViewUiBinder extends UiBinder<Widget, ShowCaseView> {
	}

	public ShowCaseView() {
		initWidget(uiBinder.createAndBindUi(this));
		dict = new I18nDict();
	}

}
