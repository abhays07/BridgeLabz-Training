package com.foreach.emailnotifications;

import java.util.ArrayList;
import java.util.List;

public class EmailNotificationApp {
	 private static void sendEmailNotification(String email) {
	        System.out.println("Notification email sent to: " + email);
	    }
	public static void main(String[] args) {
		   // Step 1: List of user email addresses
        List<String> emails = new ArrayList<>();

        emails.add("abhay@gmail.com");
        emails.add("rohit@gmail.com");
        emails.add("neha@gmail.com");
        emails.add("priya@gmail.com");
        emails.add("karan@gmail.com");
        emails.add("sneha@gmail.com");
        emails.add("vikram@gmail.com");
        emails.add("anjali@gmail.com");
        emails.add("suresh@gmail.com");
        emails.add("pooja@gmail.com");
        
        emails.forEach(email->sendEmailNotification(email));
	}
}
