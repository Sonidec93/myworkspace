package entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeCompany")
public class EmployeeCompanyEntity {

	@EmbeddedId
	private EmbeddedPrimaryKey key;

	private double tenure;

	public EmbeddedPrimaryKey getKey() {
		return key;
	}

	public void setKey(EmbeddedPrimaryKey key) {
		this.key = key;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
}
