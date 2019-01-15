package com.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hrms.ServiceImpl.DepartmentImpl;
import com.hrms.model.Department;

@Controller
@RequestMapping("Departments")
public class DepartmentsController {
	
	@Autowired
	DepartmentImpl departmentImpl;
	
	@RequestMapping("/ListOfDepartments")
	public String ListOfDepartments(Model model){
		List<Department> departments = departmentImpl.findAll();
		model.addAttribute("departments", departments);
		return "departments";
	}
	
	@RequestMapping("/addDepartment")
	public String addDepartment(Department department){
		departmentImpl.save(department);
		
		return "redirect:/Departments/ListOfDepartments";
	}
	
	
	@RequestMapping("/Edit-Department")
	public String EditDepartment(@RequestParam("id") long id, Model model){
		Department department = departmentImpl.findById(id);
		model.addAttribute("department", department);
		return "Edit-Department";
	}
	
	@RequestMapping("/updateDepartment")
	public String updateDepartment(@ModelAttribute("department") Department department){
		
		departmentImpl.update(department);
		
		return "redirect:/Departments/ListOfDepartments";
	} 
	
	@RequestMapping("/deleteDepartment")
	public String deletDepartment(@RequestParam("id") long id){
		
		departmentImpl.delete(id);
		return "redirect:/Departments/ListOfDepartments";
	}
	
	@RequestMapping("/deleteDepartmentAlert")
	public String deleteDepartmentAlert(@RequestParam("id")long id, Model model){
		Department department = departmentImpl.findById(id);
		model.addAttribute("department", department);
		return "delete-Department";
	}
}
