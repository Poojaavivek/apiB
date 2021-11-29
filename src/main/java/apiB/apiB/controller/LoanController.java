package apiB.apiB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiB.apiB.model.LoanResponse;
import apiB.apiB.service.LoanService;

@RestController
@RequestMapping("/loan-service/v1/customer")
public class LoanController {
	@Autowired
	private LoanService loanService;

	@GetMapping("/{id}/loans")
	public ResponseEntity<LoanResponse> getLoanById(@PathVariable Integer id) {
		return new ResponseEntity<LoanResponse>(loanService.getLoanById(id), HttpStatus.OK);
	}

}
