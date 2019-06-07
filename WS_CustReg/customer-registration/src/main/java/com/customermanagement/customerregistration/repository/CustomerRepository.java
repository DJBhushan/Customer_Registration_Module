package com.customermanagement.customerregistration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.customermanagement.customerregistration.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>
{
   public Customer findByEmail(String emailId);
}
