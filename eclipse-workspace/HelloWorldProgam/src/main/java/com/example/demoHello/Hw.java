package com.example.demoHello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hw {
		@RequestMapping("/hw")
	    public String hello() {
	        return "Hello World!";
	    }

}
