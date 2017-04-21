
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
		Scanner sc = new Scanner(System.in);
		do {
			/* If the user gives rubbish input, ask again --cm */
			System.out.print(this.getPlayerName() + " please enter number fingers between 1 and 10: ");
			while (!sc.hasNextInt()) {
				System.out.println("Invalid entry, ONLY integers {1-10} accepted ");
				sc.next();
			}

			int play = sc.nextInt();
			if (play < 0) {
				play *= -1;// to convert negative input to the positive value
				System.out.println("You entered a negetive value - But I am positve, I will the ignore negetive part");
			}	
			if (play > 10) { // if larger than 10, then change to modulus 10
				System.out.println("You entered a value larger than 10 - Modulated to Base 10.");
				play = play % 10;
			}
			// int playAsType = tmp;
			// int t = s.nextInt();
			// int play= tmp;
			p = new Play(play);
		} while (!ValidPlay(p));
		AddPlayHistory(p);
		return p;
	}
}
