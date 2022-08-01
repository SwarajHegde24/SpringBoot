package com.nagarro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.dao.UserDao;
import com.nagarro.domain.User;
import com.nagarro.service.BookService;


@Controller
public class LoginController {

	@Autowired
	private UserDao ld;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String show(Model model) {
		model.addAttribute("ver", new User());
		return "login";
	}

	@RequestMapping(value = "home", method = RequestMethod.POST)
	public String verify(@ModelAttribute("ver") @Valid User login, BindingResult result, Model model) {

		// return "home";

		if (result.hasErrors()) {
			return "login";
		}
		if (ld.validator(login)) {
			return "home";
		} else {
			model.addAttribute("msg", "UserName or Password is invalid");

			return "login";
		}

	}
	
	

}
