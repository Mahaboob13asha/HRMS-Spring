package com.hrms.respository;

import org.springframework.data.repository.CrudRepository;

import com.hrms.model.Employee;

public interface HrmsRepository extends CrudRepository<Employee, Long> {

}
