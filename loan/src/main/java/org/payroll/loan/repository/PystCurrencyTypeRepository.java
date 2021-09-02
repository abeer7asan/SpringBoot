package org.payroll.loan.repository;
import org.payroll.loan.entities.PystCurrencyType;
import java.math.BigDecimal;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PystCurrencyTypeRepository extends CrudRepository<PystCurrencyType, BigDecimal>  {
}
