package com.master.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.master.api.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	@DeleteMapping
	public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
		this.service.deleteEmployee(id);
		return new ResponseEntity<>(Map.of("Message", "user Deleted Sucessfully"),HttpStatus.OK) ;
	}
	
}
