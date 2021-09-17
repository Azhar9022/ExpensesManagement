package com.money.expensesManagement.IRepository;

import org.springframework.data.repository.CrudRepository;

import com.money.expensesManagement.modelImpl.TestModel;

public interface ITestRepository extends CrudRepository<TestModel, String>{

}
