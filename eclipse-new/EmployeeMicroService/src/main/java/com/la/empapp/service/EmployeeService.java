package com.la.empapp.service;

import java.util.List;
import java.util.Optional;

import com.la.ems.entity.Student;

public interface EmployeeService {
List<Student> getEmployees();
Optional<Student> getEmployeebyId(int id);
String putEmployeeById(Student employee);
String delEmployeebyId(int id);
String createEmployee(Student employee);	
}
