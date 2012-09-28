package com.byclosure.gwtinput.ui.widgets;

public enum InputType {
	TEXT("text"),
	EMAIL("email"),
	TELEPHONE("tel"),
	URL("url"),
	SEARCH("search"),
	COLOR("color"),
	NUMBER("number"),
	RANGE("range"),
	DATE("date");
	
	private final String type;

	InputType(String type){
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
