package com.byclosure.gwtinput.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Showcase implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		ShowCaseView view = new ShowCaseView();
		RootPanel.get().add(view);

	}

}
