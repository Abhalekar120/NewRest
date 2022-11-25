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
	public void changesEmpDetails(Employee emp, Long id) {
		Employee emp1 = this.repo.findById(id).orElseThrow();
		emp1.setId(emp.getId());
		emp1.setFirstName(emp.getAddress());
		emp1.setLastName(emp.getLastName());
		emp1.setGender(emp.getGender());
		emp1.setAddress(emp.getAddress());
		emp1.setMobileNo(emp.getMobileNo());
		emp1.setEmailId(emp.getEmailId());
		emp1.setCreatedDate(emp.getCreatedDate());
		emp1.setCreatedtime(emp.getCreatedtime());
		emp1.setUpdatedDateAndTime(emp.getUpdatedDateAndTime());
		emp1.setPanCard(emp.getPanCard());
		emp1.setAdharNumber(emp.getAdharNumber());
		
		this.repo.save(emp1);
	}
}
