package com.cust.dto.orderrequest;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.cust.customerentity.Customer;



public class OrderRequest {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Customer customer;
	
	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}

}
