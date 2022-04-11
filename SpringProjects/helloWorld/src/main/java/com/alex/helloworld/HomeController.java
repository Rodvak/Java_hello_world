package com.alex.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {

	@RequestMapping("")
	public String index() {
		return "Hello World";
	}
		
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome, Alex.";
	}
}
