import java.util.Random;

public class Card {

	public final static int HEARTS = 1;
	public final static int SPADES = 2;
	public final static int DIAMONDS = 3;
	public final static int CLUBS = 4;

	public final static int ACE = 1;
	public final static int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	private int suit;
	private int face;

	private Random rng = new Random();

	public Card() {

		// generate a random suit and card;

		suit = getRandomSuit();
		face = getRandomFace();
	}

	private int getRandomSuit() {
		return rng.nextInt(4) + 1;
	}

	private int getRandomFace() {
		return rng.nextInt(13) + 1;
	}

	public Card(int setSuit, int setFace) {

		if ((setSuit < HEARTS) || (setSuit > CLUBS)) {
			suit = getRandomSuit();
		} else {
			suit = setSuit;
		}

		if ((setFace < ACE) || (setFace > KING)) {
			face = getRandomFace();
		} else {
			face = setFace;
		}
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int newSuit) {
		if ((newSuit >= 1) && (newSuit <= 4))
			suit = newSuit;
	}

	public String getSuitName() {

		if (suit == HEARTS) {
			return "Hearts";
		} else if (suit == DIAMONDS) {
			return "Diamonds";
		} else if (suit == SPADES) {
			return "Spades";
		} else {
			return "Clubs";
		}
	}

	public int getFaceValue() {
		return face;
	}

	public void setFace(int newFace) {
		if ((newFace >= ACE) && (newFace <= KING))
			face = newFace;
	}

	public String getFaceString() {
		String formattedName = null;

		// this would have been much better as an array
		// so we could just pull the value at a given index
		// but that's the next chapter ;)

		switch (face) {
		case 1:
			formattedName = "Ace";
			break;
		case 2:
			formattedName = "Two";
			break;
		case 3:
			formattedName = "Three";
			break;
		case 4:
			formattedName = "Four";
			break;
		case 5:
			formattedName = "Five";
			break;
		case 6:
			formattedName = "Six";
			break;
		case 7:
			formattedName = "Seven";
			break;
		case 8:
			formattedName = "Eight";
			break;
		case 9:
			formattedName = "Nine";
			break;
		case 10:
			formattedName = "Ten";
			break;
		case 11:
			formattedName = "Jack";
			break;
		case 12:
			formattedName = "Queen";
			break;
		case 13:
			formattedName = "King";
			break;
		}
		return formattedName;
	}

	public String toString() {
		return getFaceString() + " of " + getSuitName();
	}
}
