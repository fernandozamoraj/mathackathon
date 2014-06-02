package com.pluralsight;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class AppClient {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerServiceImpl();
		
		List<Customer> customers = customerService.getAllCustomers();
		
		for(Customer c : customers){
			
			System.out.println(c);
			
		}

	}

}
