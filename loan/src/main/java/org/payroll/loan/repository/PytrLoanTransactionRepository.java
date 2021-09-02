package org.payroll.loan.repository;
import org.payroll.loan.entities.PytrLoanTransaction;
import java.math.BigDecimal;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PytrLoanTransactionRepository extends CrudRepository<PytrLoanTransaction, BigDecimal>  {
}
