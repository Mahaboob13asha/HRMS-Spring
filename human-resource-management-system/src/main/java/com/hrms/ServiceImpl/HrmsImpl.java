package com.hrms.ServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.model.Employee;
import com.hrms.respository.HrmsRepository;
import com.hrms.service.Hrms;



@Service
public class HrmsImpl implements Hrms {

	@Autowired
	private HrmsRepository hrmsRepository;
	
	public Employee addEmployee(Employee employee) {
		
		return hrmsRepository.save(employee);
	}

	public List<Employee> listAllEmployee() {
		return (List<Employee>) hrmsRepository.findAll();
	}

	public void delete(Long id) {
		hrmsRepository.delete(id);
		
	}
	
	public Employee findOne(Long id)
	{
		return hrmsRepository.findOne(id);
	}

}
