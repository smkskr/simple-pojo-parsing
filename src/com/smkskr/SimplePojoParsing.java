package com.smkskr;

public class SimplePojoParsing {
	
	public static void main(String args[]) {
		
		GenerateData generateData = new GenerateData();
		Calendar calendar  = generateData.getCalendar();
		
		
		System.out.println(calendar.getMeetingTitle());
		System.out.println(calendar.getTimeZone());
		System.out.println(calendar.getOrganizer());
		System.out.println(calendar.getAttendees());
		System.out.println(calendar.getDate());
	}

}

