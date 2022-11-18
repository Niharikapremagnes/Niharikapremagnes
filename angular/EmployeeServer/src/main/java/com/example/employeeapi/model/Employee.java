package com.example.employeeapi.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Employee {
	@Id
	private String username;
	private String password;
	
	public Employee() {
	
	}
	

}
