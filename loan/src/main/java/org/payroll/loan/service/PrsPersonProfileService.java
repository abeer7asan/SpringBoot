package org.payroll.loan.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.payroll.loan.entities.PrsPersonProfile;


public interface PrsPersonProfileService {

	public PrsPersonProfile  save(PrsPersonProfile pystCurrencyType);

	public Iterable saveAll( List<PrsPersonProfile> pystCurrencyType);
	public Iterable findAll();
	public Optional<PrsPersonProfile>  findById(BigDecimal Id);
	public void  delete(PrsPersonProfile pystCurrencyType);
	public void  deleteAll();
	
}