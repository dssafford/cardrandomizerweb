package com.doug.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Doug on 12/17/16.
 */
@Controller
public class IndexController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage() {
		return "index";

	}

}
