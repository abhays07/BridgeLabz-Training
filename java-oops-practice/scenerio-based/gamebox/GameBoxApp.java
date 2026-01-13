
import java.util.Scanner;

public class GameBoxApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user name: ");
        User user = new User(sc.nextLine());

        int choice;

        do {
            System.out.println("\n===== GAMEBOX MENU =====");
            System.out.println("1. Add Game");
            System.out.println("2. View Owned Games");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter game title: ");
                    String title = sc.nextLine();

                    System.out.print("Select genre (1-Arcade, 2-Strategy): ");
                    int genreChoice = sc.nextInt();

                    System.out.print("Is it free? (true/false): ");
                    boolean isFree = sc.nextBoolean();

                    System.out.print("Enter rating: ");
                    double rating = sc.nextDouble();

                    Game game;

                    if (genreChoice == 1) {
                        if (isFree) {
                            game = new Arcadegame(title, rating);
                        } else {
                            System.out.print("Enter price: ");
                            double price = sc.nextDouble();
                            game = new Arcadegame(title, price, rating);
                        }
                    } else {
                        if (isFree) {
                            game = new StrategyGame(title, rating);
                        } else {
                            System.out.print("Enter price: ");
                            double price = sc.nextDouble();
                            game = new StrategyGame(title, price, rating);
                        }
                    }

                    System.out.print("Enter discount percentage: ");
                    double discount = sc.nextDouble();
                    game.applyDiscount(discount);

                    user.purchaseGame(game);

                    // Demo / Download choice
                    System.out.println("\nChoose Action:");
                    System.out.println("1. Play Demo");
                    System.out.println("2. Download Game");
                    System.out.print("Enter choice: ");
                    int action = sc.nextInt();

                    if (action == 1) {
                        game.playDemo();
                    } else if (action == 2) {
                        game.download();
                    } else {
                        System.out.println("Invalid action");
                    }
                    break;

                case 2:
                    user.showOwnedGames();
                    break;

                case 3:
                    System.out.println("Exiting GameBox...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
