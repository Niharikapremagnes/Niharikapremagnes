package com.la.empapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.la.empapp.repository.EmployeeRepository;
import com.la.ems.entity.Student;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employee_repository;
	
	
	@Override
	public Optional<Student> getEmployeebyId(int id){
		return employee_repository.findById(id);
	}
	
	@Override
	public String putEmployeeById(Student employee) {
		employee_repository.save(employee);
		return "Successfully Updated";
	}
	
	@Override
	public String delEmployeebyId(int id) {
		employee_repository.deleteById(id);
		return "Deleted Data Successfully";
	}

	@Override
	public List<Student> getEmployees() {
		return employee_repository.findAll();
	}

	@Override
	public String createEmployee(Student employee) {
		employee_repository.save(employee);
		return "Employee Details Added";
	}

	
	
}
