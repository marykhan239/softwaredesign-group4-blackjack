package game;

import cards.Deck;
import java.util.Scanner;

public class Blackjack {

	public static void blackjack() {

		// Initialize all decks
		Deck playerDeck = new Deck();
		Deck dealerDeck1 = new Deck();
                Deck dealerDeck2 = new Deck();
		Deck playingDeck = new Deck();

		// Generate playing deck
		playingDeck.generateDeck();

		boolean gameOver = false;

		Scanner userInput = new Scanner(System.in);

		// User name
		System.out.println("What user name would you like to use?");
		String playerName = userInput.nextLine();

		// Main loop
		do {
			// New game message
			System.out.println("\nA new game has begun.\n");

			// deal cards to the player
			playerDeck.dealCard(playingDeck);
			playerDeck.dealCard(playingDeck);
			System.out.println(playerDeck.toString());
			System.out.println("Your hand is valued at " + playerDeck.handValue());

			// deal cards to dealer
			dealerDeck1.dealCard(playingDeck);
			dealerDeck2.dealCard(playingDeck);
			System.out.println(dealerDeck1.toString());

			// player's turn
			while (true) {
				System.out.println("Would " + playerName + " like to hit or stay? 'Hit/Stay'");
				String playerChoice = userInput.nextLine();

				// hit
				if (playerChoice.equalsIgnoreCase("hit")) {
					System.out.println(playerName + " drew a card.\n");
					playerDeck.dealCard(playingDeck);
					System.out.println("Your hand is valued at " + playerDeck.handValue());

					if (playerDeck.handValue() >= 22) {
						System.out.println(
								"You busted and got a total of " + playerDeck.handValue() + ". Dealer wins this time!");
						gameOver = true;
						break;
					}
				}

				// STAY
				if (playerChoice.equalsIgnoreCase("stay")) {
					System.out.println("You have chosen to stay. Your hand is valued at: " + playerDeck.handValue());
					gameOver = true;
					break;
				}
			}

			// dealer's turn
			if (playerDeck.handValue() <= 20) {
				System.out.println("\n- Dealers turn - \n");
				System.out.println(dealerDeck1.toString());
                                System.out.println(dealerDeck2.toString());
                                
                                
                           
				while (gameOver && dealerDeck1.handValue()+ dealerDeck2.handValue()!= 21 ) {
					if (dealerDeck1.handValue()+dealerDeck2.handValue() < 17) {
						// DRAW CARD
						System.out.println("Dealer drew another card\n");
						dealerDeck1.dealCard(playingDeck);
						System.out.println(dealerDeck1.toString());

						if (dealerDeck1.handValue() + dealerDeck2.handValue() > 21) {
							System.out.println("Dealer busted and got a total of " + dealerDeck1.handValue() + dealerDeck2.handValue()+ ". "
									+ playerName + " wins this time!");
							gameOver = true;
							break;
						}

					} else {
						// STAY
						System.out.println("Dealer has chosen to stay! \n");
						int totalDealerSum = dealerDeck1.handValue()+dealerDeck2.handValue();
						int totalPlayerSum = playerDeck.handValue();

						if (totalDealerSum > totalPlayerSum) {
							System.out.println("Both players have decided to stay. The winner is the dealer"
									+ " with a total of " + totalDealerSum + ".");
							break;
						}
					}

				}
			}

		} while (playerName.equalsIgnoreCase("Yes"));

		// exit
		userInput.close();
	}
}