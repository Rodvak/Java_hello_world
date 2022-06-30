package com.alex.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.savetravels.models.Expense;
import com.alex.savetravels.services.ExpenseService;

@Controller
public class SaveTravelsController {
	
	@Autowired
	private ExpenseService expenseService;

//---------------CREATE-RENDER PAGE----------------
	
	@GetMapping("/")
	public String createExpense(@ModelAttribute("expense") Expense expense,
			Model model){
		List<Expense> allExpenses = expenseService.allExpenses();
		model.addAttribute("allExpenses", allExpenses);
		return "index.jsp";
	}
	
//---------------CREATE-POST METHOD----------------
	
	@PostMapping("/expenses")
	public String create(@Valid @ModelAttribute ("expense") Expense expense,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			List<Expense> allExpenses = expenseService.allExpenses();
			model.addAttribute("allExpenses", allExpenses);
			return "index.jsp";
		} else {
			expenseService.createExpense(expense);
			return "redirect:/";
		}
		
	}
	
//---------------EDIT-RENDER PAGE----------------
	@RequestMapping("/expenses/edit/{id}")
	public String editExpense(@PathVariable("id")Long id, Model model) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	
//---------------EDIT-UPDATE METHOD----------------
	@PutMapping("/expenses/{id}")
	public String update(@Valid @ModelAttribute ("expense") Expense expense,
			BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		} else {
			expenseService.updateExpense(expense);
			return "redirect:/";
		}
	}
	
//---------------SHOW-RENDER PAGE----------------
	@RequestMapping("/expenses/show/{id}")
	public String show(@PathVariable("id")Long id, Model model) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "show.jsp";
	}
	
	
//---------------DELETE-METHOD----------------
	@DeleteMapping("/expenses/{id}")
	public String delete(@PathVariable("id")Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/";
	}
	
}
