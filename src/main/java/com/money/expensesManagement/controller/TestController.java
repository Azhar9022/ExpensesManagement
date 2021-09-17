package com.money.expensesManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.money.expensesManagement.modelImpl.TestModel;
import com.money.expensesManagement.serviceImpl.TestService;

@Controller
public class TestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping("/")
	public String welcomeTest() {
		
		return testService.testMethod();
		//return "test";
	}
	
	@PostMapping(path="/save")
	public @ResponseBody String testSave(@RequestParam String testValue) {
		TestModel testModel = new TestModel();
		testModel.setTestValue(testValue);
		testService.testSave(testModel);
		return "saved";
	}

	
}
