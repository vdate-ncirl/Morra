
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
		do {
			Random rand = new Random(); // We need to change this to take input from console once we are happy with testing.
			int play= rand.nextInt(10) + 1;
			p = new Play(play);
		} while (!ValidPlay(p));
		AddPlayHistory(p);
		return p;
	}
}
