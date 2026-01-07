
public class BirthdayEvent extends Event{
	public BirthdayEvent(int eventId, String location, String date,
            int attendees, double venueCost, double serviceCost,
            double discount, User organizer) {
		super(eventId,"Birthday Party", location, date, attendees, venueCost, serviceCost, discount, organizer);
	}
	
	public void schedule() {
		 System.out.println("Birthday Event scheduled with cake & decorations");
	     System.out.println("Total Cost: " + calculateTotalCost());
	}
}
