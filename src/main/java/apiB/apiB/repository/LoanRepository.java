package apiB.apiB.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apiB.apiB.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
	public List<Loan> findAllById(Integer id);

}
