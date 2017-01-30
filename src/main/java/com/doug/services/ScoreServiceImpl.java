package com.doug.services;

import com.doug.domain.CardInfo;
import com.doug.domain.SingleCardScore;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Doug on 1/22/17.
 */
@Service
public class ScoreServiceImpl implements ScoreService{


    public BigDecimal GetCumulativeScore(ArrayList<SingleCardScore> singleCardScoreArrayList) {
        Integer denominator = singleCardScoreArrayList.size();
        Double numberCorrect = 0.00;

        for(int i=0;i<denominator;i++){
            if(singleCardScoreArrayList.get(i).getPersonNameCorrect()==true) {
                numberCorrect=numberCorrect+1;
            }
            if(singleCardScoreArrayList.get(i).getObjectNameCorrect()==true) {
                numberCorrect=numberCorrect+1;
            }
            if(singleCardScoreArrayList.get(i).getActionNameCorrect()==true) {
                numberCorrect=numberCorrect+1;
            }
        }
//        BigDecimal b = new BigDecimal("10.12556");
//
//        a = a.setScale(2, BigDecimal.ROUND_HALF_EVEN);

        BigDecimal b = new BigDecimal((numberCorrect/(denominator*3)*100));
        b = b.setScale(2, BigDecimal.ROUND_HALF_EVEN);


        return b;

    }



    public CardInfo GetCardInfoFromCardName(String cardName, ArrayList<CardInfo> masterCardList) {

        for(int i=0;i< masterCardList.size();i++){
            if(cardName.equals(masterCardList.get(i).getCardName())){
                return masterCardList.get(i);
            }
        }
        return null;
    }



    public SingleCardScore ScoreSingleCard(CardInfo cardInfo, ArrayList<CardInfo> masterDeckList) {

        // Get the master card
        CardInfo masterCardInfo = GetCardInfoFromCardName(cardInfo.getCardName(), masterDeckList);

        SingleCardScore singleCardScore = new SingleCardScore();
        singleCardScore.setCardName(cardInfo.getCardName());
        singleCardScore.setPersonName(cardInfo.getPersonName());
        singleCardScore.setObjectName(cardInfo.getObjectName());
        singleCardScore.setActionName(cardInfo.getActionName());

        if(masterCardInfo!=null) {

            if (cardInfo.getPersonName().equals(masterCardInfo.getPersonName())) {
                singleCardScore.setPersonNameCorrect(true);
            } else {
                singleCardScore.setPersonNameCorrect(false);
            }

            if (cardInfo.getActionName().equals(masterCardInfo.getActionName())) {
                singleCardScore.setActionNameCorrect(true);
            } else {
                singleCardScore.setActionNameCorrect(false);
            }

            if (cardInfo.getObjectName().equals(masterCardInfo.getObjectName())) {
                singleCardScore.setObjectNameCorrect(true);
            } else {
                singleCardScore.setObjectNameCorrect(false);
            }
        } else {
            singleCardScore.setPersonNameCorrect(false);
            singleCardScore.setObjectNameCorrect(false);
            singleCardScore.setActionNameCorrect(false);
        }

        return singleCardScore;
    }
}
