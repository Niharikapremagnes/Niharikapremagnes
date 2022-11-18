package com.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.ems.entity.Employee;
import com.ems.repository.EmployeeRepository;
import com.ems.vo.Department;
import com.ems.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {
	@Autowired
    private EmployeeRepository empRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Employee saveEmp(Employee emp) {
        log.info("Inside saveEmp of EmployeeService");
        return empRepository.save(emp);
    }

    public ResponseTemplateVO getEmpWithDepartment(Long empId) {
        log.info("Inside getEmpWithDepartment of EmployeeService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Employee emp = empRepository.findByEmpId(empId);

        Department department =  
               // restTemplate.getForObject("http://localhost:8001/departments/" + emp.getDepartmentId(),Department.class);
        restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + emp.getDepartmentId(),Department.class);

        vo.setEmp(emp);
        vo.setDepartment(department);

        return  vo;
    }

}
