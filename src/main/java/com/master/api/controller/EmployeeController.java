package com.master.api.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.master.api.entity.Employee;
import com.master.api.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PutMapping("/employee")
	public ResponseEntity<?> updateEmp(@RequestBody Employee emp,@PathVariable Long id){
		this.service.changesEmpDetails(emp,id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getEmployees(){
		this.service.getEmployees();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<List<Employee>> getEmployeeById(@PathVariable Long id){
		this.service.getEmployeeById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<List<Employee>> getEmployeeByAdhar(@PathVariable BigDecimal adhar){
		this.service.getEmployeeByAdhar(adhar);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
