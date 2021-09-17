package com.money.expensesManagement.modelImpl;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.money.expensesManagement.IModel.IEarning;

@Entity
@Table
public class Earning implements IEarning{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int earnId;
	//@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date earnDate;
	private String earnSource;
	private int earnPayment;
	private String earnRemarks;
	public int getEarnId() {
		return earnId;
	}
	public void setEarnId(int earnId) {
		this.earnId = earnId;
	}
	public Date getEarnDate() {
		return earnDate;
	}
	public void setEarnDate(Date earnDate) {
		this.earnDate = earnDate;
	}
	public String getEarnSource() {
		return earnSource;
	}
	public void setEarnSource(String earnSource) {
		this.earnSource = earnSource;
	}
	public int getEarnPayment() {
		return earnPayment;
	}
	public void setEarnPayment(int earnPayment) {
		this.earnPayment = earnPayment;
	}
	public String getEarnRemarks() {
		return earnRemarks;
	}
	public void setEarnRemarks(String earnRemarks) {
		this.earnRemarks = earnRemarks;
	}

}
