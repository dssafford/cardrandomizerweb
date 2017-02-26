package com.doug.controllers;

import com.doug.commands.LoginCommand;
import com.doug.commands.UserCommand;
import com.doug.domain.Place;
import com.doug.domain.PlaceTest;
import com.doug.domain.Test;
import com.doug.domain.User;
import com.doug.repositories.PlaceRepository;
import com.doug.repositories.PlaceTestRepository;
import com.doug.repositories.TestRepository;
import com.doug.services.CardService;
import com.doug.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	private PlaceTestRepository placeTestRepository;

	@Autowired
	private PlaceRepository placeRepository;

	@Autowired
	private TestRepository testRepository;

	private UserService userService;


	@RequestMapping({"/", ""})
	public String index(){

		loadPlaceTests();



		return "index";
	}
	private void loadPlaceTests(){

		loadTest1();
		loadTest2();

		List<PlaceTest> mylist = placeTestRepository.findByTest(1);
		List<PlaceTest> mylist1 = placeTestRepository.findByTest(2);
		String dude = "hey";


	}

	private void loadTest1() {
		Test test = new Test("Location", new BigDecimal(89.0), "comments here");

		Place place = new Place(1, "mailbox");
		Place place1 = new Place(2, "driveway");
		Place place2 = new Place(3 , "garage");
		Place place3 = new Place(4, "sidewalk");
		Place place4 = new Place(5, "well");

		PlaceTest placeTest = new PlaceTest(1,1, "mailbox", "driveway", false, 1);
		PlaceTest placeTest1 = new PlaceTest(2,5, "well", "well", true, 1);
		PlaceTest placeTest2 = new PlaceTest(3,2, "driveway", "driveway", true, 1);
		placeRepository.save(place);
		placeRepository.save(place1);
		placeRepository.save(place2);
		placeRepository.save(place3);
		placeRepository.save(place4);

		placeTestRepository.save(placeTest);
		placeTestRepository.save(placeTest1);
		placeTestRepository.save(placeTest2);


		testRepository.save(test);
	}

	private void loadTest2() {
		Test test = new Test("Location", new BigDecimal(89.0), "comments here");

		Place place = new Place(1, "mailbox");
		Place place1 = new Place(2, "driveway");
		Place place2 = new Place(3, "garage");
		Place place3 = new Place(4, "sidewalk");
		Place place4 = new Place(5, "well");

		PlaceTest placeTest = new PlaceTest(1, 1, "mailbox", "driveway", false, 2);
		PlaceTest placeTest1 = new PlaceTest(2, 5, "well", "well", true, 2);
		PlaceTest placeTest2 = new PlaceTest(3, 2, "driveway", "driveway", true, 2);
		PlaceTest placeTest3 = new PlaceTest(4, 10, "door", "camera", false, 2);
		PlaceTest placeTest4 = new PlaceTest(5, 6, "porch", "porch", true, 2);
		PlaceTest placeTest5 = new PlaceTest(6, 9, "storm door", "porch", false, 2);
		PlaceTest placeTest6 = new PlaceTest(7, 8, "camera", "camera", true, 2);

		placeRepository.save(place);
		placeRepository.save(place1);
		placeRepository.save(place2);
		placeRepository.save(place3);
		placeRepository.save(place4);

		placeTestRepository.save(placeTest);
		placeTestRepository.save(placeTest1);
		placeTestRepository.save(placeTest2);
		placeTestRepository.save(placeTest3);
		placeTestRepository.save(placeTest4);
		placeTestRepository.save(placeTest5);
		placeTestRepository.save(placeTest6);

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

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Model model) {
		model.addAttribute("userForm", new User());

		return "/user/registration";
	}

//    @RequestMapping(value = "/doug", method = RequestMethod.GET)
//    public String doug(Model model) {
//        model.addAttribute("userForm", new User());
//
//        return "/user/doug";
//    }


	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registration(@ModelAttribute("userForm") UserCommand userCommand,
										BindingResult bindingResult, Model model, User user) {

		if (bindingResult.hasErrors()) {
			return "/user/registration";
		}

		userService.saveOrUpdate(user);

		//securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

		return "redirect:/index";
	}

	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "/user/logout-success";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}
}
