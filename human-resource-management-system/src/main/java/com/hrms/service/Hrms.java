package com.hrms.service;

import java.util.List;
import java.util.Optional;

import com.hrms.model.Employee;

public interface Hrms {
	
	public Employee addEmployee(Employee employee);
	public List<Employee> listAllEmployee();
	public void delete(Long id) ;
	Optional<Employee> findOne(Long id);
}