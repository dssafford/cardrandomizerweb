package com.doug.services;

import com.doug.domain.Card;
import com.doug.domain.CardInfo;

import java.util.ArrayList;

/**
 * Created by Doug on 12/17/16.
 */
public interface CardService {
	ArrayList<Card> listAllCards();

	ArrayList<CardInfo> listAllCardsForLearning();

	ArrayList<CardInfo> createCardLearningMasterList();



	}
