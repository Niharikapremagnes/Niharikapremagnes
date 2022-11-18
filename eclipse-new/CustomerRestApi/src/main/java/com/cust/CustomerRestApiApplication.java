package com.cust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cust.Controller","com.cust.Entity","com.cust.Service"})
public class CustomerRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRestApiApplication.class, args);
	}

}
