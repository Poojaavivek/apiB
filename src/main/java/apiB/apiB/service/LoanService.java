package apiB.apiB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiB.apiB.entity.Loan;
import apiB.apiB.model.LoanResponse;
import apiB.apiB.repository.LoanRepository;

@Service
public class LoanService implements LoanServiceInterface {

	@Autowired
	private LoanRepository loanRepository;

	// @Override
	public LoanResponse getLoanById(Integer id) {
		return this.getResponse("SUCCESS", "loan details", loanRepository.findAllById(id));
	}

	private LoanResponse getResponse(String responseType, String responseMessage, List<Loan> loan) {
		LoanResponse lresponse = new LoanResponse();
		lresponse.setResponseType(responseType);
		lresponse.setResponseMessage(responseMessage);
		lresponse.setLoan(loan);
		return lresponse;
	}
}
