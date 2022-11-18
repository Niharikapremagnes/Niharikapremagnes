package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.repository.UserRepository;
import com.example.springboot.model.*;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(){
    	return this.userRepository.findAll();
    }
    
    @PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
}