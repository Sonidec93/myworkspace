package com.practice.Dao;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.EmployeeEntity;
import resources.HibernateUtility;

public class EmployeeDaoImpl {
	
	private static final Logger LOGGER;
	
	static{
		DOMConfigurator.configure("src/resources/Log4j.xml");
		LOGGER=Logger.getLogger(EmployeeDaoImpl.class);
		
	}
	
	public Integer addEmployee(String name){
		SessionFactory sf=HibernateUtility.createSessionFactory();
		Session session=sf.openSession();
		Integer employeeId=null;
		try{
			
			EmployeeEntity emp=new EmployeeEntity();
			emp.setEmpName(name);
			
			session.getTransaction().begin();
			employeeId=(Integer) session.save(emp);
			session.getTransaction().commit();
			
			
		}catch(Exception e){
			
			LOGGER.error(e.getMessage(),e);
			throw e;
		}finally{
			if(session.isOpen()||session!=null){
				session.close();
			}
			
			
		}
		return employeeId;
		
	}

}
