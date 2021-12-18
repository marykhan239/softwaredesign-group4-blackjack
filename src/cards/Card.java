package cards;

import enums.Value;
import enums.Suit;

/* this class creates a single card. It has the method getValue to return
 * the value of the card, and a toString that concatenates the card
 * together.
*/

public class Card {


	private final Value cardValue;
	private final Suit cardSuit;

	public Card(Value cardValue, Suit cardSuit) {
		this.cardValue = cardValue;
		this.cardSuit = cardSuit;
	}

    public Card() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public Value getValue() {
		return this.cardValue;
	}

    public String toString() {
        return this.cardValue.toString() + " of " + this.cardSuit.toString();
    }
}
