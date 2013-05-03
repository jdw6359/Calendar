package com.std.model.appointment;

import com.std.model.pattern.RecurrencePattern;

public interface AppointmentStrategy {	
	
	public String getPatternDescription(RecurrencePattern pattern);

}
