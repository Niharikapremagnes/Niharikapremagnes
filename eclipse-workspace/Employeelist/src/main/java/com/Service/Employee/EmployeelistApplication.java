package com.Service.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.Service.EmployeeControllerService","com.Service.EmployeeServer"})

public class EmployeelistApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeelistApplication.class, args);
	}

}
