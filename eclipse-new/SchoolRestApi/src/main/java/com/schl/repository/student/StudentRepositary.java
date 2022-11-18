package com.schl.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.schl.entity.student.Student;

@Repository
public interface StudentRepositary
		extends JpaRepository<Student, Integer> {

}
