package com.mt.sba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mt.sba.entity.Student;
import com.mt.sba.repository.StudentRepository;



@RestController
@RequestMapping("/stud")
public class StudentController {

		@Autowired
		private StudentRepository studentrepo;
	
		@GetMapping("/getdata")
	    public List<Student> getStudents(){
	    	return studentrepo.getStudents();
	    }
	 
	    @PostMapping("/insert")
	    public String createStudent(@RequestBody Student student) {
	    	return studentrepo.createStudent(student);
	    	}
	    
		@GetMapping("/getdata/{id}")
		public Optional<Student> getStudent(@PathVariable int id){
			return studentrepo.getStudentbyId(id);
		}
		
		@PutMapping("/update/{id}")
		public String putStudent(@RequestBody Student employee){
			return studentrepo.putStudentById(employee);
		}

		
}
