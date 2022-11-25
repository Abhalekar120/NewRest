package com.master.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
	
	@PutMapping
	public ResponseEntity<?> updateEmp(@RequestBody Employee emp,@PathVariable Long id){
		this.service.changesEmpDetails(emp,id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
