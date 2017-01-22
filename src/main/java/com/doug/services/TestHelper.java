package com.doug.services;

import com.doug.domain.Card;
import com.doug.domain.Test;

import java.util.ArrayList;

/**
 * Created by doug on 1/21/17.
 */
public abstract class TestHelper {

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

    public static ArrayList<Test> createScoreTestList() {
        ArrayList<Test> testList = new ArrayList<Test>();
        Test test;

        test = new Test("ace_of_hearts", "ace_of_hearts", false);
        testList.add(0, test);

        test = new Test("ace_of_hearts", "ace_of_hearts", true);
        testList.add(0, test);

        test = new Test("ace_of_hearts", "ace_of_hearts", false);
        testList.add(0, test);

        test = new Test("ace_of_hearts", "ace_of_hearts", true);
        testList.add(0, test);

        test = new Test("ace_of_hearts", "ace_of_hearts", false);
        testList.add(0, test);

        return testList;
    }
}
