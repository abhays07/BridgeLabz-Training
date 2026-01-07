
public class EventEaseApp {

	public static void main(String[] args) {
		User birthdayOrganizer = new User("Abhay", "Abhay@gmail.com" , "9340056987");
		Event e1 = new BirthdayEvent(1, "Bhopal", "10/10/2026", 30, 30000, 2000, 1500, birthdayOrganizer );
		
		User conferenceOrganizer = new User("Shifa" , "Shifa@gmail.com", "6265672254");
		
		Event e2 = new ConferenceEvent(2, "Panna", "20/01/2026", 50, 10000, 1000, conferenceOrganizer);
		
		e1.schedule();
		e2.schedule();
		
		
		System.out.println(e1.getEventId());
		
	}

}
