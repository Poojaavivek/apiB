package apiB.apiB.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Loan")
public class Loan {

	@Column(name = "id", nullable = false)
	private Integer id;
	@Id
	@Column(name = "accountNumber", nullable = false)
	private String accountNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", accountNumber=" + accountNumber + "]";
	}

}
