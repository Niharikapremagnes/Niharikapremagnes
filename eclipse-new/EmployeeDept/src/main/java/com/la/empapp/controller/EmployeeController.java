package com.la.empapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.la.empapp.entity.Employee;
import com.la.empapp.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	 @Autowired
	    private EmployeeService empservice;

	    @GetMapping("/getdata")
	    public List<Employee> getEmployees(){
	    	return empservice.getEmployees();
	    }
	    @PostMapping("/insert")
	    public String createEmployee(@RequestBody Employee employee) {
	    	return empservice.createEmployee(employee);
	    	}
	    
	    @PostMapping("/insert/{id}")
	    public String createEmployee(@PathVariable int id, @RequestBody Employee employee) {
	    	return empservice.createEmployeeWithdeptId(id,employee);
	    }
		
		@GetMapping("/getdata/{id}")
		public Optional<Employee> getEmployee(@PathVariable int id){
			return empservice.getEmployeebyId(id);
		}
		
		@PutMapping("/update/{id}")
		public String putEmployee(@RequestBody Employee employee){
			return empservice.putEmployeeById(employee);
		}

		@DeleteMapping("/delete/{id}")
		public String delEmployee(@PathVariable int id){
			return empservice.delEmployeebyId(id);
		}
}