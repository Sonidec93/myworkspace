package com.practice.dao;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import resources.HibernateUtility;

import com.practice.beans.Account;
import com.practice.beans.Employee;

import entity.AccountEntity;
import entity.EmployeeEntity;

public class EmployeeDaoImpl implements EmployeeDao {

	private static final Logger LOGGER;

	static{
		DOMConfigurator.configure("src/resources/Log4j.xml");
		LOGGER=Logger.getLogger(EmployeeDaoImpl.class);
	}

	@Override
	public Account findAccountOfEmployee(Employee emp) {
		// TODO Auto-generated method stub 	
		SessionFactory sf=HibernateUtility.createSessionFactory();
		Session session=sf.openSession();
		Account account=null;
		try{

			EmployeeEntity obj=(EmployeeEntity)session.get(EmployeeEntity.class,emp.getEmpId());

			if(obj.getAccount()!=null){
				account=new Account();
				account.setAccountNumber(obj.getAccount().getAccountNumber());
				account.setAmount(obj.getAccount().getAmount());
			}

		}catch(Exception e){
			LOGGER.error(e.getMessage(),e);
			throw e;
		}finally{
			if(session.isOpen()||session!=null){
				session.close();
			}
		}

		return account;
	}

	@Override
	public void addAcountToEmployee(Account account, Employee obj) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtility.createSessionFactory();
		Session session=sf.openSession();
		EmployeeEntity emp=null;

		try{

			AccountEntity acc=(AccountEntity)session.get(AccountEntity.class,account.getAccountNumber());
			session.getTransaction().begin();
			if(acc!=null){

				emp=new EmployeeEntity();
				//emp.setAccount(acc);
				emp.setEmpId(obj.getEmpId());
				emp.setEmpName(obj.getEmpName());
				
				session.persist(emp);
				
			} 
			else{

				AccountEntity acc1=new AccountEntity();
				//acc1.setAccountNumber(account.getAccountNumber());
				acc1.setAmount(account.getAmount());
				emp=new EmployeeEntity();
				//emp.setAccount(acc1);
				//emp.setEmpId(obj.getEmpId());
				emp.setEmpName(obj.getEmpName());
				emp.setAccount(acc1);
				//session.getTransaction().begin();
				//session.getTransaction().begin();
				//session.persist(acc1);
				session.persist(emp);
				//session.getTransaction().commit();

			}
			session.getTransaction().commit();

		}catch(Exception e){
			LOGGER.error(e.getMessage(),e);
		}finally{
			if(session!=null||session!=null){
				session.close();
			}
		}


	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		SessionFactory sf=HibernateUtility.createSessionFactory();
		Session session=sf.openSession();
		try{
			
			EmployeeEntity emp=(EmployeeEntity)session.get(EmployeeEntity.class,empId);
			
			if(emp!=null){
				session.getTransaction().begin();
				session.delete(emp);
				session.getTransaction().commit();
			}
			
		}catch(Exception e){
			LOGGER.error(e.getMessage(),e);
		}finally{
			if(session.isOpen()||session!=null){
				session.close();
			}
		}
		
	}

	@Override
	public void addEmployeeToAccount(Account account, Employee obj) {
		SessionFactory sf=HibernateUtility.createSessionFactory();
		Session session=sf.openSession();
		try{
			EmployeeEntity emp=new EmployeeEntity();
			emp.setEmpName(obj.getEmpName());
			
			AccountEntity acc=new AccountEntity();
			acc.setAmount(account.getAmount());
			emp.setAccount(acc);
			acc.setEmp(emp);
			
			session.getTransaction().begin();
			session.persist(acc);
			session.getTransaction().commit();
			
		}catch(Exception e){
			LOGGER.error(e.getMessage(),e);
		}
		
	}

	
}