package cards;

import java.util.ArrayList;
import java.util.Collections;

import enums.Suit;
import enums.Value;

/*
 * This class uses the Card class to create a single deck. In other
 * classes, this Deck class can be used to create as many decks as
 * needed. It has methods such as
 */

public class Deck {
	//This is the ArrayList that will hold all 52 cards.
	private ArrayList<Card> deck;
	
	//Constructor for creating decks.
	public Deck() {
		this.deck = new ArrayList<>();
	}

//    public Deck(String playerName) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

	/*
	 * This method will create the deck. It will populate an ArrayList
	 * with 4 cards (each suit) of each value (1-13, or ace-king) and
	 * then shuffle the deck.
	 */

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }
        
        
        
	public void generateDeck() {
		for (Value cardValue : Value.values()) {
			for (Suit cardSuit : Suit.values()) {
				this.deck.add(new Card(cardValue, cardSuit));
			}
		}

		//This will shuffle the deck after creating it.
		Collections.shuffle(this.deck);
	}

	/*
	 * cardsValue() is a method that assigns a value to each card,
	 * and then totals the value of the player hand. For example,
	 * Jack, Queen, and King will be 10 as stated in the black jack
	 * rules.
	 */
	public int handValue() {
		int handValue = 0;

		for (Card c : this.deck) {
			switch(c.getValue()) {
			case TWO:
				handValue += 2;
				break;
			case THREE:
				handValue += 3;
				break;
			case FOUR:
				handValue += 4;
				break;
			case FIVE:
				handValue += 5;
				break;
			case SIX:
				handValue += 6;
				break;
			case SEVEN:
				handValue += 7;
				break;
			case EIGHT:
				handValue += 8;
				break;
			case NINE:
				handValue += 9;
				break;
			case TEN:
				handValue += 10;
				break;
			case JACK:
				handValue += 10;
				break;
			case QUEEN:
				handValue += 10;
				break;
			case KING:
				handValue += 10;
				break;
			case ACE:
				/*
				 * This is used if there is an Ace. If the handValue
				 * is less than or equals to 10, the Ace becomes an
				 * 11. Else, it is a 1.
				 */
				if(handValue <= 10) {
					handValue += 11;
				} else {
					handValue += 1;
				}
				break;
			}
		}

		return handValue;
	}

	/*
	 * This method is used for dealing a card.
	 */
	public void dealCard(Deck handDeck) {
		//Add card from deck
		this.deck.add(handDeck.deck.get(0));
		//Remove card from deck
		handDeck.deck.remove(0);
	}

	/*
	 * This method will clear the selected deck.
	 */
	public void clearDeck(Deck tempDeck) {
		tempDeck.deck.clear();
	}
	
	@Override
    public String toString() {
        String cardString = "";
        
        for(Card c : this.deck) {
        	cardString += "\n" + c.toString();
        }
        
        return cardString;
    }
}
