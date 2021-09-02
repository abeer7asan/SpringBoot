package org.payroll.loan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;
import java.util.Optional;
import org.payroll.loan.entities.PystPaymentMethod;
import org.payroll.loan.repository.PystPaymentMethodRepository;

import java.math.BigDecimal;
@Service
public class PystPaymentMethodServiceImp implements PystPaymentMethodService {

	private static final Logger logger = LoggerFactory.getLogger(PystPaymentMethodServiceImp.class);

	@Autowired
	private PystPaymentMethodRepository pystPaymentMethodRepository;

	@Override
	public void delete(PystPaymentMethod pystPaymentMethod) {
		pystPaymentMethodRepository.delete(pystPaymentMethod);
	}

	@Override
	public void deleteAll() {
		pystPaymentMethodRepository.deleteAll(); // void
	}

	@Override
   @SuppressWarnings("unchecked")
	public Iterable findAll() {
		return (List<PystPaymentMethod>) pystPaymentMethodRepository.findAll(); 

	}
	
	@Override
	public Optional<PystPaymentMethod> findById(BigDecimal Id) {

		return  pystPaymentMethodRepository.findById(Id);

	}

	@Override
	public PystPaymentMethod save(PystPaymentMethod pystPaymentMethod) {

		return pystPaymentMethodRepository.save(pystPaymentMethod);

	}

	@Override
	public Iterable saveAll(List<PystPaymentMethod> pystPaymentMethod) {

	return	pystPaymentMethodRepository.saveAll(pystPaymentMethod);

	}

}