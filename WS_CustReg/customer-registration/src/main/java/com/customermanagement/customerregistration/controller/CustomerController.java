package com.customermanagement.customerregistration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.customermanagement.customerregistration.entity.Customer;
import com.customermanagement.customerregistration.service.CustomerService;

@RestController
@CrossOrigin()
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	CustomerService custServ;
	
	@GetMapping(value="/list")
	public List<Customer> getListOfCustomer()
	{
		return custServ.getListOfCustomer();
	}
	
	@PostMapping(value="/email/{emailId}", produces ="application/json")
	public Customer getCustomer(@PathVariable String emailId)
	{
		return custServ.getCustomerByEmail(emailId);
	}

	@PostMapping(value="/save")
	public Customer saveCustomerDetails(@RequestBody Customer c)
	{
	  return custServ.saveCustomerDetails(c);
	}
	
	@PutMapping(value="/edit")
	public Customer editCustomerDetails(@RequestBody Customer c)
	{
		Customer existingCust = custServ.getCustomerByEmail(c.getEmail());
		existingCust.setName(c.getName());
		existingCust.setAddress(c.getAddress());
		
		return custServ.saveCustomerDetails(existingCust);
	}
	
}
