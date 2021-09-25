package com.money.expensesManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.money.expensesManagement.modelImpl.Expense;
import com.money.expensesManagement.serviceImpl.ExpenseService;

@Controller
public class ExpenseDetailsController {
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/expenseDetails")
	public String getExpenseDetails() {
		
		return "expenseDetails";
	}
	
	@GetMapping(path="/getExpenseDetails")
	public ModelAndView getAllExpenses(){
		List<Expense> listExpense = expenseService.getAllExpense();
		 //return new ResponseEntity<List<Earning>>(listEarning, HttpStatus.OK);
		 return new ModelAndView("expenseDetails", "expenseDetailForm", listExpense);
	}
	
	/*
	 * @GetMapping(path="/getExpense/{id}") public ModelAndView
	 * getExpenseById(@PathVariable("id") int id) { Expense expenseObj =
	 * expenseService.getEarningById(id); return new ModelAndView("expense",
	 * "expenseForm", expenseObj); }
	 */

}
