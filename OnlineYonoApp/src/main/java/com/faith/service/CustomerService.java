package com.faith.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.model.Customer;
import com.faith.repo.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService{
	
	//filed injection
			@Autowired
			ICustomerRepository  cusRepo;
			
			@Autowired
			public CustomerService (ICustomerRepository _cusRepo) {
				this.cusRepo=_cusRepo;
			}
			
			@Override
			public List<Customer> findAllCustomers() {
				return (List<Customer>)cusRepo.findAll();
			}
			
			@Transactional
			@Override
			public Customer addCustomer(Customer customer) {
				return cusRepo.save(customer);
			}
			
			
			
			@Transactional
			@Override
			public Customer updateCustomer(Customer customer) {
				return cusRepo.save(customer);	
			}
			
			@Override
		    public Optional <Customer> getACustomerById(int Id) {
		        return cusRepo.findById(Id);
		    }

		    //delete
		    @Override
		    public void deleteCustomer(int id) {
		        cusRepo.deleteById(id);

		    }
			
	
	

}
