package com.example.demo.domain.customer.service;

import com.example.demo.domain.customer.dao.CustomerDAO;
import com.example.demo.domain.customer.entity.TCustomer;
import com.example.demo.domain.customer.repository.CustomerJpaRepository;
import com.example.demo.domain.customer.service.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerJpaRepository customerJpaRepository;

    @Autowired
    private CustomerDAO customerDAO;

    public Collection<CustomerDTO> getAllCustomers() {
        List<TCustomer> tCustomerList = customerJpaRepository.findAll();
        return tCustomerList.stream()
                .map(CustomerDTO::of)
                .collect(Collectors.toList());
    }



    public CustomerDTO getCustomerById(Long idCustomer) {
        return customerDAO.getCustomerById(idCustomer)
                .map((CustomerDTO::of))
                .orElse(null);

    }
}
