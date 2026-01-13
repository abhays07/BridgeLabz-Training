
abstract public class Game implements IDownloadable {
	private	String title;
	private	String genre;
	protected	double price;
	protected double rating;
	
	// Constructor for paid games
	public Game(String title, String genre, double price, double rating) {
		this.title=title;
		this.genre=genre;
		this.price=price;
		this.rating=rating;
	}
	
	// Constructor for free games
	public Game(String title, String genre, double rating) {
		this(title, genre,0, rating);
	}
	
	// Apply discount (Seasonal)
	public void applyDiscount(double percentage) {
		price=price-(price*percentage/100);
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	  @Override
	    public void download() {
	        System.out.println(title + " downloaded successfully");
	    }
}
