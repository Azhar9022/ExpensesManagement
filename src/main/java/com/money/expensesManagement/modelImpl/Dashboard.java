package com.money.expensesManagement.modelImpl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dashboard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int totEarnings;
	private int totExpenses;
	public int getTotEarnings() {
		return totEarnings;
	}
	public void setTotEarnings(int totEarnings) {
		this.totEarnings = totEarnings;
	}
	public int getTotExpenses() {
		return totExpenses;
	}
	public void setTotExpenses(int totExpenses) {
		this.totExpenses = totExpenses;
	}

}
