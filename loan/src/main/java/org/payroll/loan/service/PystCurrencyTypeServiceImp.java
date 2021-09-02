package org.payroll.loan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;
import java.util.Optional;
import org.payroll.loan.entities.PystCurrencyType;
import org.payroll.loan.repository.PystCurrencyTypeRepository;

import java.math.BigDecimal;
@Service
public class PystCurrencyTypeServiceImp implements PystCurrencyTypeService {

	private static final Logger logger = LoggerFactory.getLogger(PystCurrencyTypeServiceImp.class);

	@Autowired
	private PystCurrencyTypeRepository pystCurrencyTypeRepository;

	@Override
	public void delete(PystCurrencyType pystCurrencyType) {
		pystCurrencyTypeRepository.delete(pystCurrencyType);
	}

	@Override
	public void deleteAll() {
		pystCurrencyTypeRepository.deleteAll(); // void
	}

	@Override
   @SuppressWarnings("unchecked")
	public Iterable findAll() {
		return (List<PystCurrencyType>) pystCurrencyTypeRepository.findAll(); 

	}
	
	@Override
	public Optional<PystCurrencyType> findById(BigDecimal Id) {

		return  pystCurrencyTypeRepository.findById(Id);

	}

	@Override
	public PystCurrencyType save(PystCurrencyType pystCurrencyType) {

		return pystCurrencyTypeRepository.save(pystCurrencyType);

	}

	@Override
	public Iterable saveAll(List<PystCurrencyType> pystCurrencyType) {

	return	pystCurrencyTypeRepository.saveAll(pystCurrencyType);

	}

}