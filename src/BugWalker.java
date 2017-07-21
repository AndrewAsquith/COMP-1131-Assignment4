//==============================================
// Andrew Asquith
// COMP 1131
// Assignment 4 
// BugWalker Class 
//
// This is the Bug Walker class.
// It acts as a driver/set of tests for the bug class
// by creating several bugs, moving them around and
// printing out their positions as they go
//
//==============================================

public class BugWalker {

	public static void main(String[] args) {
		
		
		//Some constants and descriptions of what we expect of the bugs
		
		// bug 1 goes 5 steps each direction
		final int BUG1_DISTANCE = 5;
		
		// bug 2 starts at -5
		final int BUG2_START = -5;
		// bug 2 goes 7 steps to get from negative to positive
		final int BUG2_DISTANCE = 7;
		
		// bug 3 starts at +2
		final int BUG3_START = 2;
		// bug 3 goes 2 steps positive to +4
		final int BUG3_DISTANCE1 = 2;
		// bug 3 goes another 6 steps the other direction into the negative
		final int BUG3_DISTANCE2 = 6;
		
		//create 3 new bug instances based on the above
		
		//default bug starting position
		Bug bug1 = new Bug();
		
		//bug starting left of zero and facing left
		Bug bug2 = new Bug(BUG2_START);
		
		//bug starting right of zero and facing right
		Bug bug3 = new Bug(BUG3_START);
		
		
		// make sure they're where they're supposed to be
		System.out.println("Bug 1 Start: \t" + bug1);
		System.out.println("Bug 2 Start: \t" + bug2);
		System.out.println("Bug 3 Start: \t" + bug3);
		
		
		System.out.println(System.lineSeparator() + "===================");
		System.out.println("Bug 1 Exercises");
		System.out.println("===================");
		
		//make sure the bug is facing right - should print true
		System.out.println("Bug 1 facing right: \t" + bug1.isFacingRight());
		
		//walk bug1 5 moves right
		for (int i=0; i<BUG1_DISTANCE; i++) {
			bug1.move();
			System.out.println("Bug 1 after move " + (i+1) + ": \t" + bug1);
		}
		
		//turn bug1 around
		bug1.turnAround();
		System.out.println("Bug 1 after turning around: \t" + bug1);
		
		//walk bug1 back the starting location
		for (int i=0; i<BUG1_DISTANCE; i++) {
			bug1.move();
			System.out.println("Bug 1 after move " + (i+1) + ": \t" + bug1);
		}
		
		System.out.println(System.lineSeparator() + "===================");
		System.out.println("Bug 2 Exercises");
		System.out.println("===================");
		
		//make sure the bug is facing left 
		System.out.println("Bug 2 is facing right: \t" + bug2.isFacingRight());
		System.out.println("Bug 2 is facing left: \t" + bug2.isFacingLeft());
		
		//bug 2 started at -5, we're going to turn around immediately
		bug2.turnAround();
		System.out.println("Bug 2 after turning around: \t" + bug2);
		
		//move the bug into the positive side by going 7 steps
		for (int i = 0; i<BUG2_DISTANCE; i++) {
			bug2.move();
			System.out.println("Bug 2 after move " + (i+1) + ": \t" + bug2);
		}
		
		System.out.println(System.lineSeparator() + "===================");
		System.out.println("Bug 3 Exercises");
		System.out.println("===================");
		
		//Bug should be facing right
		System.out.println("Bug 3 is facing: \t" + bug3.getCurrentDirection());
		
		//bug 2 started at +2, go 2 more to get to +4
		for (int i = 0; i<BUG3_DISTANCE1; i++) {
			bug3.move();
			System.out.println("Bug 3 after move " + (i+1) + ": \t" + bug3);
		}
		
		// turn bug 3 around
		bug3.turnAround();
		
		//should at +4 facing left
		System.out.println("Bug 3 after turning around: \t" + bug3);
		
		//make the second move back across 0 for bug 3 to -2
		for (int i = 0; i<BUG3_DISTANCE2; i++) {
			bug3.move();
			System.out.println("Bug 3 after move " + (i+1) + ": \t" + bug3);
		}
	}
}