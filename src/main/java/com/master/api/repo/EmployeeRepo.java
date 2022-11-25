package com.master.api.repo;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.api.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	Optional<Employee> findOne(BigDecimal adhar);


}
