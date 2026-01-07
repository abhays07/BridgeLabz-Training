
public class Event implements ISchedulable {

	private final int eventId;
	protected String eventName;
	protected String location;
	protected String date;
	protected int attendees;
	
	private double venueCost;
	private double serviceCost;
	private double discount;
	
	protected User organizer;
	
	
	public Event(int eventId, String eventName, String location, String date, int attendees, double venueCost, User organizer ) {
		this.eventId= eventId;
		this.eventName = eventName;
		this.location = location;
		this.date = date;
		this.attendees = attendees;
		this.venueCost= venueCost;
		this.organizer= organizer;
	}
	
	// Constructor with catering / decoration services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, double venueCost, double serviceCost,
                 double discount, User organizer) {
        this(eventId, eventName, location, date, attendees, venueCost, organizer);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }
    
    protected double calculateTotalCost() {
    	return venueCost + serviceCost - discount;
    }
	
    public int getEventId() {
    	return eventId;
    }
	
    @Override
    public void schedule() {
    	System.out.println("Event Scheduled on : "+ date);
    }
    
    @Override
    public void reschedule(String newDate) {
    	System.out.println("Event Re Scheduled to : "+ newDate);
    }
    
    @Override
    public void cancel() {
    	System.out.println("Event cancelled Successfully");
    }
	
}
