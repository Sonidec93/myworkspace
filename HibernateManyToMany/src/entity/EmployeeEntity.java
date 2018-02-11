package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int EmpId;

	private String EmpName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "AccountEmployee", joinColumns = { @JoinColumn(name = "EmpId", referencedColumnName = "EmpId") }, inverseJoinColumns = { @JoinColumn(name = "accountNumber", referencedColumnName = "accountNumber") })
	private List<AccountEntity> accounts = new ArrayList<AccountEntity>();

	public int getEmpId() {
		return EmpId;
	}

	public List<AccountEntity> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountEntity> accounts) {
		this.accounts = accounts;
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
