package com.doug.services;

import java.util.ArrayList;

/**
 * Created by Doug on 12/12/16.
 */
public class RandomizeDeck {


	public ArrayList<String> Randomize()

	{
		ArrayList<String> returnDeck = new ArrayList<>();

		// make the cards
		int[] deck = new int[52]; // how many total
		String[] suits = {"hearts", "diamonds", "spades", "clubs"};
		String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

		// intitialize cards
		for (int i = 0; i < deck.length; i++) {
			deck[i] += i;
		}

		// shuffle cards
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int x = deck[i]; // x now has all 52 cards?
			deck[i] = deck[index]; // pick a random card
			deck[index] = x; // pick a radom card

		}

		// display four cards
		for (int i = 0; i < 52; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			returnDeck.add(i, rank + "of" + suit);
			//System.out.println((i + 1) + " :You have the " + rank + " of " + suit);
		}

		return returnDeck;
	}
}
