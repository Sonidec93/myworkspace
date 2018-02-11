package com.practice.ui;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import resources.HibernateUtility;

import com.practice.Dao.EmployeeDaoImpl;

public class Main {
	
	public static void main(String[] args) {
		
		EmployeeDaoImpl obj=new EmployeeDaoImpl();
		try{
			
		
		System.out.println(obj.addEmployee("Mrinal"));
		System.out.println(obj.addEmployee("suresh"));
		}catch(Exception e){
			DOMConfigurator.configure("src/resources/Log4j.xml");
			Logger.getLogger(Main.class).error(e.getMessage(),e);
			
		}finally{
			HibernateUtility.closeSessionFactory();
		}
		}

}
