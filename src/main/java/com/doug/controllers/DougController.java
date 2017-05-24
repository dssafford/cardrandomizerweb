package com.doug.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DougController {

	@RequestMapping(value = "/studyList", method = RequestMethod.GET)
	public String doodie() {
		return "learning/studyList";
	}

	@RequestMapping(value = "/masterCardList", method = RequestMethod.GET)
	public String doodie1() {
		return "learning/masterCardList";
	}


	@RequestMapping(value = "/locationMasterCardList", method = RequestMethod.GET)
	public String doodie2() {
		return "learning/locationMasterCardList";
	}


//    @RequestMapping({"/secured", "ext"})
//    public String secured(){
//        return "secured";
//    }


//	@RequestMapping(value = "/singleLocationTestStart", method = RequestMethod.GET)
//	public String startSingleCardScoring(HttpSession session) {
//
//		session.setAttribute("randomLocationList", null);
//		session.setAttribute("scoreSoFar", null);
//		session.setAttribute("cumulativeScore", null);
//
//		return "redirect:/singleLocationTest";
//
//	}
}
