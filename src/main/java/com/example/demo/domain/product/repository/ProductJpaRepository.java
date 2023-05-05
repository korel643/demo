package com.example.demo.domain.product.repository;

import com.example.demo.domain.product.entity.TProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductJpaRepository extends JpaRepository<TProduct, Long> {
}
