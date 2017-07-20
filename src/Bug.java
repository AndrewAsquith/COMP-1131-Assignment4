
public class Bug {
	
//	public static final int RIGHT = 1;
//	public static final int LEFT = -1;

	private int currentPosition;
	private boolean isFacingRight;
	
	public Bug() {
		//default bug position of 0
		currentPosition = 0;
	}
	
	public Bug(int startPosition) {
		
		//bug landed somewhere specific
		currentPosition = startPosition;
		
		//if the bug is given a starting position, he's headed that direction
		isFacingRight = currentPosition >= 0 ? true : false;
	}
	
	public boolean isFacingRight() {
		return isFacingRight;
	}
	
	public boolean isFacingLeft() {
		return !isFacingRight;
	}
	
	public int getCurrentPosition() {
		return currentPosition;
	}
	
	public int move() {
		if (isFacingRight) {
			currentPosition++;
		} else {
			currentPosition--;
		}
		return currentPosition;
	}

	public void turnAround() {
		isFacingRight = !isFacingRight;
	}
	
	public String getCurrentDirection() {
		if (isFacingRight) 
			return "Right";
		else 
			return "Left";
	}
	
	public String toString() {
		return "At position " + currentPosition + " facing " + getCurrentDirection();
	}
	
}
