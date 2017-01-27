package com.doug.services;

import com.doug.domain.CardInfo;
import com.doug.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Doug on 1/22/17.
 */
public interface ScoreService {

    Boolean ScoreCardName(CardInfo cardInfo, ArrayList<CardInfo> masterDeckList);
    Boolean ScoreCardPersonName(CardInfo cardInfo, ArrayList<CardInfo> masterDeckList);
    Boolean ScoreCardObjectName(CardInfo cardInfo, ArrayList<CardInfo> masterDeckList);
    Boolean ScoreCardActionName(CardInfo cardInfo, ArrayList<CardInfo> masterDeckList);

    CardInfo GetCardInfoFromCardName(String cardName, ArrayList<CardInfo> masterDeckList);



}
