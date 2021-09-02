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
import org.payroll.loan.entities.PystPaymentMethod;


import org.payroll.loan.service.PystPaymentMethodService;


import java.math.BigDecimal;
@RestController
@CrossOrigin
@RequestMapping("/pystPaymentMethod-rest")

public class PystPaymentMethodController {

	private static final Logger log = LoggerFactory.getLogger(PystPaymentMethodController.class);

	@Autowired
	PystPaymentMethodService pystPaymentMethodService;

	@PutMapping("/deleteAll")
	public void deleteAll() {
		log.info("********  call PystPaymentMethodController/deleteAll");
		 pystPaymentMethodService.deleteAll();
	}

	@PostMapping("/save")
	public ResponseEntity save(@RequestBody PystPaymentMethod pystPaymentMethod) {
		log.info("********  call PystPaymentMethodController/save");
		return ResponseEntity.ok(pystPaymentMethodService.save(pystPaymentMethod));

		
	}

	@PostMapping("/saveAll")
	public ResponseEntity saveAll( @RequestBody List<PystPaymentMethod> pystPaymentMethod) {
		log.info("********  call PystPaymentMethodController/saveAll");
		return ResponseEntity.ok(pystPaymentMethodService.saveAll(pystPaymentMethod));
	}

	@GetMapping("/getAll")
	public ResponseEntity findAll() {
		log.info("********  call PystPaymentMethodController/getAll");
		return ResponseEntity.ok(pystPaymentMethodService.findAll());
	}
	
	@GetMapping("/getId")
	public ResponseEntity findById(@RequestBody BigDecimal Id) {
		log.info("********  call PystPaymentMethodController/getId");
		return ResponseEntity.ok(pystPaymentMethodService.findById(Id));
	}

	@PutMapping("/delete")
	public void delete(@RequestBody PystPaymentMethod pystPaymentMethod) {
		log.info("********  call PystPaymentMethodController/delete");
		pystPaymentMethodService.delete(pystPaymentMethod);
	}
}
