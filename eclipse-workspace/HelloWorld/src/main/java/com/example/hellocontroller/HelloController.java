package com.example.hellocontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
        return "Hello World using Get Mapping!";
    }

}
