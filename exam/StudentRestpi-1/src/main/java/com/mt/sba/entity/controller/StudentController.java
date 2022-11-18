package com.mt.sba.entity.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mt.sba.entity.Student;
import com.mt.sba.repository.StudentRepo;


@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo studentrepo;

	@GetMapping("/getdata")
    public List<Student> getStudents(){
    	return studentrepo.findAll();
    }
	
	@GetMapping("/data")
    public List<Student> getStudentlist(){
		List<Student> list= studentrepo.findAll();
		Collections.sort(list);
    	return list;
    }
 
    @PostMapping("/insert")
    public Student createStudent(@RequestBody Student student) {
    	return studentrepo.save(student);
    	}
    
	@GetMapping("/getdata/{id}")
	public Optional<Student> getStudent(@PathVariable long id){
		return studentrepo.findById(id);
	}
	
	@PutMapping("/update/{id}/{marks}")
	public Student putStudent(@PathVariable long id,@PathVariable int marks){
		Student student = studentrepo.findById(id).get();
		student.setId(id);
		student.setName(student.getName());
		student.setMarks(marks);
		studentrepo.save(student);
		return student;

	}

}
