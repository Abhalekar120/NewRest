package com.master.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.api.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
