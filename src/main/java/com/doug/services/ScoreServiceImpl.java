package com.doug.services;

import com.doug.domain.CardInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Doug on 1/22/17.
 */
@Service
public class ScoreServiceImpl implements ScoreService{

    @Override
    public Boolean ScoreCardPersonName(CardInfo cardInfo, ArrayList<CardInfo> masterDeckList) {
        for(int i=0;i< masterDeckList.size();i++){
            if(cardInfo.getPersonName().equals(masterDeckList.get(i).getPersonName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean ScoreCardObjectName(CardInfo cardInfo, ArrayList<CardInfo> masterDeckList) {
        for(int i=0;i< masterDeckList.size();i++){
            if(cardInfo.getobjectName().equals(masterDeckList.get(i).getobjectName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean ScoreCardActionName(CardInfo cardInfo, ArrayList<CardInfo> masterDeckList) {
        for(int i=0;i< masterDeckList.size();i++){
            if(cardInfo.getactionName().equals(masterDeckList.get(i).getactionName())){
                return true;
            }
        }
        return false;
    }
    @Override
    public Boolean ScoreCardName(CardInfo cardInfo, ArrayList<CardInfo> masterDeckList) {
        for(int i=0;i< masterDeckList.size();i++){
            if(cardInfo.getCardName().equals(masterDeckList.get(i).getCardName())){
                return true;
            }
        }
        return false;
    }

    public CardInfo GetCardInfoFromCardName(String cardName, ArrayList<CardInfo> masterCardList) {

        for(int i=0;i< masterCardList.size();i++){
            if(cardName.equals(masterCardList.get(i).getCardName())){
                return masterCardList.get(i);
            }
        }
        return null;
    }

}
