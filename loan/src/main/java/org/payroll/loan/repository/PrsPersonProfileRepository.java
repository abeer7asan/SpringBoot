package org.payroll.loan.repository;

import java.math.BigDecimal;

import org.payroll.loan.entities.PrsPersonProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrsPersonProfileRepository extends CrudRepository<PrsPersonProfile, BigDecimal>  {
}


