package com.doug.controllers;

import com.doug.commands.LoginCommand;
import com.doug.commands.UserCommand;
import com.doug.domain.User;
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

/**
 * Created by Doug on 12/17/16.
 */
@Controller
public class IndexController {

	@Autowired
	CardService cardService;


	private UserService userService;

	@RequestMapping({"/", ""})
	public String index(){
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
