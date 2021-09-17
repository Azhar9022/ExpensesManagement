package com.money.expensesManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.money.expensesManagement.IRepository.ITestRepository;
import com.money.expensesManagement.modelImpl.TestModel;


@Service
public class TestService {
 
	@Autowired
	private ITestRepository testRepo;
	 public String testMethod() {
		 testRepo.count();
		 return "test";
	 }
	 public void testSave(TestModel testModel) {
		 testRepo.save(testModel);
	 }
}
