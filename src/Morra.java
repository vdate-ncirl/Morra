
/**
 * 
�Morra� is a hand game usually played for entertainment or to settle a disagreement. The game has many variations and can be played by two or more players. 

Morra Odds and Evens Variation
In this variation of the game, one player is going to be the �Odds� player and the other player is the �Evens� player. 
In each round of the game, the players will simultaneously hold out between 1 and 10 fingers. 
The winner of the round is decided based on the sum of fingers shown by both players, namely 
if the sum is an even number then the �Evens� player wins,
 otherwise if the sum is an odd number then the �Odds� player wins.
 The winner of the round receives two points.  
 In addition, the player whose number of fingers is closer to the sum, receives one extra point.
The winner of the game is the first player who accumulates six points. 

 *  @author Vinit Date, Carl Mohn and Rajeeva Revankar 
 */

//import java.util.*;
/**
 *  
 * Main class to start the Game.  
 */

 

public class Morra {
	/** The main method instantiates MorraApp Objects which provides further Objects and method for the "Morra Game Application"
	 * The flow is a simple three step loop until winner is found.
	 * <ol>
	 * <li> Instantiate MorraApp with name's of players , defined in Constants Class</li>
	 * <li>Play a Session </li>
	 * <li>Display Result </li>
	 *  </ol>
	 *  loop back until winner found.
	 *  @see Constants
	 *  @param args unused, may be used in future.
	 */
	public static void main(String[] args) {
		MorraApp mApp = new MorraApp(Constants.HUMANPLAYER, Constants.VIRTUALPLAYER);
		mApp.init();
		boolean foundWinner;
		do{
			Game[] g = mApp.RunGameRound();
			mApp.ComputeAndSaveResult(g);
			mApp.DisplayResults();
			foundWinner = mApp.isWinner(g);
		}while (!foundWinner);
		mApp.DisplayWinner();
	}
}
