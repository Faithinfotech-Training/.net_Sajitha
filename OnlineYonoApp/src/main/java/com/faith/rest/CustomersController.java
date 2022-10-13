package com.faith.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.model.Customer;
import com.faith.service.ICustomerService;

@CrossOrigin   //helps to avoid CORS error
@RestController
@RequestMapping("api/")
public class CustomersController {
	
	//field Injection
    @Autowired
    ICustomerService customerService;
	
  //List all the customers
    @GetMapping("customers")
    public List<Customer> findAllCustomers(){
        return customerService.findAllCustomers();
    }
    
  //Add User
    @PostMapping("customers")
    public ResponseEntity<Customer> insertCustomer(@RequestBody Customer customer){
        System.out.println("Inserting a record");
        return new ResponseEntity<Customer> (customerService.addCustomer(customer),HttpStatus.OK);
    }
    
  //Update user
    @PutMapping("customers")
    public Customer updateCustomer(@RequestBody Customer customer) {
        System.out.println("Updating a record");
        customerService.updateCustomer(customer);
        return customer;
    }
    
  //get customer by id
    @GetMapping("/customers/{id}")
    public Optional<Customer> getanEmployeeById(@PathVariable int id){
        return customerService.getACustomerById(id);
    }
    
  //delete customer
    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);

    }
    
}
