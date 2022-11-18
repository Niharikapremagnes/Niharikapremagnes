package com.la.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.la.app")
public class LeagueAdministratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeagueAdministratorApplication.class, args);
	}

}
