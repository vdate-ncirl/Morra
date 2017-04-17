
import java.util.*;
/**
 * This class inherits from Class Player. It implements Play method which generates Random number as Play.
 * @see Player
 */

public class VirtualPlayer extends Player {
	/**
	 * @see Player
	 * @param playerName Player Name to be set.
	 */
	public VirtualPlayer(String playerName) {
		super(playerName);
	}
	/**
	 * Implements Play method which takes input from Keyboard for a human player.which generates Random number as Play.
	 * @return Play Object .
	 * @see Play
	 */
	@Override
	public Play Play() {
		Play p ;
		do {
			Random rand = new Random(); 
			int play= rand.nextInt(10) + 1;
			p = new Play(play);
		} while (!ValidPlay(p));
		AddPlayHistory(p);
		return p;
	}
}
