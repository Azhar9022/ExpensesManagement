package com.money.expensesManagement.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.money.expensesManagement.modelImpl.Expense;
import com.money.expensesManagement.serviceImpl.ExpenseService;

@RestController 
public class ExpenseController {

	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/expense")
	public ModelAndView welcomeExpense() {
		
		//return "expense";
		return new ModelAndView("expense", "expenseForm", new Expense());
	}
	
	@PostMapping(path="/saveExpense")
	public @ResponseBody String saveExpense(@ModelAttribute("expenseForm") Expense expenseForm) {
		/*
		 * Expense expenseObj = new Expense(); expenseObj.setDate(expDate);
		 */
		Expense expenseForm1 = expenseForm;
		expenseService.saveExpense(expenseForm);
		return "expense";
	}
	
	@GetMapping(path="/getAllExpenses")
	public ResponseEntity<List<Expense>> getAllExpense(){
		List<Expense> listExpense = expenseService.getAllExpense();
		 return new ResponseEntity<List<Expense>>(listExpense, HttpStatus.OK);
	}
	
	/*
	 * @GetMapping(path="/getExpense/{id}") public ResponseEntity<Expense>
	 * getExpenseById(@PathVariable("id") int id) { Expense expenseObj =
	 * expenseService.getExpenseById(id); return new
	 * ResponseEntity<Expense>(expenseObj, HttpStatus.OK); }
	 */
	
	@GetMapping(path="/getExpense/{id}")
	public ModelAndView getExpenseById(@PathVariable("id") int id) {
		Expense expenseObj = expenseService.getExpenseById(id);
		return new ModelAndView("expense", "expenseForm", expenseObj);
	}
	
	 @DeleteMapping(path="/deleteExpense/{id}")
	    public ResponseEntity<HttpStatus> deleteExpenseById(@PathVariable("id") int id){
		 expenseService.deleteExpenseById(id);
	        //return HttpStatus.FORBIDDEN;
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
		/*
		 * @InitBinder public void initBinder(WebDataBinder binder, WebRequest request)
		 * { //convert the date Note that the conversion here should always be in the
		 * same format as the string passed in, e.g. 2015-9-9 should be yyyy-MM-dd
		 * DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		 * binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,
		 * true));// CustomDateEditor is a custom date editor }
		 */
}
