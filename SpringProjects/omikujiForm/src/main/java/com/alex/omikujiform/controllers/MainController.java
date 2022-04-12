package com.alex.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	// DISPLAY ROUTE
	@RequestMapping("/omikuji")
	public String index() {
		return "omikuji.jsp";
	}
	// DISPLAY ROUTE
	@RequestMapping("/omikuji/show")
	public String omikujishow() {
		return "omikujishow.jsp";
	}
	// FORM ROUTE
	@RequestMapping(value="/omikuji/form", method=RequestMethod.POST)
	public String omikuji(
			@RequestParam(value="number")Integer number,
			@RequestParam(value="city")String city,
			@RequestParam(value="person")String person,
			@RequestParam(value="hobby")String hobby,
			@RequestParam(value="thing")String thing,
			@RequestParam(value="somethingnice")String somethingnice,
			HttpSession session
			) {

			session.setAttribute("number", number);
			session.setAttribute("city", city);
			session.setAttribute("person", person);
			session.setAttribute("hobby", hobby);
			session.setAttribute("thing", thing);
			session.setAttribute("somethingnice", somethingnice);
			// Always redirect to a ROUTE.
			return "redirect:/omikuji/show";
	}
	
}
