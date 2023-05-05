package com.example.demo.domain.customer.service.dto;

import com.example.demo.domain.customer.entity.TCustomer;

import java.util.Optional;

public class CustomerDTO {

    private Long id;

    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static CustomerDTO of(TCustomer tCustomer) {
        CustomerDTO dto = new CustomerDTO();
        dto.setId(tCustomer.getId());
        dto.setCity(tCustomer.getCity());
        return dto;
    }
}
