package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepo implements CustomerRepo {

	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer c = new Customer();
		
		c.setFirstName("John");
		c.setLastName("Doe");
		
		customers.add(c);
		
		return customers;
		
	}
}
