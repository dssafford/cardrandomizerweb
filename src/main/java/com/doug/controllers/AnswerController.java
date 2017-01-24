package com.doug.controllers;

import com.doug.domain.AnswerListSmall;
import com.doug.domain.Card;
import com.doug.domain.DeckAnswer;
import com.doug.services.Helpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @Autowired
    private AnswerListSmall answerListSmall;

    private AnswerListSmall createAnswerListSmall() {
        answerListSmall.setCard1("ace_of_spades");
        answerListSmall.setCard2("1_of_spades");
        answerListSmall.setCard3("2_of_spades");
        answerListSmall.setCard4("3_of_spades");
        answerListSmall.setCard5("4_of_spades");
        answerListSmall.setCard6("5_of_spades");
        answerListSmall.setCard7("6_of_spades");
        answerListSmall.setCard8("7_of_spades");
        answerListSmall.setCard9("8_of_spades");
        answerListSmall.setCard10("9_of_spades");


        return answerListSmall;

    }


    @RequestMapping("/shit")
    public String howaboutThis(HttpSession session) {
        session.setAttribute("answer", createAnswerListSmall());

        return "index";
    }

    @RequestMapping(value = "/answer", method = RequestMethod.GET)
    public String testenterAnswers(Model model) {
        model.addAttribute("deckAnswer", new DeckAnswer());


        return "learning/testEnterAnswers";

    }

    @RequestMapping(value = "/enterAnswers", method = RequestMethod.GET)
    public String enterAnswers(Model model) {
        model.addAttribute("deckAnswer", new DeckAnswer());


        return "enterAnswers";

    }

    public ArrayList<Card> createTestAnswers() {
        ArrayList<Card> testAnswers = new ArrayList<Card>();

        for (int i = 0; i < 52; i++) {
            testAnswers.add(new Card(i, "2_of_clubs.png", i));
        }

        return testAnswers;
    }

    @RequestMapping(value = "/enterAnswers", method = RequestMethod.POST)
    public String getAnswersTestOnly(HttpSession session, DeckAnswer deckAnswer) throws Exception {

        ArrayList<Card> enteredAnswers = new ArrayList<Card>();

        String fullAnswerName = "";

        enteredAnswers.add(makeCard(""));
        enteredAnswers.add(makeCard(deckAnswer.getA2()));
        enteredAnswers.add(makeCard(deckAnswer.getA3()));
        enteredAnswers.add(makeCard(deckAnswer.getA4()));
        enteredAnswers.add(makeCard(deckAnswer.getA5()));
        enteredAnswers.add(makeCard(deckAnswer.getA6()));
        enteredAnswers.add(makeCard(deckAnswer.getA7()));
        enteredAnswers.add(makeCard(deckAnswer.getA8()));
        enteredAnswers.add(makeCard(deckAnswer.getA9()));
        enteredAnswers.add(makeCard(deckAnswer.getA10()));
        enteredAnswers.add(makeCard(deckAnswer.getA11()));
        enteredAnswers.add(makeCard(deckAnswer.getA12()));
        enteredAnswers.add(makeCard(deckAnswer.getA13()));
        enteredAnswers.add(makeCard(deckAnswer.getA14()));
        enteredAnswers.add(makeCard(deckAnswer.getA15()));
        enteredAnswers.add(makeCard(deckAnswer.getA16()));
        enteredAnswers.add(makeCard(deckAnswer.getA17()));
        enteredAnswers.add(makeCard(deckAnswer.getA18()));
        enteredAnswers.add(makeCard(deckAnswer.getA19()));
        enteredAnswers.add(makeCard(deckAnswer.getA20()));
        enteredAnswers.add(makeCard(deckAnswer.getA21()));
        enteredAnswers.add(makeCard(deckAnswer.getA22()));
        enteredAnswers.add(makeCard(deckAnswer.getA23()));
        enteredAnswers.add(makeCard(deckAnswer.getA24()));
        enteredAnswers.add(makeCard(deckAnswer.getA25()));
        enteredAnswers.add(makeCard(deckAnswer.getA26()));
        enteredAnswers.add(makeCard(deckAnswer.getA27()));
        enteredAnswers.add(makeCard(deckAnswer.getA28()));
        enteredAnswers.add(makeCard(deckAnswer.getA29()));
        enteredAnswers.add(makeCard(deckAnswer.getA30()));
        enteredAnswers.add(makeCard(deckAnswer.getA31()));
        enteredAnswers.add(makeCard(deckAnswer.getA32()));
        enteredAnswers.add(makeCard(deckAnswer.getA33()));
        enteredAnswers.add(makeCard(deckAnswer.getA34()));
        enteredAnswers.add(makeCard(deckAnswer.getA35()));
        enteredAnswers.add(makeCard(deckAnswer.getA36()));
        enteredAnswers.add(makeCard(deckAnswer.getA37()));
        enteredAnswers.add(makeCard(deckAnswer.getA38()));
        enteredAnswers.add(makeCard(deckAnswer.getA39()));
        enteredAnswers.add(makeCard(deckAnswer.getA40()));
        enteredAnswers.add(makeCard(deckAnswer.getA41()));
        enteredAnswers.add(makeCard(deckAnswer.getA42()));
        enteredAnswers.add(makeCard(deckAnswer.getA43()));
        enteredAnswers.add(makeCard(deckAnswer.getA44()));
        enteredAnswers.add(makeCard(deckAnswer.getA45()));
        enteredAnswers.add(makeCard(deckAnswer.getA46()));
        enteredAnswers.add(makeCard(deckAnswer.getA47()));
        enteredAnswers.add(makeCard(deckAnswer.getA48()));
        enteredAnswers.add(makeCard(deckAnswer.getA49()));
        enteredAnswers.add(makeCard(deckAnswer.getA50()));
        enteredAnswers.add(makeCard(deckAnswer.getA51()));
        enteredAnswers.add(makeCard(deckAnswer.getA52()));

        if (enteredAnswers.get(0) != null) {
            for (int i = 0; i < enteredAnswers.size(); i++) {
                fullAnswerName = Helpers.ResolveAnswers(enteredAnswers.get(i).getCardName());
                enteredAnswers.get(i).setCardName(fullAnswerName + ".png");
            }
        } else {
            enteredAnswers = createTestAnswers();
        }

        session.setAttribute("enteredAnswers", enteredAnswers);

        return "redirect:/scoreAnswers";
    }



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

}
