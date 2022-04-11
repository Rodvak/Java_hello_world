package com.alex.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "omikuji.jsp";
	}

	@RequestMapping(value="/omikuji", method=RequestMethod.POST)
	public String omikuji(
			@RequestParam(value="number")Integer number,
			@RequestParam(value="city")String city,
			@RequestParam(value="person")String person,
			@RequestParam(value="hobby")String hobby,
			@RequestParam(value="thing")String thing,
			@RequestParam(value="somethingnice")String somethingnice
			) {
		
			return "redirect:/omikujishow.jsp";
	}
	
	@RequestMapping("/omikuji/show")
	public String omikujishow(Model model) {
		String city = "city";
		String person = "person";
		String hobby = "hobby";
		String thing = "thing";
		String somethingnice = "somethingnice";
		
		model.addAttribute("city", city);
		model.addAttribute("person", person);
		model.addAttribute("hobby", hobby);
		model.addAttribute("thing", thing);
		model.addAttribute("somethingnice", somethingnice);
		
		return "omikujishow.jsp";
	}
	
}
