package com.practice.dao;

import java.util.List;

import com.practice.beans.Account;
import com.practice.beans.Employee;

public interface EmployeeDao {

	public int addAccountsToEmployee(List<Account> accoList,String EmpName);
	public void removeAccount(int accountNumber,int empId);
	public void  deleteEmployee(int empId);
	public void addingEmployeesToAccounts(List<Employee> employees,Double amount);
	public void manyTomanyHQL();
	public void manyToManyCriteria();
}
