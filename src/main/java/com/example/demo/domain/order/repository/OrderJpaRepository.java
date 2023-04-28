package com.example.demo.domain.order.repository;

import com.example.demo.domain.order.entity.TOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaRepository extends JpaRepository<TOrder, Long> {
}
