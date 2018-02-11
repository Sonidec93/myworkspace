package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import resources.Factory;
import resources.HibernateUtility;

import com.practice.beans.Account;
import com.practice.beans.Employee;
import com.practice.dao.EmployeeDao;

public class MainClass {

	public static void main(String[] args) {

		try{	
			EmployeeDao empDao=Factory.createEmployeeDao();

			/*List<Account> accounts=new ArrayList<Account>();


			String ch="";
			Scanner s=new Scanner(System.in);
			do{


				Account obj=new Account();
				System.out.println("Enter the amount");
				obj.setAmount(s.nextDouble()); 

				accounts.add(obj);
				System.out.println("Do you want to add more accounts");
				ch=s.next();
				System.out.println(ch);
			}while(ch.equals(new String("y"))||ch.equals(new String("Y")));*/

			//empDao.removeAccount(2,empDao.addAccountsToEmployee(accounts,"Mukul"));
			//empDao.addAccountsToEmployee(accounts,"mukul");
			//empDao.manyTomanyHQL();
			empDao.manyToManyCriteria();
			//empDao.deleteEmployee(1);
		//s.close();	
		
		//------adding Employees to account------
		
		
			/*EmployeeDao empDao=Factory.createEmployeeDao();
			List<Employee> list=new ArrayList<Employee>();
			Employee emp1=new Employee();
			emp1.setEmpName("Mukul");
			Employee emp2=new Employee();
			emp2.setEmpName("Mukesh");
			list.add(emp1);
			list.add(emp2);
			empDao.addingEmployeesToAccounts(list,5000.0);*/

		}catch(Exception e){
			DOMConfigurator.configure("src/resources/Log4j.xml");
			Logger.getLogger(MainClass.class).error(e.getMessage(),e);
		}finally{
			HibernateUtility.closeSessionFactory();
		}
	}
}
