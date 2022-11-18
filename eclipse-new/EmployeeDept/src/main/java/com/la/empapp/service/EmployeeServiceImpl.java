package com.la.empapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.la.empapp.entity.Department;
import com.la.empapp.entity.Employee;
import com.la.empapp.repository.DepartmentRepository;
import com.la.empapp.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employee_repository;
	
	@Autowired
	private DepartmentRepository dept_repository;
	
	@Override
	public Optional<Employee> getEmployeebyId(int id){
		return employee_repository.findById(id);
	}
	
	@Override
	public String putEmployeeById(Employee employee) {
		employee_repository.save(employee);
		return "Successfully Updated";
	}
	
	@Override
	public String delEmployeebyId(int id) {
		employee_repository.deleteById(id);
		return "Deleted Data Successfully";
	}

	@Override
	public List<Employee> getEmployees() {
		return employee_repository.findAll();
	}

	@Override
	public String createEmployee(Employee employee) {
		employee_repository.save(employee);
		return "Employee Details Added";
	}

	@Override
	public String createEmployeeWithdeptId(int id, Employee employee) {
		Department dept= dept_repository.getById(id);
		employee.setDept(dept);
		employee_repository.save(employee);
		return "successfully added";
	}
	
}
