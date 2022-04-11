package com.alex.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.fruityloops.models.FruitModel;

@Controller
public class FruitController {
	
	// ArrayList is just an ArrayList, we are just creating an instance with the word NEW and <FruitModel> is the name of our class in FruitModel.
	@RequestMapping("/")
	public String index(Model model) {
		ArrayList<FruitModel> fruits = new ArrayList<FruitModel>();
		fruits.add(new FruitModel("Kiwi", 1.5));
		fruits.add(new FruitModel("Watermelon", 2.5));
		fruits.add(new FruitModel("Berries", 3.5));
		fruits.add(new FruitModel("Grapes", 2.5));
		
		// Using model, we are adding all of the created fruits to the new ArrayList named "fruits".
		model.addAttribute("fruits", fruits);
		
		return "index.jsp";
		
	}

}
