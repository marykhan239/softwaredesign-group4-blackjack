package rules;

//winning rules

import cards.Deck;

public class Winning {

	int aces_count = 0;
	int non_aces_sum = 0;
	int global_sum = 0;

	Deck player = new Deck();
	Deck dealer = new Deck();
	Deck deck = new Deck();

	boolean play = true;

	public boolean play() {
		while (play = false) {

			if (deck.handValue() != 11) { // assuming ace value is 11
				if (deck.handValue() > 10)
					non_aces_sum += 10;
				else
					non_aces_sum += deck.handValue();
			} else
				aces_count += 1;
		}

		int aces_sum = 0;

		if (aces_count > 0)
			aces_sum = 11;

		for (int i = 0; i < aces_count - 1; i++) { // - 1 cuz already asigned first ace
			aces_sum += 1; // 2x aces == 22 so max 1 ace has value 11
		}
		if (aces_sum + non_aces_sum > 21)
			aces_sum = aces_count; // no need for an 11 value ace, so all are 1

		global_sum = non_aces_sum + aces_sum;

		return play;

	}

}
