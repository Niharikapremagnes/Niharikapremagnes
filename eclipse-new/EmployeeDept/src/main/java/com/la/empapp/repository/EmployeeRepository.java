package com.la.empapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.la.empapp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

}
