package com.alex.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.savetravels.models.Expense;
import com.alex.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	// Constructor
	public ExpenseService(ExpenseRepository expense) {
		this.expenseRepository = expense;
	}
	
    // FINDS ALL the expenses
    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }
    // CREATES an expense
    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
    // FINDS, RETRIEVES an expense by ID
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
	
    }
    // UPDATES an expense
    public Expense updateExpense(Expense expense) {
    	return expenseRepository.save(expense);
    }
	
    // DELETES an expense
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
	
}
