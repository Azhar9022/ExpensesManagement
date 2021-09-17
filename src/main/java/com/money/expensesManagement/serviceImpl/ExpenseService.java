package com.money.expensesManagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.money.expensesManagement.IRepository.IExpenseRepository;
import com.money.expensesManagement.Iservice.IExpenseService;
import com.money.expensesManagement.modelImpl.Expense;

@Service
public class ExpenseService implements IExpenseService{
	
	@Autowired
	private IExpenseRepository expenseRepository;
	
	public void saveExpense(Expense expenseObj) {
		expenseRepository.save(expenseObj);
	}
	
	public List<Expense> getAllExpense(){
		List<Expense> listExpense = (List<Expense>) expenseRepository.findAll(); // was giving error, hence needed to type cast
		if(listExpense.size() > 0) {
            return listExpense;
        } else {
            return new ArrayList<Expense>();
        }
	}
	
	//public Expense getExpenseById(int id) throws RecordNotFoundException{ // need to implement exception class
	public Expense getExpenseById(int id) {
		Optional<Expense> expenseObj =  expenseRepository.findById(id);
		 if(expenseObj.isPresent()) {
	            return expenseObj.get();
	        } else {
	            //throw new RecordNotFoundException("No employee record exist for given id");
	        	return new Expense();
	        }
	}
	
	public void deleteExpenseById(int id) {
		Optional<Expense> expenseObj = expenseRepository.findById(id);
		 if(expenseObj.isPresent()) 
	        {
			 expenseRepository.deleteById(id);
	        } else {
	            //throw new RecordNotFoundException("No employee record exist for given id");
	        	
	        }
	}

}
