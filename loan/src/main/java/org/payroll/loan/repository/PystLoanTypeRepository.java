package org.payroll.loan.repository;
import org.payroll.loan.entities.PystLoanType;
import java.math.BigDecimal;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PystLoanTypeRepository extends CrudRepository<PystLoanType, BigDecimal>  {
}
