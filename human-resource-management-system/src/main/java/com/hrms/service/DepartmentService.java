package com.hrms.service;

import java.util.List;

import com.hrms.model.Department;

public interface DepartmentService {
	
	void save(Department department);
	
	List<Department> findAll();
	
	Department findOne(long id);
	
	void update(Department department);
	
	void delete( long id);
}
