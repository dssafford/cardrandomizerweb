package com.doug.controllers;

import com.doug.domain.AnswerListSmall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Doug on 1/22/17.
 */

@Controller
public class LocationController {

	@Autowired
	AnswerListSmall answerListSmall;


	@RequestMapping(value = "/locationMasterList", method = RequestMethod.GET)
	public String getLocationMasterList() {

		return "learning/locationMasterList";
	}

	@RequestMapping("/shit2")
	public String getAnswerSmall2() {
		String dude = answerListSmall.getCard1();

		String dude2 = "test";

		return dude;
	}
}
