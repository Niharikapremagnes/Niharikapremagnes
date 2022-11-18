package com.cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cust.Entity.Customer;
import com.cust.Service.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	
	@RequestMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/customer")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	/*@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
	public void updateCustomer(@RequestBody Customer customer,@PathVariable String id) {
		customerService.updateCustomer(id,customer);
	}*/
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{id}")
	public void deleteCustomer(@PathVariable int id) {
		  customerService.deleteCustomer(id);
	}
}

