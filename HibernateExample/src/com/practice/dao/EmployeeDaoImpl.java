package com.practice.dao;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import resources.AppConfig;
import resources.HibernateUtility;

import com.practice.beans.Employee;

import entity.EmployeeEntity;

public class EmployeeDaoImpl {

	private static final Logger logger;

	static{

		DOMConfigurator.configure("src/resources/Log4j.xml");
		logger=Logger.getLogger(EmployeeDaoImpl.class);

	}

	public void addEmployee(Employee emp){


		SessionFactory sf=HibernateUtility.createSessionFactory();
		Session session=null;


		try{
			session=sf.openSession();
			EmployeeEntity empEntity=new EmployeeEntity();
			empEntity.setEmpName(emp.getEmpName());
			empEntity.setEmpId(emp.getEmpId());

			session.getTransaction().begin();

			session.persist(empEntity);

			session.getTransaction().commit();





		}
		catch(Exception e){
			logger.error(e.getMessage(),e);
			throw e;
		}
		finally{
			if(session.isOpen()||session!=null){
				session.close();
				sf.close();
			}

		}


	}


	public Employee getEmployee(Integer Id){

		SessionFactory sf=HibernateUtility.createSessionFactory();
		Session session=null;
		Employee obj=null;
		try{

			session=sf.openSession();

			EmployeeEntity emp=(EmployeeEntity)session.get(EmployeeEntity.class,Id);

			if(emp!=null){
				obj=new Employee();
				obj.setEmpId(emp.getEmpId());
				obj.setEmpName(emp.getEmpName());
			}


		}
		catch(Exception e){
			logger.error(e.getMessage(),e);
			throw e;
		}
		finally{
			if(session.isOpen()||session!=null){
				session.close();
			}
		}
		return obj;

	}

	public void updateEmployee(Integer Id){

		SessionFactory sf=HibernateUtility.createSessionFactory();
		Session session=sf.openSession();

		try{

			EmployeeEntity emp=(EmployeeEntity)session.get(EmployeeEntity.class,Id);

			if(emp!=null){

				session.getTransaction().begin();
				emp.setEmpName("Mahesh");
				session.getTransaction().commit();

			}
			else{
				logger.info(AppConfig.PROPERTIES.getProperty("emp_not_present"));
			}

		}catch(Exception e){

			logger.error(e.getMessage(),e);
			throw e;
		}
		finally{

			if(session.isOpen()||session!=null){
				session.close();
			}
		}


	}
	public void deleteEmployee(Integer Id){
		SessionFactory sf=HibernateUtility.createSessionFactory();
		Session session=sf.openSession();
		try{
			EmployeeEntity emp=(EmployeeEntity)session.get(EmployeeEntity.class,Id);
			if(emp!=null){
				session.getTransaction().begin();
				session.delete(emp);
				session.getTransaction().commit();
			}
			else{
				logger.info(AppConfig.PROPERTIES.getProperty("emp_not_present"));

			}


		}catch(Exception e){

			logger.error(e.getMessage(),e);
			throw e;
		}finally{
			if(session.isOpen()||session!=null){
				session.close();
			}

		}


	}

}
