package com.doug.services;

import com.doug.domain.CardInfo;
import com.doug.domain.SingleCardScore;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Doug on 1/22/17.
 */
public interface ScoreService {

    CardInfo GetCardInfoFromCardName(String cardName, ArrayList<CardInfo> masterDeckList);

    SingleCardScore ScoreSingleCard(CardInfo cardInfo, ArrayList<CardInfo> masterDeckList);

    BigDecimal GetCumulativeScore(ArrayList<SingleCardScore> singleCardScoreArrayList);


}
