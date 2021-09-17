package com.money.expensesManagement.modelImpl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test_table")
public class TestModel {
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
 private int id;


 private String testValue;
 
public int getId() {
	return id;
}
public void setId(int id) {
	id = this.id;
}
public String getTestValue() {
	return testValue;
}
public void setTestValue(String testValue) {
	this.testValue = testValue;
}
}
