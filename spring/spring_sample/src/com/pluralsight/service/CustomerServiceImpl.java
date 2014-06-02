package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepo;
import com.pluralsight.repository.HibernateCustomerRepo;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepo repo = new HibernateCustomerRepo();
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#getAllCustomers()
	 */
	@Override
	public List<Customer> getAllCustomers(){
		
		List<Customer> customers = repo.findAll();
		
		return customers;
	}

}
