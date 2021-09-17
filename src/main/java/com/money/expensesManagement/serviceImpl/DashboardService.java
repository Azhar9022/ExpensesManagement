package com.money.expensesManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.money.expensesManagement.IRepository.IDashboardRepository;
import com.money.expensesManagement.Iservice.IDashboardService;

@Service
public class DashboardService implements IDashboardService{
	
	
	  @Autowired 
	  IDashboardRepository dashboardRepo;
	 

	@Override
	public int getTotExpense() {
		// TODO Auto-generated method stub
		return dashboardRepo.getTotalExpense();
		//return 674388;
	}

	@Override
	public int getTotEarning() {
		// TODO Auto-generated method stub
		return dashboardRepo.getTotalEarning();
		//return 478833;
	}
	
	

}
