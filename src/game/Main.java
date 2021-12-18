package game;

import java.util.Scanner;

/*
 * This class will run the blackjack class.
 */
public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input;

		// new game
		System.out.println("Would you like to start a new game?  'Yes/No' :");
		do {
			input = scanner.nextLine();

			Blackjack.blackjack();

		} while (!input.equalsIgnoreCase("Yes") && !input.equalsIgnoreCase("No"));

	}
}
