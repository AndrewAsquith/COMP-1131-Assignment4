//==============================================
// Andrew Asquith
// COMP 1131
// Assignment 4 
// CardTester Class 
//
// This is the Card Tester class for lack of a better name.
// It deals 5 random cards to start as per the requirements
// It then acts as a set of tests for the Card class and it's methods
// The individual test scenarios are detailed inline
//
//==============================================

public class CardTester {

	public static void main(String[] args) {

		//deal 5 random cards
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		Card card4 = new Card();
		Card card5 = new Card();
		
		System.out.println("5 random cards: ");
		System.out.println("Card 1: \t" + card1);
		System.out.println("Card 2: \t" + card2);
		System.out.println("Card 3: \t" + card3);
		System.out.println("Card 4: \t" + card4);
		System.out.println("Card 5: \t" + card5);
		
		System.out.println(System.lineSeparator() + "===================");
		
		//deal a royal flush
		Card card6 = new Card(10, Card.HEARTS);
		Card card7 = new Card(Card.JACK, Card.HEARTS);
		Card card8 = new Card(Card.QUEEN, Card.HEARTS);
		Card card9 = new Card(Card.KING, Card.HEARTS);
		Card card10 = new Card(Card.ACE, Card.HEARTS);
		
		System.out.println("Royal Flush - Hearts");
		System.out.println("Card 6: \t" + card6);
		System.out.println("Card 7: \t" + card7);
		System.out.println("Card 8: \t" + card8);
		System.out.println("Card 9: \t" + card9);
		System.out.println("Card 10: \t" + card10);
		
		System.out.println(System.lineSeparator() + "===================");
		
		//deal a 6 of each suit
		Card card11 = new Card(6, Card.CLUBS);
		Card card12 = new Card(6, Card.DIAMONDS);
		Card card13 = new Card(6, Card.HEARTS);
		Card card14 = new Card(6, Card.SPADES);
		
		System.out.println("Face of 6 of each suit");
		System.out.println("Card 11: \t" + card11);
		System.out.println("Card 12: \t" + card12);
		System.out.println("Card 13: \t" + card13);
		System.out.println("Card 14: \t" + card14);
		
		System.out.println(System.lineSeparator() + "===================");
		
		//deal two cards with a valid face but invalid suit (should choose random suit)
		System.out.println("Constructors with invalid suit:");
		Card card15 = new Card(Card.ACE, 7);
		Card card16 = new Card(Card.ACE, -5);
		System.out.println("Card 15 (Ace of 7): \t" + card15);
		System.out.println("Card 16 (Ace of -5): \t" + card16);
		
		System.out.println(System.lineSeparator() + "===================");
		
		//deal two cards with a valid suit but invalid face (should choose random face)
		System.out.println("Constructors with invalid face:");
		Card card17 = new Card(21, Card.CLUBS);
		Card card18 = new Card(-12, Card.SPADES);
		System.out.println("Card 17 (21 of Clubs): \t" + card17);
		System.out.println("Card 18 (-12 of Spades): \t" + card18);

		System.out.println(System.lineSeparator() + "===================");
		
		//deal an ace of hearts and change it to a king of hearts
		System.out.println("Valid face setter test:");
		Card card19 = new Card(Card.ACE, Card.HEARTS);
		System.out.println("Card 19 Before (Ace of Hearts): \t" + card19);
		card19.setFace(Card.KING);
		System.out.println("Card 19 After (King of Hearts): \t" + card19);

		System.out.println(System.lineSeparator() + "===================");
		
		//deal an ace of hearts and change it to an ace of spades
		System.out.println("Valid suit setter test:");
		Card card20 = new Card(Card.ACE, Card.HEARTS);
		System.out.println("Card 20 Before (Ace of Hearts): \t" + card20);
		card20.setSuit(Card.SPADES);
		System.out.println("Card 20 After (Ace of Spades): \t" + card20);

		System.out.println(System.lineSeparator() + "===================");
		
		//deal an ace of hearts and change it to an invalid suit (should stay ace of hearts)
		System.out.println("Invalid suit setter test:");
		Card card21 = new Card(Card.ACE, Card.HEARTS);
		System.out.println("Card 21 Before (Ace of Hearts): \t" + card21);
		card21.setSuit(9);
		System.out.println("Card 21 After (Ace of 9): \t" + card21);
		
		System.out.println(System.lineSeparator() + "===================");
		
		//deal an ace of hearts and change it to an invalid face (should stay ace of hearts)
		System.out.println("Invalid face setter test:");
		Card card22 = new Card(Card.ACE, Card.HEARTS);
		System.out.println("Card 22 Before (Ace of Hearts): \t" + card22);
		card22.setFace(-5);
		System.out.println("Card 22 After (-5 of Hearts): \t" + card22);
		
		System.out.println(System.lineSeparator() + "===================");
		
		//prove the getters work
		System.out.println("Getter tests:");
		Card card23 = new Card(7, Card.DIAMONDS);
		System.out.println("Card 23 (7 of Diamonds): \t" + card23);
		System.out.println("Card 23 Face Value: \t" + card23.getFace() + " (" + card23.getFaceString() + ")" );
		System.out.println("Card 23 Suit Value: \t" + card23.getSuit() + " (" + card23.getSuitName() + ")" );
	}
}
