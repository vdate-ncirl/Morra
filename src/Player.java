
	import java.util.*;
	/**
	 * Abstract class to represent Player of Morra Game.
	 */
public abstract class Player {
	private String playerName;
	private int playAsType;
	private ArrayList<Play> playHistory = new ArrayList<Play>();
	private int totalScore;
	
	/**
	 * Construct Player object with playerName
	 * @param playerName Construct Player object with playerName
	 */
	public Player (String playerName) {
	this.playerName = playerName;
	}
	
	/**
	 * 
	 * @return Player Name 
	 */
	public String getPlayerName(){
		return playerName;
	}
	/**
	 * Sets Play as type chosen by this player. 0 implies even, 1 implies odd.
	 * @param playAsType Sets Play as type chosen by this player. 0 implies even, 1 implies odd.
	 */
	public void setPlayAsType (int playAsType) {
		this.playAsType = playAsType;
	}

	/**
	 * * Returns Play as type chosen by this player. 0 implies even, 1 implies odd. 
	 * @return * Returns Play as type chosen by this player. 0 implies even, 1 implies odd. 
	 
	 */
	public int getPlayAsType(){
		return playAsType;
	}
	
	/**
	 * This function checks that previous play is not as this play. This is to make game fair and not pick same number over and over.
	 * @param p This Play
	 * @return boolean true if this play is not same as previous play.
	 */
	public boolean ValidPlay(Play p) {
		if ( p != getLastPlay()) return true;
		return false;
	}
	/**
	 * Store the Play in PlayHistory, To keep History of each session Play.
	 * @param p Store the Play in PlayHistory, To keep History of each session Play.
	 */
	public void AddPlayHistory(Play p) {
		playHistory.add(p);
	}
	
	/**
	 * Returns the last Play by this player. Required to Validate that Player is not playing same play again.
	 * @return Returns the last Play by this player. Required to Validate that Player is not playing same play again.
	 */
	public Play getLastPlay () {
		int last = playHistory.size() -1;
		if (last < 0) return null;
		return playHistory.get(last);
	
	}
	
	/**
	 * Abstract function , To be defined by sub class
	 * @return Play object
	 */
	
	abstract Play Play();
}
