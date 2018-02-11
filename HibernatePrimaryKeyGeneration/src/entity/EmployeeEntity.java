package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="employee")
@TableGenerator(name="EmployeePkey",pkColumnName="EmployeeId",pkColumnValue="EmpId",valueColumnName="NextValue",allocationSize=1,table="EmployeePkey")
public class EmployeeEntity implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="EmployeePkey")
	private int EmpId;
	
	private String EmpName;

	public int getEmpId() {
		return EmpId;	
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
	
}
