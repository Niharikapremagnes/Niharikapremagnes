package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.EmployeeRepository;
import com.entity.Employee;

@Service
public class EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee){
		return repository.save(employee);
	}
	
	public List<Employee> saveEmployees(List<Employee> employees){
		return repository.saveAll(employees);
	}
	
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	/*public Employee getEmployeeByName(String name) {
		return repository.findByName(name);
	}*/
	
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Employee Removed !! " +id;
	}
	
}
