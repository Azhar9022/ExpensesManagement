package com.money.expensesManagement.Iservice;

import java.util.List;

import com.money.expensesManagement.modelImpl.Expense;


public interface IExpenseService {
	public void saveExpense(Expense expenseObj);
	public List<Expense> getAllExpense();
	public Expense getExpenseById(int id) ;
	public void deleteExpenseById(int id);
}
