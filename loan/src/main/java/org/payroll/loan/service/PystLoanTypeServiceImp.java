package org.payroll.loan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;
import java.util.Optional;
import org.payroll.loan.entities.PystLoanType;
import org.payroll.loan.repository.PystLoanTypeRepository;

import java.math.BigDecimal;
@Service
public class PystLoanTypeServiceImp implements PystLoanTypeService {

	private static final Logger logger = LoggerFactory.getLogger(PystLoanTypeServiceImp.class);

	@Autowired
	private PystLoanTypeRepository pystLoanTypeRepository;

	@Override
	public void delete(PystLoanType pystLoanType) {
		pystLoanTypeRepository.delete(pystLoanType);
	}

	@Override
	public void deleteAll() {
		pystLoanTypeRepository.deleteAll(); // void
	}

	@Override
   @SuppressWarnings("unchecked")
	public Iterable findAll() {
		return (List<PystLoanType>) pystLoanTypeRepository.findAll(); 

	}
	
	@Override
	public Optional<PystLoanType> findById(BigDecimal Id) {

		return  pystLoanTypeRepository.findById(Id);

	}

	@Override
	public PystLoanType save(PystLoanType pystLoanType) {

		return pystLoanTypeRepository.save(pystLoanType);

	}

	@Override
	public Iterable saveAll(List<PystLoanType> pystLoanType) {

	return	pystLoanTypeRepository.saveAll(pystLoanType);

	}

}