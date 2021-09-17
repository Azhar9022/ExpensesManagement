package com.money.expensesManagement.RepositoryImpl;

import org.springframework.data.jpa.repository.Query;

public class DashboardRepositoryImpl {
	
	/*
	 * @Query( value = "SELECT SUM(exp_payment) FROM expense ", nativeQuery = true)
	 */
	
	int getTotalExpense() {
		String Query = "SELECT SUM(exp_payment) FROM expense ";
		
		
		return 0;
	}

}
