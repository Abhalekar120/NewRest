package com.master.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.master.api.service.EmployeeService;

import Payloads.ApiResponse;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	public ApiResponse deleteEmployee(@PathVariable Long id) {
		this.service.deleteEmployee(id);
		return new ApiResponse("Employee is successfully deleted !!", true);
	}
	
}
