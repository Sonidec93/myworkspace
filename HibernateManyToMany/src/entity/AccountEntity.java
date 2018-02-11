package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Account")
public class AccountEntity {

	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int accountNumber;
	private Double amount;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="accounts")
	private List<EmployeeEntity> list=new ArrayList<EmployeeEntity>(); 
	public List<EmployeeEntity> getList() {
		return list;
	}
	public void setList(List<EmployeeEntity> list) {
		this.list = list;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}


}
