package com.master.api.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.master.api.entity.Employee;

public interface EmployeeService {

	void changesEmpDetails(Employee emp, Long id);

	void getEmployees();

	void getEmployeeById(Long id);

	void getEmployeeByAdhar(BigDecimal adhar);

	void getEmployeeByDate(LocalDate date);

}
