package com.example.secureapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.secureapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	com.example.secureapp.model.User findByUsername(String username);
	

}
