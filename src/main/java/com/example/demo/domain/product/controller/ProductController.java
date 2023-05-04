package com.example.demo.domain.product.controller;

import com.example.demo.domain.product.service.ProductService;
import com.example.demo.domain.product.service.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("/product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productsService;

    @GetMapping
    public Collection<ProductDTO> getAllProducts(){
        return productsService.getAllProducts();
    }



}
