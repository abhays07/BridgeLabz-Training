
public class ConferenceEvent extends Event {
	
	public ConferenceEvent(int eventId, String location, String date,
            int attendees, double venueCost, double serviceCost,
            User organizer) {
		 super(eventId, "Conference", location, date,
	              attendees, venueCost, serviceCost, 0, organizer);
	}
	
	@Override
	public void schedule() {
		  System.out.println("Conference scheduled with projector & seating setup");
	      System.out.println("Total Cost: " + calculateTotalCost());
	}
}
