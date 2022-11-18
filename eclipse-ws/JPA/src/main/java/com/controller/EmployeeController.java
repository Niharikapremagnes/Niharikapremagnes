package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(method=RequestMethod.GET,value="/employees")
	public List<Employee> findAllEmployees(){
		return service.getEmployees();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/employee/{id}")
	public Employee findEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addEmployee")
	public void addEmployee(@RequestBody Employee employee) {
		 service.saveEmployee(employee);
	}
	
	/*@RequestMapping(method=RequestMethod.POST,value="/addEmployees")
	public List<Employee> addEmployee(@RequestBody List<Employee> employees) {
		return service.saveEmployees(employees);
	}*/

	
	/*@GetMapping("/employee/{name}")
	public Employee findEmployeeByName(@PathVariable String name) {
		return service.getEmployeeByName(name);
	}*/
	
	@RequestMapping(method=RequestMethod.DELETE,value="/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}

}
