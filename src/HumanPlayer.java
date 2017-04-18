
import java.util.*;

/**
 * This class inherits from Class Player. It implements Play method which takes input from Keyboard for a human player.
 * @see Player
 */
public class HumanPlayer extends Player {
/**
 * @see Player
 * @param playerName Player Name to be set.
 */
	public HumanPlayer(String playerName) {
		super(playerName);
	}
/**
 * Implements Play method which takes input from Keyboard for a human player.
 * @return Play Object .
 * @see Play
 */
	@Override
	public Play Play() {
		Play p ;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(this.getPlayerName() + " please enter number between 1 and 10 ");
			while (!sc.hasNextInt()) {
				System.out.println("Invalid entry, ONLY integer value is accepted ");
				sc.next();
			}
		
		 int play = sc.nextInt();
		 if (play <0)
			 play *= -1;// to convert negative input to the positive value
		
		//int playAsType = tmp;
			//int t = s.nextInt(); 
			//int play= tmp;
			p = new Play(play);
		} while (!ValidPlay(p));
		AddPlayHistory(p);
		return p;
	}
}
