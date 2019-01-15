package com.hrms.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.model.Department;
import com.hrms.respository.DepartmentRepository;
import com.hrms.service.DepartmentService;

@Service
public class DepartmentImpl implements DepartmentService{

	@Autowired
	DepartmentRepository departmentRepository;
	
	public void save(Department department) {
		
		departmentRepository.save(department);
	}
	
	public List<Department> findAll(){
		
		return (List<Department>) departmentRepository.findAll();
	}

	public Department findById(long id){
		return departmentRepository.findOne(id);
	}

	public Department findOne(long id) {
		
		return departmentRepository.findOne(id);
	}
	
	public void update(Department department) {
		
		departmentRepository.save(department);
	}

	public void delete(long id) {
		
		departmentRepository.delete(id);
	}




}
