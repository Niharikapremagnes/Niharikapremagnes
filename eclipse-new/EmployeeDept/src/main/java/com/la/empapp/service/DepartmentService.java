package com.la.empapp.service;

import java.util.List;

import com.la.empapp.entity.Department;

public interface DepartmentService {
	List<Department> getDepartments();
	String createDepartment(Department dept);
	Department getDepartmentsbyId(int id);
	String putDepartmentbyId(Department dept);
	 String delDepartmentsbyId(int id) ;	
	}
