package com.la.empapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.la.empapp.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>  {

}
