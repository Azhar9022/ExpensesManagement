package com.money.expensesManagement.IModel;

import java.util.Date;
import java.time.LocalDate;

public interface IExpense {
	
	public int getId();
	public void setId(int id);
	public Date getExpDate() ;
	public void setExpDate(Date expDate);
	public String getExpItem() ;
	public void setExpItem(String expItem);
	public int getExpPayment();
	public void setExpPayment(int expPayment);
	public String getExpRemarks();
	public void setExpRemarks(String expRemarks);
	

}
