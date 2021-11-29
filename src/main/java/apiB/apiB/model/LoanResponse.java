package apiB.apiB.model;

import java.util.List;

//import java.sql.Date;

import apiB.apiB.entity.Loan;

public class LoanResponse {

	private String responseType;
	private String responseMessage;
	private List<Loan> loan;

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public List<Loan> getLoan() {
		return loan;
	}

	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}

}
