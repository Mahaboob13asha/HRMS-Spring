package com.hrms.respository;

import org.springframework.data.repository.CrudRepository;

import com.hrms.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
