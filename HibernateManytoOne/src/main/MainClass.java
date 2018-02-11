package main;

import java.util.ArrayList;
import java.util.List;

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
			//Account account=new Account();
			//account.setAccountNumber(100);
			//account.setAmount(10000.0);
			//Employee obj=new Employee();
			//obj.setEmpId(101);
			//obj.setEmpName("mahesh");
		
		//emp.addAcountToEmployee(account,obj);
			//emp.deleteEmployee(101);

			//Employee obj2=new Employee();
			///obj2.setEmpName("mukul");

			//now i will enter the employee having same same account number as of the previous employee
			//account.setAccountNumber(1);
			//emp.addAcountToEmployee(account, obj2);

			//emp.deleteEmployee(1);

			//I will use oneToMany now
			//List<Employee> list=new ArrayList<Employee>();
			//list.add(obj);
			//list.add(obj2);

			//emp.addListofEmployeesToAccount(list,account);
			emp.deleteAccount(1);

		}catch(Exception e){
			DOMConfigurator.configure("src/resources/Log4j.xml");
			Logger.getLogger(MainClass.class).error(e.getMessage(),e);
		}finally{

			HibernateUtility.closeSessionFactory();
		}

	}

}
