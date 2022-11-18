package com.Service.EmployeeServer;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private List<Employee> employees = new ArrayList<>(Arrays.asList(
			new Employee("160405","Niharika",26000),
			new Employee("160214","Bhavani",27000),
			new Employee("160514","Lavanya",38000),
			new Employee("160215","Rajesh",44000),
			new Employee("160743","Vinod",22000)
			));
	
	public List<Employee> getAllEmployees(){
		return employees;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public Employee getEmployee(String id) {
		Employee employee= employees.stream().filter(t -> id.equals(t.getEmpid())).findFirst().orElse(null);
		return employee;
	}
	
	public void updateEmployee(String id, Employee employee) {
		for(int i=0; i<employees.size();i++) {
			Employee e= employees.get(i);
			if(e.getEmpid().equals(id)) {
				employees.set(i,employee);
				return;
			}
		}
	}
	
public void deleteEmployee(String id) {
		employees.removeIf(e ->e.getEmpid().equals(id));
	}
	
	
}
