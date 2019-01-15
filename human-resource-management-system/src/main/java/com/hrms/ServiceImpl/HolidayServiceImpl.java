package com.hrms.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.model.Holiday;
import com.hrms.respository.HolidayRepository;
import com.hrms.service.HolidayService;


@Service
public class HolidayServiceImpl implements HolidayService{

	@Autowired
	HolidayRepository holidayRepository;
	
	public List<Holiday> findAll() {
		
		return (List<Holiday>) holidayRepository.findAll();
	}

	@Override
	public void save(Holiday holiday) {
		
		holidayRepository.save(holiday);
		
	}

	public Holiday findById(long id) {
		return holidayRepository.findOne(id);
	}

	public void deleteById(long id){
		
		 holidayRepository.delete(id);
	}
}
