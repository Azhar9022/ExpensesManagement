package com.money.expensesManagement.IRepository;

import org.springframework.data.repository.CrudRepository;

import com.money.expensesManagement.modelImpl.Expense;

public interface IExpenseRepository extends CrudRepository<Expense, Integer>{

}
