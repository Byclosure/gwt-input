package com.byclosure.gwtinput.ui.widgets;

import com.google.gwt.core.client.JavaScriptObject;

public class ValidityState extends JavaScriptObject implements IValidityState {

	protected ValidityState(){}
	
	@Override
	public final native boolean hasCustomError() /*-{
		return this.hasCustomError;
	}-*/;

	@Override
	public final native boolean hasPatternMismatch() /*-{
		return this.hasPatternMismatch;
	}-*/;

	@Override
	public native final boolean hasRangeOverflow() /*-{
		return this.hasRangeOverflow;
	}-*/;

	@Override
	public native final  boolean hasRangeUnderflow()/*-{
		return this.hasRangeUnderflow;
	}-*/;

	@Override
	public native final boolean hasStepMismatch() /*-{
		return this.hasStepMismatch;
	}-*/;

	@Override
	public native final boolean isTooLong() /*-{
		return this.isTooLong;
	}-*/;

	@Override
	public native final boolean isTypeMismatch() /*-{
		return this.isTypeMismatch;
	}-*/;

	@Override
	public native final boolean isValid()/*-{
		return this.isValid;
	}-*/;

	@Override
	public native final boolean isValueMissing()/*-{
		return this.isValueMissing;
	}-*/;

}
