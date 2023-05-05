package com.example.demo.domain.customer.repository;

import com.example.demo.domain.customer.entity.TCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository <TCustomer, Long> {
}
