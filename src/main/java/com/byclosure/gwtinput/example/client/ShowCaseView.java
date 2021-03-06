package com.byclosure.gwtinput.example.client;

import com.byclosure.gwtinput.ui.widgets.TextInput;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ShowCaseView extends Composite {

	@UiField(provided=true)
	I18nDict dict;
	
	@UiField
	TextInput input;
	
	@UiField
	Button btn;
	
	private static ShowCaseViewUiBinder uiBinder = GWT.create(ShowCaseViewUiBinder.class);

	interface ShowCaseViewUiBinder extends UiBinder<Widget, ShowCaseView> {
	}

	public ShowCaseView() {
		dict = new I18nDict();
		initWidget(uiBinder.createAndBindUi(this));
		
		btn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				input.checkValidity();
			}
		});
	}
}
