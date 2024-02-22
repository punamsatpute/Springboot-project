package com.anudip.training.Service;

import java.util.List;


import com.anudip.training.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	
	Employee getEmployeeById(Long id);
	
	Employee addEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
	
	Employee updateEmployee(Long id,Employee employee);

	
}
