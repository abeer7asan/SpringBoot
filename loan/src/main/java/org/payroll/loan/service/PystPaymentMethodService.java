package org.payroll.loan.service;
import java.util.List;
import java.util.Optional;
import java.math.BigDecimal;
import org.payroll.loan.entities.PystPaymentMethod;


public interface PystPaymentMethodService {



public PystPaymentMethod  save(PystPaymentMethod pystPaymentMethod);

	public  Iterable saveAll( List<PystPaymentMethod> pystPaymentMethod);
	public Iterable findAll();
	public Optional<PystPaymentMethod>  findById(BigDecimal Id);
	public void  delete(PystPaymentMethod pystPaymentMethod);
	public void  deleteAll();}
