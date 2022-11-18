package com.mt.sba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mt.sba.entity.Student;
import com.mt.sba.repository.StudentRepository;


@Service
public class StudentService {

	 	@Autowired
	    private StudentRepository studentRepo;

	    public List<Student> getStudents() {
	        return studentRepo.findByOrderByNameAsc();
	    }

	   
		public Optional<Student> getStudentbyId(long id){
			return studentRepo.findById(id);
		}
		
		
		public String putStudentById(Student student) {
			studentRepo.save(student);
			return "Successfully Updated";
		}

		public String createStudent(Student student) {
			studentRepo.save(student);
			return "Employee Details Added";
		}

	   	}