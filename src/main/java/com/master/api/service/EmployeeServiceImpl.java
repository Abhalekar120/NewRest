package com.master.api.service;

import java.util.List;
import java.util.Optional;

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
		emp1.setFirstName(emp.getFirstName());
		emp1.setLastName(emp.getLastName());
		emp1.setGender(emp.getGender());
		emp1.setAddress(emp.getAddress());
		emp1.setMobileNo(emp.getMobileNo());
		emp1.setEmailId(emp.getEmailId());
		// emp1.setCreatedDate(emp.getCreatedDate());
		// emp1.setCreatedtime(emp.getCreatedtime());
		// emp1.setUpdatedDateAndTime(emp.getUpdatedDateAndTime());
		emp1.setPanCard(emp.getPanCard());
		emp1.setAdharNumber(emp.getAdharNumber());
		this.repo.save(emp1);
	}

	@Override
	public List<Employee> getEmployees() {
		return this.repo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return this.repo.findById(id).orElseThrow();

	}

//	@Override
//	public void getEmployeeByAdhar(BigDecimal adhar) {
//		this.repo.findOne(adhar).orElseThrow();
//
//	}
//
//	@Override
//	public void getEmployeeByDate(LocalDate date) {
//		this.repo.findAll(date);
//
//	}

	@Override
	public void savePost(Employee emp) {
		this.repo.save(emp);

	}

	@Override
	public void deleteEmployee(Long id) {
		this.repo.deleteById(id);

	}

	@Override
	public void patchDeatils(Employee emp, Long id) {
		Employee patch = this.repo.findById(id).orElse(null);
		patch.getId();
		patch.getFirstName();
		patch.getLastName();
		patch.getGender();
		this.repo.save(patch);
	}
}
