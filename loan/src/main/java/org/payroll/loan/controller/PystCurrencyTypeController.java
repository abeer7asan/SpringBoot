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
import org.payroll.loan.entities.PystCurrencyType;
import java.util.ArrayList;

import org.payroll.loan.service.PystCurrencyTypeService;


import java.math.BigDecimal;
@RestController
@CrossOrigin
@RequestMapping("/pystCurrencyType-rest")

public class PystCurrencyTypeController {

	private static final Logger log = LoggerFactory.getLogger(PystCurrencyTypeController.class);

	@Autowired
	PystCurrencyTypeService pystCurrencyTypeService;

	@PutMapping("/deleteAll")
	public void deleteAll() {
		log.info("********  call PystCurrencyTypeController/deleteAll");
		 pystCurrencyTypeService.deleteAll();
	}

	@PostMapping("/save")
	public ResponseEntity save(@RequestBody PystCurrencyType pystCurrencyType) {
		log.info("********  call PystCurrencyTypeController/save");
		return ResponseEntity.ok(pystCurrencyTypeService.save(pystCurrencyType));

		
	}

	@PostMapping("/saveAll")
	public ResponseEntity saveAll( @RequestBody List<PystCurrencyType> pystCurrencyType) {
		log.info("********  call PystCurrencyTypeController/saveAll");
		return ResponseEntity.ok(pystCurrencyTypeService.saveAll(pystCurrencyType));
	}

	@GetMapping("/getAll")
	public ResponseEntity findAll() {
		log.info("********  call PystCurrencyTypeController/getAll");
		return ResponseEntity.ok(pystCurrencyTypeService.findAll());
	}
	
	@GetMapping("/getId")
	public ResponseEntity findById(@RequestBody BigDecimal Id) {
		log.info("********  call PystCurrencyTypeController/getId");
		return ResponseEntity.ok(pystCurrencyTypeService.findById(Id));
	}

	@PutMapping("/delete")
	public void delete(@RequestBody PystCurrencyType pystCurrencyType) {
		log.info("********  call PystCurrencyTypeController/delete");
		pystCurrencyTypeService.delete(pystCurrencyType);
	}
}
