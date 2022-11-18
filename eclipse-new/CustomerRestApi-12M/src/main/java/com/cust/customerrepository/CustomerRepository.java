package com.cust.customerrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cust.customerentity.Customer;
import com.cust.dto.orderresponse.OrderResponse;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	   @Query("SELECT new com.cust.dto.orderrresponse.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
	    public List<OrderResponse> getJoinInformation();
	}