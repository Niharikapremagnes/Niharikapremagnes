package com.la.dms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.la.dms.entity.Department;
import com.la.dms.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository dept_repository;

	public List<Department> getDepartments(){
		return dept_repository.findAll();
	}

	public String createDepartment(Department dept) {
		dept_repository.save(dept);
		return "Dept Details Added";
	}

	public Department getDepartmentsbyId(int id){
		return dept_repository.getById(id);
		
	}

	public String putDepartmentbyId(Department dept){
		dept_repository.save(dept);
		return "Successfully Updated";
	}

	public String delDepartmentsbyId(int id){
		dept_repository.deleteById(id);
		return "Deleted Data Successfully";
	}

}
