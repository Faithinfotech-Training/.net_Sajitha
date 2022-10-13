package com.faith.service;

import java.util.List;
import java.util.Optional;

import com.faith.model.Customer;

public interface ICustomerService {

	
	//get all customers
	List<Customer> findAllCustomers();
	
	
    //add customer
	Customer addCustomer(Customer customer);
	
	
   //update customer
	Customer updateCustomer(Customer customer);

	//Find a customer by id
	   public Optional <Customer> getACustomerById(int Id);
	   
	 //Delete
	   public void deleteCustomer(int id);
	

}
