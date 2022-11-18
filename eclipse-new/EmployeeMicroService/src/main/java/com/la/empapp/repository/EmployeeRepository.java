package com.la.empapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.la.ems.entity.Student;

@Repository
public interface EmployeeRepository extends JpaRepository<Student, Integer>  {

}
