package com.example.demo.domain.customer.service;

import com.example.demo.domain.customer.service.dto.CustomerDTO;

import java.util.Collection;

public interface CustomerService {

    Collection<CustomerDTO>  getAllCustomers();

    CustomerDTO getCustomerById(String idCustomer);
}
