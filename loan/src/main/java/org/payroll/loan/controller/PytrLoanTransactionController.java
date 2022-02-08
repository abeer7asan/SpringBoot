package org.payroll.loan.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;import java.util.List;
import org.payroll.loan.entities.PytrLoanTransaction;


import org.payroll.loan.service.PytrLoanTransactionService;


import java.math.BigDecimal;


@RestController
@CrossOrigin
@RequestMapping("/pytrLoanTransaction-rest")

public class PytrLoanTransactionController {

	private static final Logger log = LoggerFactory.getLogger(PytrLoanTransactionController.class);

	@Autowired
	PytrLoanTransactionService pytrLoanTransactionService;

	@PutMapping("/deleteAll")
	public void deleteAll() {
		log.info("********  call PytrLoanTransactionController/deleteAll");
		 pytrLoanTransactionService.deleteAll();
	}

	@PostMapping("/save")
	public ResponseEntity save(@RequestBody PytrLoanTransaction pytrLoanTransaction) {
		log.info("********  call PytrLoanTransactionController/save");
		return ResponseEntity.ok(pytrLoanTransactionService.save(pytrLoanTransaction));

		
	}

	@PostMapping("/saveAll")
	public ResponseEntity saveAll( @RequestBody List<PytrLoanTransaction> pytrLoanTransaction) {
		log.info("********  call PytrLoanTransactionController/saveAll");
		return ResponseEntity.ok(pytrLoanTransactionService.saveAll(pytrLoanTransaction));
	}

	@GetMapping("/getAll")
	public ResponseEntity findAll() {
		log.info("********  call PytrLoanTransactionController/getAll");
		return ResponseEntity.ok(pytrLoanTransactionService.findAll());
	}
	
	@GetMapping("/getId")
	public ResponseEntity findById(@RequestBody BigDecimal Id) {
		log.info("********  call PytrLoanTransactionController/getId");
		return ResponseEntity.ok(pytrLoanTransactionService.findById(Id));
	}

	@PutMapping("/delete")
	public void delete(@RequestBody PytrLoanTransaction pytrLoanTransaction) {
		log.info("********  call PytrLoanTransactionController/delete");
		pytrLoanTransactionService.delete(pytrLoanTransaction);
	}
}
