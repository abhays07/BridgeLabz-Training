
import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private List<Game> ownedGames = new ArrayList<Game>();
	
	public User(String name) {
		this.name = name;
	}
    public void purchaseGame(Game game) {
        ownedGames.add(game);
        System.out.println(name + " purchased " + game.getTitle());
    }

    public void showOwnedGames() {
        for (Game g : ownedGames) {
            System.out.println(g.getTitle() + " - ₹" + g.getPrice());
        }
    }
}
