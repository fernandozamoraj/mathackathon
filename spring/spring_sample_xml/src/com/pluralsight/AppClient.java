package com.pluralsight;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class AppClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = context.getBean("customerService", CustomerServiceImpl.class);
		
		List<Customer> customers = customerService.getAllCustomers();
		
		for(Customer c : customers){
			
			System.out.println(c);
			
		}

	}

}
