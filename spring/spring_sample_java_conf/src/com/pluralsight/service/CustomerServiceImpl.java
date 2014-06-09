package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	public void setRepo(CustomerRepo repo) {
		this.repo = repo;
	}

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#getAllCustomers()
	 */
	@Override
	public List<Customer> getAllCustomers(){
		
		List<Customer> customers = repo.findAll();
		
		return customers;
	}
	


}
