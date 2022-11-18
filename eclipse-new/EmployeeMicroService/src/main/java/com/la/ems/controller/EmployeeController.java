package com.la.ems.controller;

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

import com.la.empapp.service.EmployeeService;
import com.la.ems.entity.Student;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	    @Autowired
	    private EmployeeService empservice;

	    @GetMapping("/getdata")
	    public List<Student> getEmployees(){
	    	return empservice.getEmployees();
	    }
	    @PostMapping("/insert")
	    public String createEmployee(@RequestBody Student employee) {
	    	return empservice.createEmployee(employee);
	    	}
	    
		@GetMapping("/getdata/{id}")
		public Optional<Student> getEmployee(@PathVariable int id){
			return empservice.getEmployeebyId(id);
		}
		
		@PutMapping("/update/{id}")
		public String putEmployee(@RequestBody Student employee){
			return empservice.putEmployeeById(employee);
		}

		@DeleteMapping("/delete/{id}")
		public String delEmployee(@PathVariable int id){
			return empservice.delEmployeebyId(id);
		}
}