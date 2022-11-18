package com.la.app.security;
import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
@Configuration
public class SecurityConfiguration {
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		UserDetails userDetails1 = createNewUser("in28Minutes", "dummy");
		UserDetails userDetails2 = createNewUser("niharika", "premagnes");
		
		return new InMemoryUserDetailsManager(userDetails1, userDetails2);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder
		= input -> passwordEncoder().encode(input);

		UserDetails userDetails = User.builder()
									.passwordEncoder(passwordEncoder)
									.username(username)
									.password(password)
									.roles("USER","ADMIN")
									.build();
		return userDetails;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}


 // In Spring Security 5.4 introduced the ability to configure HttpSecurity by creating a SecurityFilterChain bean.
 @Bean
 public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
     http.authorizeRequests((authorize) -> {
                 try {
                     authorize
                             .antMatchers("/login", "/h2-console/**").permitAll()
                             .antMatchers("/", "/*todo*/**").hasRole("USER")
                             .and().formLogin()
                             .and().csrf().disable()
                             .headers().frameOptions().disable();

                 } catch (Exception e) {
                     throw new RuntimeException(e);
                 }
             });


     return http.build();
 }


}