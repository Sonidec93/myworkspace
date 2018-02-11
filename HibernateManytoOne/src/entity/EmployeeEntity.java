package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id@GeneratedValue
	private int EmpId;

	private String EmpName;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="account")
	private AccountEntity account;


	public AccountEntity getAccount() {
		return account;
	}

	public void setAccount(AccountEntity account) {
		this.account = account;
	}

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
