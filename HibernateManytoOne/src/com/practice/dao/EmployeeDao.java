package com.practice.dao;

import java.util.List;

import com.practice.beans.Account;
import com.practice.beans.Employee;

public interface EmployeeDao {

	public void addAcountToEmployee(Account account,Employee obj);
	public Account findAccountOfEmployee(Employee emp);
	public void deleteEmployee(int empId);
	public void addEmployeeToAccount(Account account,Employee obj);
	public void deleteAccount(int accountNumber);
	public void addListofEmployeesToAccount(List<Employee> empList,Account acc);
}
