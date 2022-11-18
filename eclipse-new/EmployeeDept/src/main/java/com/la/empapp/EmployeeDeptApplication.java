package com.la.empapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.la.empapp")
public class EmployeeDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDeptApplication.class, args);
	}

}
