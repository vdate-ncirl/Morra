
/**
 * Wrapper class for Play choice. ArrayList seems to work only on objects and not Primitive types.
 */
public class Play {
	private int play;
	
	/**
	 * Default constructor, Initialize Play Object.
	 */
	public Play() {
		play = 0;
	}
	
	/**
	 * Constructor to create Play object with param play
	 * @param play parameter to construct Play object
	 */
	public Play(int play){
		this.play = play;
	}
	
	/**
	 * Convert Play object to integer and return primitive int
	 * @return Convert Play object to integer and return primitive int
	 */
	public int getplay(){
		return play;
	}
}
