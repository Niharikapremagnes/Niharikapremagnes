package com.datajpa.EmployeeServer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.datajpa.EmployeeDataService.*;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRespository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees=new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public Optional<Employee> getEmployee(String id) {
		return employeeRepository.findById(id);
	}
	
	public void updateEmployee(String id, Employee employee) {
		employeeRepository.save(employee);
	}
	
public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
	
	
}
