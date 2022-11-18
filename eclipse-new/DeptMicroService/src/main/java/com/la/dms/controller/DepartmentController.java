package com.la.dms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.la.dms.entity.Department;
import com.la.dms.service.DepartmentService;


@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
    private DepartmentService deptservice;

    @GetMapping("/getdata")
    public List<Department> getDepartment(){
    	return deptservice.getDepartments();        
    }

    @PostMapping("/insert")
    public String createDepartment(@RequestBody Department dept) {
    	return deptservice.createDepartment(dept);
    }
    
    @GetMapping("/getdata/{id}")
    public Department getDepartment(@PathVariable int id){
    	return deptservice.getDepartmentsbyId(id);        
    }
    @PostMapping("/update/{id}")
    public String putDepartment(@RequestBody Department dept) {
    	return deptservice.putDepartmentbyId(dept);
    }
    @DeleteMapping("/delete/{id}")
    public String delDepartment(@PathVariable int id) {
    	return deptservice.delDepartmentsbyId(id); 
    }
}
