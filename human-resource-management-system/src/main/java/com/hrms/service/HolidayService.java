package com.hrms.service;

import java.util.List;
import java.util.Optional;

import com.hrms.model.Holiday;

public interface HolidayService {
	
	public List<Holiday> findAll();
	
	public void save(Holiday holiday);
	
	public Optional<Holiday> findById(long id);
	
	public void deleteById(long id);
}
