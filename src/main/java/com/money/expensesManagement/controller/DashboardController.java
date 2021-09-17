package com.money.expensesManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.money.expensesManagement.modelImpl.Expense;
import com.money.expensesManagement.serviceImpl.DashboardService;

@Controller
public class DashboardController {
	
	@Autowired
	DashboardService dashboardService;
	
	@RequestMapping("/dashboard")
	public String getDashboardData(Model model) {
		int totEarning = dashboardService.getTotEarning();
		int totExpense = dashboardService.getTotExpense();
		model.addAttribute("totEarning",totEarning);
		model.addAttribute("totExpense",totExpense);
		return "dashboard";
	}
	
	
}
