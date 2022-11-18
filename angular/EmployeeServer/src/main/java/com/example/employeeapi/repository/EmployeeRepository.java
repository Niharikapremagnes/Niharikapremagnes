package com.example.employeeapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.employeeapi.model.Employee;

@RepositoryRestResource(collectionResourceRel="employeedata",path="employeedata")
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
