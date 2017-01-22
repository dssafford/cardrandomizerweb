package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.domain.DeckAnswer;
import com.doug.services.Helpers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

import static com.doug.services.Helpers.makeCard;

/**
 * Created by doug on 1/22/17.
 */
@Controller
public class AnswerController {
    @RequestMapping(value = "/enterAnswersTest", method = RequestMethod.POST)
    public String getAnswers(HttpSession session, DeckAnswer deckAnswer) throws Exception {
        ArrayList<Card> enteredAnswers = new ArrayList<Card>();


        String fullAnswerName = "";

        enteredAnswers.add(makeCard("ace_of_hearts"));
        enteredAnswers.add(makeCard("2h"));
        enteredAnswers.add(makeCard("3h"));
        enteredAnswers.add(makeCard("4h"));
        enteredAnswers.add(makeCard("5h"));
        enteredAnswers.add(makeCard("6h"));
        enteredAnswers.add(makeCard("7h"));
        enteredAnswers.add(makeCard("8h"));
        enteredAnswers.add(makeCard("9h"));
        enteredAnswers.add(makeCard("10h"));
        enteredAnswers.add(makeCard("jh"));
        enteredAnswers.add(makeCard("qh"));
        enteredAnswers.add(makeCard("kh"));
        enteredAnswers.add(makeCard("ad"));
        enteredAnswers.add(makeCard("2d"));
        enteredAnswers.add(makeCard("3d"));
        enteredAnswers.add(makeCard("4d"));
        enteredAnswers.add(makeCard("5d"));
        enteredAnswers.add(makeCard("6d"));
        enteredAnswers.add(makeCard("7d"));
        enteredAnswers.add(makeCard("8d"));
        enteredAnswers.add(makeCard("9d"));
        enteredAnswers.add(makeCard("1d"));
        enteredAnswers.add(makeCard("jd"));
        enteredAnswers.add(makeCard("qd"));
        enteredAnswers.add(makeCard("kd"));

        enteredAnswers.add(makeCard("as"));
        enteredAnswers.add(makeCard("2s"));
        enteredAnswers.add(makeCard("3s"));
        enteredAnswers.add(makeCard("4s"));
        enteredAnswers.add(makeCard("5s"));
        enteredAnswers.add(makeCard("6s"));
        enteredAnswers.add(makeCard("7s"));
        enteredAnswers.add(makeCard("8s"));
        enteredAnswers.add(makeCard("9s"));
        enteredAnswers.add(makeCard("1s"));
        enteredAnswers.add(makeCard("static/js"));
        enteredAnswers.add(makeCard("qs"));
        enteredAnswers.add(makeCard("ks"));
        enteredAnswers.add(makeCard("ac"));
        enteredAnswers.add(makeCard("2c"));
        enteredAnswers.add(makeCard("3c"));
        enteredAnswers.add(makeCard("4c"));
        enteredAnswers.add(makeCard("5c"));
        enteredAnswers.add(makeCard("6c"));
        enteredAnswers.add(makeCard("7c"));
        enteredAnswers.add(makeCard("8c"));
        enteredAnswers.add(makeCard("9c"));
        enteredAnswers.add(makeCard("1c"));
        enteredAnswers.add(makeCard("jc"));
        enteredAnswers.add(makeCard("qc"));
        enteredAnswers.add(makeCard("kc"));

        if (enteredAnswers.get(0) != null) {
            for (int i = 0; i < enteredAnswers.size(); i++) {
                fullAnswerName = Helpers.ResolveAnswers(enteredAnswers.get(i).getCardName());
                enteredAnswers.get(i).setCardName(fullAnswerName + ".png");
            }
        } else {
            enteredAnswers = createTestAnswers();
        }

        //Add to Session
        session.setAttribute("enteredAnswers", enteredAnswers);

        return "redirect:/scoreAnswersTest";
    }

    public ArrayList<Card> createTestAnswers() {
        ArrayList<Card> testAnswers = new ArrayList<Card>();

        for (int i = 0; i < 52; i++) {
            testAnswers.add(new Card(i, "2_of_clubs.png", i));
        }

        return testAnswers;
    }

}
