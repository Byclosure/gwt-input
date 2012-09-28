package com.byclosure.gwtinput.ui.widgets;

public interface IValidityState {
	boolean hasCustomError();
	boolean hasPatternMismatch();
	boolean hasRangeOverflow();
	boolean hasRangeUnderflow();
	boolean hasStepMismatch();
	boolean isTooLong();
	boolean isTypeMismatch();
	boolean isValid();
	boolean isValueMissing();
}
