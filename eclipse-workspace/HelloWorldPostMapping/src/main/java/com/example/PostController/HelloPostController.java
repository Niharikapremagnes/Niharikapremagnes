package com.example.PostController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPostController {
	
	@PostMapping("/helloposting")
	public String hello(@RequestBody String hello) {
		return hello;
	}

}
