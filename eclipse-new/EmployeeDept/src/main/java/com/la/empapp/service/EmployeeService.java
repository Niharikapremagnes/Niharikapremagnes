package com.la.empapp.service;

import java.util.List;
import java.util.Optional;
import com.la.empapp.entity.Employee;

public interface EmployeeService {
List<Employee> getEmployees();
String createEmployeeWithdeptId(int id, Employee employee);
Optional<Employee> getEmployeebyId(int id);
String putEmployeeById(Employee employee);
String delEmployeebyId(int id);
String createEmployee(Employee employee);	
}
