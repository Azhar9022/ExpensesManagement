package com.money.expensesManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EarningDetailsController {
	@RequestMapping("/earningDetails")
	public String getEarningDetails() {
		
		return "earningDetails";
	}

}
