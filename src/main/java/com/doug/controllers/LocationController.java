package com.doug.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Doug on 1/22/17.
 */

@Controller
public class LocationController {
	@RequestMapping(value = "/locationMasterList", method = RequestMethod.GET)
	public String getLocationMasterList() {

		return "learning/locationMasterList";
	}
}
