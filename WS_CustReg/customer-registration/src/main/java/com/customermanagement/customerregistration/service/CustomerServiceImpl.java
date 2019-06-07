package com.customermanagement.customerregistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.customermanagement.customerregistration.entity.Customer;
import com.customermanagement.customerregistration.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{
  @Autowired
  CustomerRepository custRepo;
  
    public List<Customer> getListOfCustomer()
	{
    	return custRepo.findAll();
	}
  
	public Customer saveCustomerDetails(Customer c)
	{
		return custRepo.save(c);
	}
	
	public String editCustomerDetails()
	{
		return "saved";
	}

	public Customer getCustomerByEmail(String email) {
		return custRepo.findByEmail(email);
	}
}
