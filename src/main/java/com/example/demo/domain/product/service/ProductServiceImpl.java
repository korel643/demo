package com.example.demo.domain.product.service;

import com.example.demo.domain.product.dao.ProductDAO;
import com.example.demo.domain.product.entity.TProduct;
import com.example.demo.domain.product.repository.ProductJpaRepository;
import com.example.demo.domain.product.service.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductJpaRepository productsJpaRepository;

    @Autowired
    private ProductDAO productDAO;


    public Collection<ProductDTO> getAllProducts() {
        List<TProduct> tProductList = productsJpaRepository.findAll();
        return tProductList.stream()
                .map(ProductDTO::of)
                .collect(Collectors.toList());
    }

}
