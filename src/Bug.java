//==============================================
// Andrew Asquith
// COMP 1131
// Assignment 4 
// Bug Class 
//
// This is the Bug class.
// It represents a bug that is able to move along a line
// one position at a time. The position on the line is 
// represented as an integer +/- the "0" middle point
//
//==============================================

public class Bug {

	// the bug's current position
	private int currentPosition;
	
	// boolean indicating if the bug is facing right
	private boolean isFacingRight;
	
	// constructor placing the bug at position 0 facing right
	public Bug() {

		//default bug position of 0
		currentPosition = 0;

		//default bug is facing right
		isFacingRight = true;
	}
	
	// constructor accepting a starting position for the bug
	// the bug is assumed to be facing the direction it "landed"
	// if the caller wants the bug to start negative but go right
	// they are expected to call turnAround() before moving.
	public Bug(int startPosition) {
		
		//bug landed somewhere specific
		currentPosition = startPosition;
		
		//if the bug is given a starting position, he's headed that direction
		isFacingRight = currentPosition >= 0 ? true : false;
	}
	
	// method to determine if the bug is facing right
	public boolean isFacingRight() {
		return isFacingRight;
	}
	
	// method to determine if the bug is facing left
	public boolean isFacingLeft() {
		return !isFacingRight;
	}
	
	// public getter for the bug's current position
	public int getCurrentPosition() {
		return currentPosition;
	}
	
	// public method to advance the bug one position in the direction it is facing
	public int move() {

		// if it's facing right, increment
		if (isFacingRight) {
			currentPosition++;
		} else {
			//otherwise it's facing left, decrement
			currentPosition--;
		}
		//return the new current position to the caller
		return currentPosition;
	}

	// public method to change the bug's direction
	public void turnAround() {
		isFacingRight = !isFacingRight;
	}
	
	// public method to return a nice string representation of 
	// what direction the bug is facing currently
	public String getCurrentDirection() {
		if (isFacingRight) 
			return "Right";
		else 
			return "Left";
	}
	
	// toString implementation returning a description of the current position and
	// what direction the bug is facing
	public String toString() {
		return "At position " + currentPosition + " facing " + getCurrentDirection();
	}
}
