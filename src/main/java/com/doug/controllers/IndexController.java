package com.doug.controllers;

import com.doug.commands.LoginCommand;
import com.doug.repositories.LocationRepository;
import com.doug.repositories.LocationTestRepository;
import com.doug.repositories.TestRepository;
import com.doug.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.doug.services.UserService;

/**
 * Created by Doug on 12/17/16.
 */
@Controller
public class IndexController {

	@Autowired
	CardService cardService;

	@Autowired
	private LocationTestRepository locationTestRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Autowired
	private TestRepository testRepository;


	@RequestMapping({"/", ""})
	public String index(){

//		loadLocationTests();



		return "index";
	}



	@RequestMapping("/access_denied")
	public String notAuth(){

		return "/user/access_denied";
	}

	@RequestMapping("/login")
	public String loginForm(Model model){
		model.addAttribute("userform", new LoginCommand());

		return "/user/login";
	}
	@RequestMapping("/logout")
	public String logout(){
//		model.addAttribute("userform", new LoginCommand());

		return "/user/logout-success";
	}

}
