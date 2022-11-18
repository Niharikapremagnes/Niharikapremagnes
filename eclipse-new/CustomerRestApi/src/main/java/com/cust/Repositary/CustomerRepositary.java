package com.cust.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cust.Entity.Customer;

public interface CustomerRepositary extends JpaRepository<Customer, Integer>{

}
