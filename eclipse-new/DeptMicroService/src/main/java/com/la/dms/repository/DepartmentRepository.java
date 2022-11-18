package com.la.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.la.dms.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>  {

}
