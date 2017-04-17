
/**
 * This Class is session class for a player, keeps track of player, the play player played and total score for player
 */
public class Game {
	
	private Player player;
	private Play p;
	private int score;
	
	/**
	 * Construct the Game session object for player.
	 * @param player Construct the Game session object for player.
	 */
	public Game(Player player) {
		this.player = player;
	}
	
	/**
	 * Sends message to Player to Play a move. 
	 * 
	 */
	 
	public void Play () {
		p = player.Play();
	}
	
	/**
	 * Returns the player object of this session.
	 * @return Returns the player object of this session.
	 */
	public Player getPlayer () {
		return player;
	}
	
	/**
	 * 
	 * @return Returns the play choice for this session
	 */
	public Play getPlay() {
		return p;
	}
	/**
	 * Returns  score for the player for the session.
	 * @return Returns  score for the player for the session.
	 */
	public int getScore(){
		return score;
	}
	/**
	 * Computes the score for this session, for the player. requires otherPlayer.
	 * For points calculation refer to Game specifications.
	 * @param otherPlayer The opponent Player, calculations are based on play choice of both players.
	 */
	public void ComputeScore(Player otherPlayer){
	
		int myPlayType = player.getPlayAsType();
		int myPlay = player.getLastPlay().getplay();
		int otherPlay = otherPlayer.getLastPlay().getplay();
		
		int sum = myPlay + otherPlay;
		
		int sumPlayType  = sum % 2;
		if (myPlayType == sumPlayType) 	score += Constants.GAMEPOINTS;
	}
}
