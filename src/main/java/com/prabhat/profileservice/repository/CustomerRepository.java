package com.prabhat.profileservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.prabhat.commons.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
