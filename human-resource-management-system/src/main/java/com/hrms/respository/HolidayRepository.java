package com.hrms.respository;


import org.springframework.data.repository.CrudRepository;

import com.hrms.model.Holiday;

public interface HolidayRepository extends CrudRepository<Holiday, Long>{

	
}
