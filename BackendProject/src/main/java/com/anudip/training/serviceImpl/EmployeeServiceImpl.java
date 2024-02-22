package com.anudip.training.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.training.Service.EmployeeService;

import com.anudip.training.entity.Employee;

import com.anudip.training.exception.EmployeeIdNotFoundException;
import com.anudip.training.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElseThrow(() -> new EmployeeIdNotFoundException("id not correct"));
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		
	employeeRepository.findById(id).orElseThrow(() -> new EmployeeIdNotFoundException("id not correct"));
	employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		Employee updateEmployee =employeeRepository.findById(id).orElseThrow(() -> new EmployeeIdNotFoundException("id not correct"));
		updateEmployee.setEmailId(employee.getEmailId());
		updateEmployee.setFirstName(employee.getFirstName());
		updateEmployee.setLastName(employee.getLastName());
		
		employeeRepository.save(updateEmployee);
		
		return updateEmployee;
	}

   
	

	
}

