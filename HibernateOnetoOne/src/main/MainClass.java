package main;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import resources.HibernateUtility;

import com.practice.beans.Account;
import com.practice.beans.Employee;
import com.practice.dao.EmployeeDao;

public class MainClass {

	public static void main(String[] args) {

		try{

			EmployeeDao emp=resources.Factory.createEmployeeDao();
			Account account=new Account();
			//account.setAccountNumber(100);
			account.setAmount(10000.0);
			Employee obj=new Employee();
			//obj.setEmpId(101);
			obj.setEmpName("mahesh");
			//emp.addEmployeeToAccount(account, obj);
			emp.addAcountToEmployee(account,obj);
			//emp.deleteEmployee(101);


		}catch(Exception e){
			DOMConfigurator.configure("src/resources/Log4j.xml");
			Logger.getLogger(MainClass.class).error(e.getMessage(),e);
		}finally{

			HibernateUtility.closeSessionFactory();
		}

	}

}
