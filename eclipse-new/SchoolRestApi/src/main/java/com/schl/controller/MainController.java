package com.schl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schl.entity.school.School;
import com.schl.entity.student.Student;
import com.schl.repository.school.SchoolRepositary;
import com.schl.repository.student.StudentRepositary;


@RestController
public class MainController {

	@Autowired
	private SchoolRepositary schoolRepository;

	@Autowired
	private StudentRepositary studentRepository;

	@GetMapping(value = "school")
	public ResponseEntity<List<School>> getSchool() {
		return ResponseEntity.status(HttpStatus.ACCEPTED)
				.body(schoolRepository.findAll());
	}

	@GetMapping(value = "student")
	public ResponseEntity<List<Student>> getStudent() {
		return ResponseEntity.status(HttpStatus.ACCEPTED)
				.body(studentRepository.findAll());
	}
	
	
}