package com.example.employeeapi.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.employeeapi.repository.EmployeeRepository;

@Component
public class InitializationComponent {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostConstruct
	private void init() {
		employeeRepository.deleteAll();
		
		Employee employee=new Employee();
		employee.setUsername("niharika");
		employee.setPassword("premagnes");
		employeeRepository.save(employee);
		
		employee=new Employee();
		employee.setUsername("bhavya");
		employee.setPassword("premagnes");
		employeeRepository.save(employee);
	}
	

}
