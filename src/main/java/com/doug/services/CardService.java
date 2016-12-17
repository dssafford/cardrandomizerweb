package com.doug.services;

import com.doug.domain.Card;

/**
 * Created by Doug on 12/17/16.
 */
public interface CardService {
	Iterable<Card> listAllCards();

	}
