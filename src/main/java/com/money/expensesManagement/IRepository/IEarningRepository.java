package com.money.expensesManagement.IRepository;

import org.springframework.data.repository.CrudRepository;

import com.money.expensesManagement.modelImpl.Earning;

public interface IEarningRepository extends CrudRepository<Earning, Integer>{

}
