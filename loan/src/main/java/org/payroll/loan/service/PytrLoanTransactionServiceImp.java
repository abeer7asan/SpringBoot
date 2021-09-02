package org.payroll.loan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;
import java.util.Optional;
import org.payroll.loan.entities.PytrLoanTransaction;
import org.payroll.loan.repository.PytrLoanTransactionRepository;

import java.math.BigDecimal;
@Service
public class PytrLoanTransactionServiceImp implements PytrLoanTransactionService {

	private static final Logger logger = LoggerFactory.getLogger(PytrLoanTransactionServiceImp.class);

	@Autowired
	private PytrLoanTransactionRepository pytrLoanTransactionRepository;

	@Override
	public void delete(PytrLoanTransaction pytrLoanTransaction) {
		pytrLoanTransactionRepository.delete(pytrLoanTransaction);
	}

	@Override
	public void deleteAll() {
		pytrLoanTransactionRepository.deleteAll(); // void
	}

	@Override
   @SuppressWarnings("unchecked")
	public Iterable findAll() {
		return (List<PytrLoanTransaction>) pytrLoanTransactionRepository.findAll(); 

	}
	
	@Override
	public Optional<PytrLoanTransaction> findById(BigDecimal Id) {

		return  pytrLoanTransactionRepository.findById(Id);

	}

	@Override
	public PytrLoanTransaction save(PytrLoanTransaction pytrLoanTransaction) {

		return pytrLoanTransactionRepository.save(pytrLoanTransaction);

	}

	@Override
	public Iterable saveAll(List<PytrLoanTransaction> pytrLoanTransaction) {

	return	pytrLoanTransactionRepository.saveAll(pytrLoanTransaction);

	}

}