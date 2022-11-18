package com.example.EmployeeServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

	private List<Employee> employees = new ArrayList<>(Arrays.asList(
			new Employee(160405,"Niharika",26000),
			new Employee(160214,"Bhavani",27000),
			new Employee(160514,"Lavanya",38000),
			new Employee(160215,"Rajesh",44000),
			new Employee(160743,"Vinod",22000)
			));
	
	public List<Employee> getAllEmployees(){
		return employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
}
