package com.practice.dao;

import com.practice.beans.Account;
import com.practice.beans.Employee;

public interface EmployeeDao {

	public void addAcountToEmployee(Account account,Employee obj);
	public Account findAccountOfEmployee(Employee emp);
	public void deleteEmployee(int empId);
	public void addEmployeeToAccount(Account account,Employee obj);
}
