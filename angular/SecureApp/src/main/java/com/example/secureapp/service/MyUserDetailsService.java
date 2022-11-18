package com.example.secureapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.secureapp.model.User;
import com.example.secureapp.repository.UserRepository;

@Service
public class MyUserDetailsService extends UserDetailsServiceAutoConfiguration{
	
	@Autowired
	private UserRepository repo;
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		User user =repo.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("user 404");
		
		return new UserPrincipal(user);
		
	}
	
	

}
