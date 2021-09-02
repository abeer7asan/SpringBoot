package org.payroll.loan.service;
import java.util.List;
import java.util.Optional;
import java.math.BigDecimal;
import org.payroll.loan.entities.PystCurrencyType;


public interface PystCurrencyTypeService {



public PystCurrencyType  save(PystCurrencyType pystCurrencyType);

	public  Iterable saveAll( List<PystCurrencyType> pystCurrencyType);
	public Iterable findAll();
	public Optional<PystCurrencyType>  findById(BigDecimal Id);
	public void  delete(PystCurrencyType pystCurrencyType);
	public void  deleteAll();}
