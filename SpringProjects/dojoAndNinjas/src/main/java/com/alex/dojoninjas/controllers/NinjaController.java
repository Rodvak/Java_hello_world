package com.alex.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.dojoninjas.models.Dojo;
import com.alex.dojoninjas.models.Ninja;
import com.alex.dojoninjas.services.DojoService;
import com.alex.dojoninjas.services.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	private NinjaService ninjaService;
	
	@Autowired
	private DojoService dojoService;

	

	//---------------CREATE-RENDER PAGE----------------
	@RequestMapping("/ninjas")
	public String ninjasNew(@ModelAttribute("ninja") Ninja ninja,
			Model model) {
		List<Ninja> allNinjas = ninjaService.allNinjas();
		model.addAttribute("allNinjas", allNinjas);
		List<Dojo> allDojos = dojoService.allDojos();
		model.addAttribute("allDojos", allDojos);
		return "ninja.jsp";
	}
	

		
	//---------------CREATE-POST METHOD----------------
	@PostMapping("/ninjas/new")
	public String create(@Valid @ModelAttribute ("ninja") Ninja ninja,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			List<Ninja> allNinjas = ninjaService.allNinjas();
			model.addAttribute("allNinjas", allNinjas);
			List<Dojo> allDojos = dojoService.allDojos();
			model.addAttribute("allDojos", allDojos);
			return "ninja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas";
		}
	}

		
	//---------------EDIT-RENDER PAGE----------------

		
	//---------------EDIT-UPDATE METHOD----------------

		
	//---------------SHOW-RENDER PAGE----------------
	@RequestMapping("/dojos/{id}")
	public String show(@PathVariable("id")Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojowithninjas.jsp";
	}
	
		
	//---------------DELETE-METHOD----------------

		
}
