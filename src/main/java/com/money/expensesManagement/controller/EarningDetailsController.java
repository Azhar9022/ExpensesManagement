package com.money.expensesManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.money.expensesManagement.modelImpl.Earning;
import com.money.expensesManagement.serviceImpl.EarningService;

@Controller
public class EarningDetailsController {
	
	@Autowired
	EarningService earningService;
	
	@RequestMapping("/earningDetails")
	public String getEarningDetails() {
		
		return "earningDetails";
	}
	
	@GetMapping(path="/getEarningDetails")
	public ModelAndView getAllEarning(){
		List<Earning> listEarning = earningService.getAllEarning();
		 //return new ResponseEntity<List<Earning>>(listEarning, HttpStatus.OK);
		 return new ModelAndView("earningDetails", "earningDetailForm", listEarning);
	}
	
	/*
	 * @GetMapping(path="/getEarning/{id}") public ModelAndView
	 * getEarningById(@PathVariable("id") int id) { Earning earningObj =
	 * earningService.getEarningById(id); return new ModelAndView("earning",
	 * "earningForm", earningObj); }
	 */

}
