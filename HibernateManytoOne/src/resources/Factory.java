package resources;

import com.practice.dao.EmployeeDao;
import com.practice.dao.EmployeeDaoImpl;

public class Factory {

	
	public static EmployeeDao createEmployeeDao(){
		return new EmployeeDaoImpl();
	}
}
