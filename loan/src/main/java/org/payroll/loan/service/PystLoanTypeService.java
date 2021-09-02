package org.payroll.loan.service;
import java.util.List;
import java.util.Optional;
import java.math.BigDecimal;
import org.payroll.loan.entities.PystLoanType;


public interface PystLoanTypeService {



public PystLoanType  save(PystLoanType pystLoanType);

	public  Iterable saveAll( List<PystLoanType> pystLoanType);
	public Iterable findAll();
	public Optional<PystLoanType>  findById(BigDecimal Id);
	public void  delete(PystLoanType pystLoanType);
	public void  deleteAll();}
