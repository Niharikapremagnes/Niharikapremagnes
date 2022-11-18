package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan({"com.controller","com.entity","com.service"})
public class SpringBootJpa {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpa.class, args);
	}

}