package com.customermanagement.customerregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customermanagement.customerregistration.controller.CustomerController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@EnableSwagger2
public class CustomerRegistrationApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(CustomerRegistrationApplication.class, args);
	}
}
