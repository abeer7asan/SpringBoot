package org.payroll.loan.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.payroll.loan.entities.PrsPersonProfile;
import org.payroll.loan.repository.PrsPersonProfileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PrsPersonProfileServiceImp implements PrsPersonProfileService {

	private static final Logger logger = LoggerFactory.getLogger(PrsPersonProfileServiceImp.class);

	@Autowired
	private PrsPersonProfileRepository prsPersonProfileRepository;

	@Override
	public void delete(PrsPersonProfile prsPersonProfile) {
		prsPersonProfileRepository.delete(prsPersonProfile);
	}

	@Override
	public void deleteAll() {
		prsPersonProfileRepository.deleteAll(); // void
	}

	@Override
   @SuppressWarnings("unchecked")
	public Iterable findAll() {
		return (List<PrsPersonProfile>) prsPersonProfileRepository.findAll(); 

	}
	
	@Override
	public Optional<PrsPersonProfile> findById(BigDecimal Id) {

		return  prsPersonProfileRepository.findById(Id);

	}

	@Override
	public PrsPersonProfile save(PrsPersonProfile prsPersonProfile) {

		return prsPersonProfileRepository.save(prsPersonProfile);

	}

	@Override
	public Iterable saveAll(List<PrsPersonProfile> prsPersonProfile) {

	return	prsPersonProfileRepository.saveAll(prsPersonProfile);

	}
}