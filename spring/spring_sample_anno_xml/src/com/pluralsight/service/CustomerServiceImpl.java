package com.pluralsight.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepo;
import com.pluralsight.repository.HibernateCustomerRepo;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepo repo;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepo repo){
		System.out.println("ctr autowired");
		this.repo = repo;
	}
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#getAllCustomers()
	 */
	@Override
	public List<Customer> getAllCustomers(){
		
		System.out.println("Inside getAllCustomers");
		List<Customer> customers = repo.findAll();
		
		return customers;
	}

}
