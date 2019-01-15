package com.hrms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long DepartmentId;
	private String DepartmentName;

	public long getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(long departmentId) {
		DepartmentId = departmentId;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public Department() {
		super();
	}

	@Override
	public String toString() {
		return "Department [DepartmentId=" + DepartmentId + ", DepartmentName=" + DepartmentName + "]";
	}

	public Department(long departmentId, String departmentName) {
		super();
		DepartmentId = departmentId;
		DepartmentName = departmentName;
	}

}
