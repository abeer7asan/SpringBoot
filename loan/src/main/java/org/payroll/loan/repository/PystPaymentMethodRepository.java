package org.payroll.loan.repository;
import org.payroll.loan.entities.PystPaymentMethod;
import java.math.BigDecimal;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PystPaymentMethodRepository extends CrudRepository<PystPaymentMethod, BigDecimal>  {
}
