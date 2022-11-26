package com.master.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.api.entity.Employee;
import com.master.api.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public void deleteEmployee(Long id) {
		Employee employee = this.repo.findById(id).orElseThrow();
		this.repo.delete(employee);
		
	}
}
