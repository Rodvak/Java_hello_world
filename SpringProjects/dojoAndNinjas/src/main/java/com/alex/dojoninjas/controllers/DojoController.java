package com.alex.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alex.dojoninjas.models.Dojo;
import com.alex.dojoninjas.services.DojoService;


@Controller
public class DojoController {

	@Autowired
	private DojoService dojoService;
	
//	
//	@Autowired
//	private NinjaService ninjaService;
	
	

	//---------------CREATE-RENDER PAGE----------------
	@GetMapping("/dojos")
	public String dojosNew( @ModelAttribute("dojo") Dojo dojo,
			Model model) {
		List<Dojo> allDojos = dojoService.allDojos();
		model.addAttribute("allDojos", allDojos);
		return "dojo.jsp";
	}

		
	//---------------CREATE-POST METHOD----------------
	@PostMapping("/dojos/new")
	public String create(@Valid @ModelAttribute ("dojo") Dojo dojo,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			List<Dojo> allDojos = dojoService.allDojos();
			model.addAttribute("allDojos", allDojos);
			return "dojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos";
		}
		
	}
		

		
	//---------------EDIT-RENDER PAGE----------------

		
	//---------------EDIT-UPDATE METHOD----------------

		
	//---------------SHOW-RENDER PAGE----------------

		
		
	//---------------DELETE-METHOD----------------

		
}
