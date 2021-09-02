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
import org.payroll.loan.entities.PystLoanType;


import org.payroll.loan.service.PystLoanTypeService;


import java.math.BigDecimal;
@RestController
@CrossOrigin
@RequestMapping("/pystLoanType-rest")

public class PystLoanTypeController {

	private static final Logger log = LoggerFactory.getLogger(PystLoanTypeController.class);

	@Autowired
	PystLoanTypeService pystLoanTypeService;

	@PutMapping("/deleteAll")
	public void deleteAll() {
		log.info("********  call PystLoanTypeController/deleteAll");
		 pystLoanTypeService.deleteAll();
	}

	@PostMapping("/save")
	public ResponseEntity save(@RequestBody PystLoanType pystLoanType) {
		log.info("********  call PystLoanTypeController/save");
		return ResponseEntity.ok(pystLoanTypeService.save(pystLoanType));

		
	}

	@PostMapping("/saveAll")
	public ResponseEntity saveAll( @RequestBody List<PystLoanType> pystLoanType) {
		log.info("********  call PystLoanTypeController/saveAll");
		return ResponseEntity.ok(pystLoanTypeService.saveAll(pystLoanType));
	}

	@GetMapping("/getAll")
	public ResponseEntity findAll() {
		log.info("********  call PystLoanTypeController/getAll");
		return ResponseEntity.ok(pystLoanTypeService.findAll());
	}
	
	@GetMapping("/getId")
	public ResponseEntity findById(@RequestBody BigDecimal Id) {
		log.info("********  call PystLoanTypeController/getId");
		return ResponseEntity.ok(pystLoanTypeService.findById(Id));
	}

	@PutMapping("/delete")
	public void delete(@RequestBody PystLoanType pystLoanType) {
		log.info("********  call PystLoanTypeController/delete");
		pystLoanTypeService.delete(pystLoanType);
	}
}
