
public class Arcadegame extends Game {
	
	public Arcadegame(String title, double price, double rating) {
		super(title, "Arcade", price, rating);
	}
	
	public Arcadegame(String title, double rating) {
		super(title, "Arcade", rating);
	}
	@Override
	public	void playDemo() {
		System.out.println("Demo Arcade Game quick timed level");
	}
}
