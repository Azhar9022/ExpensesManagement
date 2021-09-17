package com.money.expensesManagement.modelImpl;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.money.expensesManagement.IModel.IExpense;

@Entity
@Table
public class Expense implements IExpense{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	//@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date expDate;
	private String expItem;
	private int expPayment;
	private String expRemarks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public String getExpItem() {
		return expItem;
	}
	public void setExpItem(String expItem) {
		this.expItem = expItem;
	}
	public int getExpPayment() {
		return expPayment;
	}
	public void setExpPayment(int expPayment) {
		this.expPayment = expPayment;
	}
	public String getExpRemarks() {
		return expRemarks;
	}
	public void setExpRemarks(String expRemarks) {
		this.expRemarks = expRemarks;
	}
	
	
	

}
