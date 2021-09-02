package org.payroll.loan.service;
import java.util.List;
import java.util.Optional;
import java.math.BigDecimal;
import org.payroll.loan.entities.PytrLoanTransaction;


public interface PytrLoanTransactionService {



public PytrLoanTransaction  save(PytrLoanTransaction pytrLoanTransaction);

	public  Iterable saveAll( List<PytrLoanTransaction> pytrLoanTransaction);
	public Iterable findAll();
	public Optional<PytrLoanTransaction>  findById(BigDecimal Id);
	public void  delete(PytrLoanTransaction pytrLoanTransaction);
	public void  deleteAll();}
