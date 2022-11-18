package com.example.EmployeeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.EmployeeController","com.example.EmployeeServer"})
public class EmployeeDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDbApplication.class, args);
	}

}
