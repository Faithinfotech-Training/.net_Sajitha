package com.faith.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.faith.model.Customer;

public interface ICustomerRepository extends JpaRepositoryImplementation<Customer, Integer> {

}
