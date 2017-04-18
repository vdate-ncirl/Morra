

import java.util.*;

/**
 * This Class is a Controller and Score keeper Class for Morra Game Applications. It provides methods for activities of Game.
 *  
 */
public class MorraApp {
	private Player h; // Reference for Player (human) 
	private Player v; //  Reference for Virtual Player (computer)
	private ArrayList<Game[]> GameHistory ; //Two Dimensional Array row represents each session, each Column represent Game object for each player
	/**
	 * Constructor to create MorraApp object. The Constructor sets Name's for PLayer. 
	 * <p><i>
	 * Internal: Also creates a score keeping two dimensional array . Each row of array represents session of Game. Column represents Game details for each player. e.g<br>
	 * {@code private ArrayList<Game[]> GameHistory}; // The array is implemented using built-in ArrayList class
	 * </i></p>
	 * @see Game   
	 * @param GamerName - Gamer's Name 
	 * @param VirtualGamerName : Virtual Player Name (Computer)
	 * 
	*/
	public MorraApp(String GamerName,String VirtualGamerName) {
		h = new HumanPlayer(GamerName);
		v = new VirtualPlayer(VirtualGamerName);
		GameHistory = new ArrayList<Game[]>();
	}
	
	/** 
	 * Initialize the Game System. Sets the  playtype (even | odd) for each player. 
	 * The playAsType is set on user input.
	 * The flow is to input any integer. If the integer is odd, The player play type is set to odd.
	 * The other player is automatically set to even. and visa versa.
	 */
	public void init() {
		System.out.println("Do you want to play as Even Or Odd. [Even Num entry -> Even Odd Num entry -> Odd]");
		Scanner sc = new Scanner(System.in);
		

		// to check only valid integer is considered
		
		while (!sc.hasNextInt()) {
				System.out.println("Invalid entry, ONLY integer value is accepted ");
				sc.next();
			}
		
		 int tmp = sc.nextInt();
		 if (tmp <0)
			 tmp *= -1;// to convert negative input to the positive value
		
		int playAsType = tmp;
		int h_playAsType = playAsType % 2;
		int v_playAsType = (++playAsType) % 2;
		h.setPlayAsType(h_playAsType);
		v.setPlayAsType(v_playAsType);
		System.out.println("Player " + " : " + h.getPlayerName() + " : " +  "Choosen Playtype "  + " : " + h.getPlayAsType());
		System.out.println("Player " + " : " + v.getPlayerName() + " : " +  "Choosen Playtype "  + " : " + v.getPlayAsType());
		}
	
	/**
	 * Runs a round of the Game.
	 * @return Game[] Returns Game object for the round.
	 * 
	 * <p><i>
	 * Internal: 
	 * The RunApp creates a Game object of each player of type Game Array e.g Game[].
	 * For each player  Play() method is invoked.  
	 * Results are computed and stored in each player's Game object.
	 * Finally the Game[] is stored in two dimensional Array GameHistory 
	 * Calls Play() method for each player. When the player has played the move. The results are computed and stored in GameHistory ArrayList.
	 * </i></p>
	 * @see Game
	 * @see MorraApp 
	 *
	 */
	public  Game[] RunGameRound() {
		Game [] g =  {new Game(h), new Game(v)}; // Game of Game object for each player.
		for (int i = 0  ; i < g.length ; i++) g[i].Play();
		return g;
	}

	/**
	 * Takes Game[] and computes the score for each player in Game[]
	 * @param g Game[] array of Game objects.
	 * @see Game
	 * @see MorraApp 
	 */
	public void ComputeAndSaveResult (Game[] g){
		for (int i = 0 ; i < g.length ; i++) {
			  Game [] tmpGameArray = g;
			  for ( int j = 0 ; j < tmpGameArray.length ; j++) {
				  if (tmpGameArray[j] != g[i]) {
					  g[i].ComputeScore(tmpGameArray[j].getPlayer());
				  }
			  }
		  }
		GameHistory.add(g);
	}

	/**
	 * 
	 * @param p Player object
	 * For player object return the total score for all rounds.
	 * @return TotalScore
	 */
	public int totalScore(Player p){
		int TotalScore = 0;
		for (int i = 0 ; i <GameHistory.size() ; i++) {
			  Game [] g = GameHistory.get(i);
			  for ( int j = 0 ; j < g.length; j++) {
				  if (g[j].getPlayer() == p) {
					  
					  TotalScore += g[j].getScore();
				  }
			  }
		}
		return TotalScore;
	}
	
	/**
	 * Displays for each session player name , the play for the session and score for the session.
	 * Finally also displays total score for each player.
	 */
	public void DisplayResults() {
		System.out.println("\nPlayer\tPlay\tscore\tPlayer\tPlay\tscore");
		
		for (int i = 0 ; i < GameHistory.size() ; i++) {
			Game [] g = GameHistory.get(i);
			for (int j = 0  ; j < g.length ; j++) {
				System.out.print(g[j].getPlayer().getPlayerName()  +"\t" + g[j].getPlay().getplay() +"\t" + g[j].getScore() +"\t");
			}
			System.out.println();
		}
	System.out.println("Total Score for " + h.getPlayerName() + " " + totalScore(h));
	System.out.println("Total Score for " + v.getPlayerName() + " " + totalScore(v));
	}
}
