package com.alex.ninjagold.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NinjaController {

	@RequestMapping("/")
	public String gold() {
		return "gold.jsp";
	}
	
	
}

