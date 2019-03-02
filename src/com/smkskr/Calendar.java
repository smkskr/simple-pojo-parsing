package com.smkskr;

import java.util.ArrayList;

public class Calendar {
	
	private String meetingTitle;
	private String timeZone;
	private ArrayList<String> attendees;
	private String organizer;
	private String date;
	
	//Getters and Setters
	public String getMeetingTitle() {
		return meetingTitle;
	}
	public void setMeetingTitle(String meetingTitle) {
		this.meetingTitle = meetingTitle;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public ArrayList<String> getAttendees() {
		return attendees;
	}
	public void setAttendees(ArrayList<String> attendees) {
		this.attendees = attendees;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	

}
