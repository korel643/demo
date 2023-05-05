package com.example.demo.domain.product.service;

import com.example.demo.domain.product.service.dto.ProductDTO;

import java.util.Collection;

public interface ProductService {

    Collection<ProductDTO> getAllProducts();

    ProductDTO getProductById(Long idProduct);
}
