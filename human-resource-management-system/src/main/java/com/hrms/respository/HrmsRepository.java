package com.hrms.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface HrmsRepository extends CrudRepository<com.hrms.model.Employee, Long> {

}
