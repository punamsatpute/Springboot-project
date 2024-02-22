package com.anudip.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.training.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
