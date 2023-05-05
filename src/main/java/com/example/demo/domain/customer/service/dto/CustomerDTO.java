package com.example.demo.domain.customer.service.dto;

import com.example.demo.domain.customer.entity.TCustomer;

import java.util.Optional;

public class CustomerDTO {

    private String id;

    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static CustomerDTO of(TCustomer tCustomers) {
        CustomerDTO dto = new CustomerDTO();
        dto.setId(tCustomers.getId());
        dto.setCity(tCustomers.getCity());
        return dto;
    }
}
