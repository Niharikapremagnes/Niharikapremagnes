package com.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryEdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryEdApplication.class, args);
	}

}
