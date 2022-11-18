package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	    
	    @Id
	    @Column(name = "username")
	    private String username;

	    @Column(name = "password")
	    private String password;

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}


	   

}
