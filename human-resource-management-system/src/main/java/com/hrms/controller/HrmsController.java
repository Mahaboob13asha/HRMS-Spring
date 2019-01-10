package com.hrms.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hrms.ServiceImpl.HrmsImpl;
import com.hrms.model.Employee;





@Controller
@RequestMapping("/employee")
public class HrmsController {

	@Autowired
	private HrmsImpl hrmsService;
	
	@GetMapping("/")
	public String ShowIndexPage()
	{
		return "index";
	}
	
	@RequestMapping("/profilePage")
	public String ShowprofilePage()
	{
		return "profile";
	}
	
	@GetMapping("/employeePage")
	public String ShowEmployeesPage(){

	System.out.println("######");
		return "employees";
	}
	
	@RequestMapping("/addEmploye")
	public String addEmployee(Employee employee, Model model)
	{
		hrmsService.addEmployee(employee);
		return "redirect:/employee/showAllEmployee";
		
	}
	
	@RequestMapping("/showAllEmployee")
	public String ListAllEmployee(Model model)
	{
		List<Employee> employee=hrmsService.listAllEmployee();
		model.addAttribute("employees", employee);
		return "employees-list";
	}
	
	@RequestMapping(value = "/deleteEmp", method = RequestMethod.GET)
	public String deleteEmployee(@ModelAttribute("employee") Employee employee, @RequestParam("id") Long id) {
		
		System.out.println("....");
			hrmsService.delete(id);
		return "redirect:showAllEmployee";
	}
	
/*	@RequestMapping("/updateEmployee")
	public String UpdateEmployeeinfo(@RequestParam("id") long id, Model model) {
		Optional<Employee> employee = Human Resource Management System (HRMS)Service.findOne(id);
		model.addAttribute("employee", employee);
		return "EditEmploye";

	}*/
	
	
	@RequestMapping("/EditEmployee")
	public String UpdateEmployeeinfo(Long id,Model model) {
		
		Optional<Employee> employee1 = hrmsService.findOne(id);
		model.addAttribute("employee", employee1);
		return "EditEmployee";

	}
	
	@RequestMapping(value= "/updateEmployeeDetails",method=RequestMethod.POST)
	public String UpdateEmployeeDetails(@ModelAttribute("employee") Employee employee, HttpServletRequest request){
				
		hrmsService.addEmployee(employee);
		return "EditEmployee";
	}
	
	
}
