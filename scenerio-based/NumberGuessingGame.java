import java.util.Scanner;

/*7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
 */
public class NumberGuessingGame {
	public static void guessNumber() {
		int comNumber =(int) (Math.random()*100)+1;
		int chances =5;
		do {
			Scanner sc = new Scanner (System.in);
			System.out.println("Guess the number between 1 to 100 ");
			int userNumber = sc.nextInt();
			System.out.println("Chances left : "+ (chances-1));
			if (userNumber>comNumber) {
				System.out.println("Too High");
			}
			else if (userNumber<comNumber) {
				System.out.println("Too Low");
			}
			else {
				System.out.println("You guessed it right ");
			}
			chances--;
		} while (chances>0);
			if (chances==0) {
				System.out.println("Game Over");
				System.out.println("The correct number is : " + comNumber);
			}
	}
	public static void main(String[] args) {
		guessNumber();
	}

}
