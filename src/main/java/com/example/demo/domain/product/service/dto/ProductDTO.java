package com.example.demo.domain.product.service.dto;

import com.example.demo.domain.product.entity.TProduct;

public class ProductDTO {

    private Long id;

    private String productName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public static ProductDTO of (TProduct tProducts) {
        ProductDTO dto = new ProductDTO();
        dto.setId(tProducts.getId());
        dto.setProductName(tProducts.getProductName());
        return dto;
    }
}
