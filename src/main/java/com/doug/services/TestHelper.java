package com.doug.services;

import com.doug.domain.Card;
import com.doug.domain.CardInfo;
import com.doug.domain.SimpleCardQuiz;

import java.util.ArrayList;

/**
 * Created by doug on 1/21/17.
 */
public abstract class TestHelper {

    public static ArrayList<CardInfo> createTestRandomList() {
        CardInfo cardInfo;

        ArrayList<CardInfo> learningRandomCards = new ArrayList<CardInfo>();
        cardInfo = new CardInfo("ace_of_hearts", "people we love", "sportsmen",
                "hearts", "Peyton Manning", "throwing", "football");
        learningRandomCards.add(cardInfo);
        cardInfo = new CardInfo("2_of_hearts", "people we love", "sportswomen",
                "hearts", "Ana Kornikova", "bending over", "small white tennis dress");
        learningRandomCards.add(cardInfo);

        cardInfo = new CardInfo("ace_of_diamonds", "rich people", "sportsmen",
                "diamonds", "Michael Jordan", "dunking", "basketball");
        learningRandomCards.add(cardInfo);
        cardInfo = new CardInfo("2_of_diamonds", "rich people", "sportswomen",
                "diamonds", "Maria Sharopova", "swinging ", "tennis racket");
        learningRandomCards.add(cardInfo);
        cardInfo = new CardInfo("3_of_diamonds", "rich people", "male movie stars",
                "diamonds", "George Clooney", "smoking", "cigar");
        learningRandomCards.add(cardInfo);

        return learningRandomCards;
    }

    public static ArrayList<Card> createAnswerList() {
        Card card;

        ArrayList<Card> answerList = new ArrayList<Card>();

        card = new Card(0, "ace_of_hearts", 0);
        answerList.add(card);
        card = new Card(1, "2_of_hearts", 1);
        answerList.add(card);

        card = new Card(2, "ace_of_diamonds", 2);
        answerList.add(card);
        card = new Card(3, "2_of_diamonds", 3);
        answerList.add(card);
        card = new Card(4, "3_of_diamonds", 4);
        answerList.add(card);


        return answerList;
    }

    public static ArrayList<SimpleCardQuiz> createScoreTestList() {
        ArrayList<SimpleCardQuiz> SimpleCardQuizList = new ArrayList<SimpleCardQuiz>();
        SimpleCardQuiz SimpleCardQuiz;

        SimpleCardQuiz = new SimpleCardQuiz("ace_of_hearts", "ace_of_hearts", false);
        SimpleCardQuizList.add(0, SimpleCardQuiz);

        SimpleCardQuiz = new SimpleCardQuiz("ace_of_hearts", "ace_of_hearts", true);
        SimpleCardQuizList.add(0, SimpleCardQuiz);

        SimpleCardQuiz = new SimpleCardQuiz("ace_of_hearts", "ace_of_hearts", false);
        SimpleCardQuizList.add(0, SimpleCardQuiz);

        SimpleCardQuiz = new SimpleCardQuiz("ace_of_hearts", "ace_of_hearts", true);
        SimpleCardQuizList.add(0, SimpleCardQuiz);

        SimpleCardQuiz = new SimpleCardQuiz("ace_of_hearts", "ace_of_hearts", false);
        SimpleCardQuizList.add(0, SimpleCardQuiz);

        return SimpleCardQuizList;
    }
}
