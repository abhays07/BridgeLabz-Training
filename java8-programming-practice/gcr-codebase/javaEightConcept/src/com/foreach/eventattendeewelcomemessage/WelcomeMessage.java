package com.foreach.eventattendeewelcomemessage;

import java.util.ArrayList;
import java.util.List;

public class WelcomeMessage {
	public static void main(String[] args) {
		List<Attendee> attendees = new ArrayList<>();

		attendees.add(new Attendee(1, "Abhay"));
		attendees.add(new Attendee(2, "Rohit"));
		attendees.add(new Attendee(3, "Neha"));
		attendees.add(new Attendee(4, "Priya"));
		attendees.add(new Attendee(5, "Karan"));
		attendees.add(new Attendee(6, "Sneha"));
		attendees.add(new Attendee(7, "Vikram"));
		attendees.add(new Attendee(8, "Anjali"));
		attendees.add(new Attendee(9, "Suresh"));
		attendees.add(new Attendee(10, "Pooja"));

		attendees.forEach(attendee -> System.out.println("Welcome to the Event : "+ attendee.getName()+"!"));
	}
}
