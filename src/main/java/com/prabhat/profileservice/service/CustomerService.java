package com.prabhat.profileservice.service;

import java.util.List;

import com.prabhat.commons.model.Customer;

public interface CustomerService {


    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
