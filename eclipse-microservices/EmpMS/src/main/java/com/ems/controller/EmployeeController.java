package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ems.entity.Employee;
import com.ems.service.EmployeeService;
import com.ems.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/emps")
@Slf4j
public class EmployeeController {
	

    @Autowired
    private EmployeeService empService;

    @PostMapping("/")
    public Employee saveEmp(@RequestBody Employee emp) {
        log.info("Inside saveEmp of EmployeeController");
        return empService.saveEmp(emp);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getEmpWithDepartment(@PathVariable("id") Long empId) {
        log.info("Inside getEmpWithDepartment of EmployeeController");
        return empService.getEmpWithDepartment(empId);
    }

}
