package com.pluralsight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService(){
		
		CustomerServiceImpl customerService =  new CustomerServiceImpl();
		
		return customerService;
	}
}
