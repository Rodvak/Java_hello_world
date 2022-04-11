package com.alex.daikichi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {

	
	@RequestMapping("/daikichi")
	public String daikichi() {
		return "Welcome!";
	}
	
	@RequestMapping("/daikichi/{var1}")
	public String daikichiToday(@PathVariable("var1") String var1) {
		return "Today " + var1 + " will find luck in all his endevors.";
	}
	
	@RequestMapping("/daikichi/tomorrow/{var1}")
	public String daikichiTomorrow(@PathVariable("var1") String var1) {
		return "Tomorrow an opportunity will arise, " + var1 + ". Be sure to be open to new ideas!";
	}
	
	@RequestMapping("daikichi/travel/{var1}")
	public String daikichiTravel(@PathVariable("var1") String var1) {
		return "Congratulations! You will soon travel to " + var1 + ".";
	}
	
	@RequestMapping("daikichi/lotto/{var1}")
	public String daikitiLotto(@PathVariable("var1") int var1) {
		if (var1%2 == 0){
			return "You will take a grand jorney in the near future, but be weary of tempting offers";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to  spend time with family and friends";
		}
	}
	
}
