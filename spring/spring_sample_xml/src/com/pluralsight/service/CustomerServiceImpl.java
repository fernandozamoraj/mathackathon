package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepo;
import com.pluralsight.repository.HibernateCustomerRepo;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepo customerRepo;
	
	public void setCustomerRepo(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#getAllCustomers()
	 */
	@Override
	public List<Customer> getAllCustomers(){
		
		List<Customer> customers = customerRepo.findAll();
		
		return customers;
	}

}
