package com.cust.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.Entity.Customer;
import com.cust.Repositary.CustomerRepositary;

@Service
public class CustomerService {
		
	@Autowired
	private CustomerRepositary repository;
	
	public Customer addCustomer(Customer customer){
		return repository.save(customer);
	}
	
	public List<Customer> saveCustomers(List<Customer> customers){
		return repository.saveAll(customers);
	}
	
	public List<Customer> getAllCustomers(){
		return repository.findAll();
	}
	
	public Customer getCustomerById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	/*public Employee getEmployeeByName(String name) {
		return repository.findByName(name);
	}*/
	
	public String deleteCustomer(int id) {
		repository.deleteById(id);
		return "Customer Removed !! " +id;
	}
	

}
