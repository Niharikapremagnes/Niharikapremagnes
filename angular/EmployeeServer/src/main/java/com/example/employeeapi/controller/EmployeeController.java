package com.example.employeeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeapi.model.Employee;
import com.example.employeeapi.repository.EmployeeRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllProducts(){
		return employeeRepository.findAll();
	}

}
