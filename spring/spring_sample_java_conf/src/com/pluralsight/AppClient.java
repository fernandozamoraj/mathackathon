package com.pluralsight;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;

public class AppClient {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService customerService = context.getBean("customerService", CustomerService.class);
		
		List<Customer> customers = customerService.getAllCustomers();
		
		for(Customer c : customers){
			
			System.out.println(c);
			
		}

	}

}
