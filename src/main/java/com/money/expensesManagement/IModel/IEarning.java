package com.money.expensesManagement.IModel;

import java.util.Date;

public interface IEarning {
	
	public int getEarnId();
	public void setEarnId(int earnId);
	public Date getEarnDate();
	public void setEarnDate(Date earnDate) ;
	public String getEarnSource();
	public void setEarnSource(String earnSource) ;
	public int getEarnPayment();
	public void setEarnPayment(int earnPayment);
	public String getEarnRemarks();
	public void setEarnRemarks(String earnRemarks);

}
