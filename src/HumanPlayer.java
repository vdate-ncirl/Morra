
import java.util.*;

/**
 * This class inherits from Class Player. It implements Play method which takes
 * input from Keyboard for a human player.
 * 
 * @see Player
 */
public class HumanPlayer extends Player {
	/**
	 * @see Player
	 * @param playerName
	 *            Player Name to be set.
	 */
	public HumanPlayer(String playerName) {
		super(playerName);
	}

	/**
	 * Implements Play method which takes input from Keyboard for a human
	 * player.
	 * 
	 * @return Play Object .
	 * @see Play
	 */
	@Override
	public Play Play() {
		Play p;
		int play;
		Scanner sc = new Scanner(System.in);
		do {
			/* If the user gives rubbish input, ask again --cm */
			System.out.print(this.getPlayerName() + " pick a Number between 1 and 10(Duplicate last Play would be rejected): ");
			while (!sc.hasNextInt()) {
				System.out.println("Invalid entry, ONLY integers {1-10} accepted ");
				sc.next();
			}

			play = sc.nextInt();
			if (play < 0) {
				play *= -1;// to convert negative input to the positive value
				System.out.println("You entered a negative value - But I am positive, I will the ignore negative part");
			}
			
			if (play > 10) { // if larger than 10, then change to modulus 10
				System.out.println("You entered a value larger than 10 - Modulated to Base 10.");
				play = play % 10;
			}
			
			if (play == 0 ) {
				System.out.println("You picked 0, I will replace your play with a random pick");
				Random rand = new Random(); 
				play= rand.nextInt(10) + 1;
			}
			p = new Play(play);
		} while (!ValidPlay(p));
		AddPlayHistory(p);
		return p;
	}
}
