package com.doug.services;

import com.doug.domain.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Doug on 12/17/16.
 */

@Service
public class CardServiceImpl implements CardService{

		@Override
		public Iterable<Card> listAllCards() {

				Card card;

				ArrayList<Card> returnDeck = new ArrayList<Card>();

				// make the cards
				int[] deck = new int[52]; // how many total
				String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
				String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

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


					card = new Card();
					card.setId(i);
					card.setImagePath(rank + "_of_" + suit + ".png");
//				returnDeck.add(i, rank + "of" + suit);

					returnDeck.add(card);

					System.out.println((i + 1) + " :You have the " + rank + " of " + suit + ".png");


				}

				return returnDeck;

			}

		}

