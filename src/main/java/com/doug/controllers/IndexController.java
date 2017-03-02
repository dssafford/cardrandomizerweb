package com.doug.controllers;

import com.doug.commands.LoginCommand;
import com.doug.domain.Location;
import com.doug.domain.LocationTest;
import com.doug.domain.Test;
import com.doug.repositories.LocationRepository;
import com.doug.repositories.LocationTestRepository;
import com.doug.repositories.TestRepository;
import com.doug.services.CardService;
//import com.doug.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;

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

//	private UserService userService;


	@RequestMapping({"/", ""})
	public String index(){

//		loadLocationTests();



		return "index";
	}
	private void loadLocationTests(){

		loadTest1();
		loadTest2();

		List<LocationTest> mylist = locationTestRepository.findByTest(1);
		List<LocationTest> mylist1 = locationTestRepository.findByTest(2);
		String dude = "hey";


	}

	private void loadTest1() {
		Test test = new Test("Location", new BigDecimal(89.0), "comments here");

		Location place = new Location(1, "mailbox");
		Location place1 = new Location(2, "driveway");
		Location place2 = new Location(3 , "garage");
		Location place3 = new Location(4, "sidewalk");
		Location place4 = new Location(5, "well");

		LocationTest placeTest = new LocationTest(1,1, "mailbox", "driveway", false, 1);
		LocationTest placeTest1 = new LocationTest(2,5, "well", "well", true, 1);
		LocationTest placeTest2 = new LocationTest(3,2, "driveway", "driveway", true, 1);
		locationRepository.save(place);
		locationRepository.save(place1);
		locationRepository.save(place2);
		locationRepository.save(place3);
		locationRepository.save(place4);

		locationTestRepository.save(placeTest);
		locationTestRepository.save(placeTest1);
		locationTestRepository.save(placeTest2);


		testRepository.save(test);
	}

	private void loadTest2() {
		Test test = new Test("Location", new BigDecimal(89.0), "comments here");

		Location place = new Location(1, "mailbox");
		Location place1 = new Location(2, "driveway");
		Location place2 = new Location(3, "garage");
		Location place3 = new Location(4, "sidewalk");
		Location place4 = new Location(5, "well");

		LocationTest placeTest = new LocationTest(1, 1, "mailbox", "driveway", false, 2);
		LocationTest placeTest1 = new LocationTest(2, 5, "well", "well", true, 2);
		LocationTest placeTest2 = new LocationTest(3, 2, "driveway", "driveway", true, 2);
		LocationTest placeTest3 = new LocationTest(4, 10, "door", "camera", false, 2);
		LocationTest placeTest4 = new LocationTest(5, 6, "porch", "porch", true, 2);
		LocationTest placeTest5 = new LocationTest(6, 9, "storm door", "porch", false, 2);
		LocationTest placeTest6 = new LocationTest(7, 8, "camera", "camera", true, 2);

		locationRepository.save(place);
		locationRepository.save(place1);
		locationRepository.save(place2);
		locationRepository.save(place3);
		locationRepository.save(place4);

		locationTestRepository.save(placeTest);
		locationTestRepository.save(placeTest1);
		locationTestRepository.save(placeTest2);
		locationTestRepository.save(placeTest3);
		locationTestRepository.save(placeTest4);
		locationTestRepository.save(placeTest5);
		locationTestRepository.save(placeTest6);

		testRepository.save(test);
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

//    @RequestMapping("/dologinMenu")
//    public String loginFormMenu(Model model){
//        model.addAttribute("userform", new LoginCommand());
//
//        return "/user/login";
//    }

//	@RequestMapping(value = "/registration", method = RequestMethod.GET)
//	public String registration(Model model) {
//		model.addAttribute("userForm", new User());
//
//		return "/user/registration";
//	}

//    @RequestMapping(value = "/doug", method = RequestMethod.GET)
//    public String doug(Model model) {
//        model.addAttribute("userForm", new User());
//
//        return "/user/doug";
//    }


//	@RequestMapping(value = "/registration", method = RequestMethod.POST)
//	public String registration(@ModelAttribute("userForm") UserCommand userCommand,
//										BindingResult bindingResult, Model model, User user) {
//
//		if (bindingResult.hasErrors()) {
//			return "/user/registration";
//		}
//
//		userService.saveOrUpdate(user);
//
//		//securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());
//
//		return "redirect:/index";
//	}
//
//	@RequestMapping(value="/logout", method = RequestMethod.GET)
//	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		if (auth != null){
//			new SecurityContextLogoutHandler().logout(request, response, auth);
//		}
//		return "/user/logout-success";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
//	}
}
