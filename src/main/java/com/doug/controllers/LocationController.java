package com.doug.controllers;

import com.doug.commands.JournalCommand;
import com.doug.domain.AnswerListSmall;
import com.doug.domain.Location;
import com.doug.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Doug on 1/22/17.
 */

@Controller
public class LocationController {

	@Autowired
	AnswerListSmall answerListSmall;

	@Autowired
	LocationService locationService;


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

	@RequestMapping(value = "/locationList", method = RequestMethod.GET)
	public String list(Model model) {

		List<Location> myLocations = (List<Location>)locationService.listAllLocations();

		model.addAttribute("locations", myLocations );
		return "learning/locationList";
	}

	@RequestMapping("journal/{id}")
	public String showJournal(@PathVariable Integer id, Model model){
		model.addAttribute("journal", locationService.getLocationById(id));
		return "journal/journalshow";
	}

	@RequestMapping("journal/edit/{id}")
	public String edit(@PathVariable Integer id, Model model){
		model.addAttribute("journal", locationService.getLocationById(id));
		model.addAttribute("journalCommand", new JournalCommand());

		return "/journal/journaledit";
	}

	@RequestMapping("journal/delete/{id}")
	public String delete(@PathVariable Integer id){

		locationService.deleteLocation(id);

		return "redirect:/journal/paging";
	}
}
