package com.money.expensesManagement.IRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.money.expensesManagement.modelImpl.Dashboard;
import com.money.expensesManagement.modelImpl.Expense;

public interface IDashboardRepository extends CrudRepository<Dashboard, Integer>{

	
	 @Query( 
		value = "SELECT SUM(exp_payment) FROM expense ", 
		nativeQuery = true)
	 int getTotalExpense();
	 
	 @Query( 
				value = "SELECT SUM(earn_payment) FROM earning ", 
				nativeQuery = true)
			 int getTotalEarning();
}
