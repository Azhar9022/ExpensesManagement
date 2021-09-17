package com.money.expensesManagement.Iservice;

import java.util.List;

import com.money.expensesManagement.modelImpl.Earning;

public interface IEarningService {
	
	public void saveEarning(Earning earningObj);
	public List<Earning> getAllEarning();
	public Earning getEarningById(int id) ;
	public void deleteEarningById(int id);

}
