package com.smkskr;

import java.util.ArrayList;

public class GenerateData {
	
	private Calendar calendar;
	
	/*
	 * This method is used to generate data manually using constructor,
	 * but it can be used to generate data using an API and finally storing it in the Model(Calendar) Class
	 * in order to retrieve . 
	 */
	GenerateData(){
		Calendar calendar = new Calendar();
		calendar.setMeetingTitle("Meeting One");
		calendar.setOrganizer("Google");
		calendar.setTimeZone("EST");
		
		ArrayList<String> attendees = new ArrayList<String>();
		attendees.add("Sergey Brin");
		attendees.add("Larry Page");
		calendar.setAttendees(attendees);
		
		calendar.setDate("2nd March, 2019");
		setCalendar(calendar);
	}
	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	
}
