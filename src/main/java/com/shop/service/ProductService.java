package com.shop.service;

import com.shop.domain.enums.ProductType;
import com.shop.domain.model.ProductDTO;

import java.util.List;

public interface ProductService {
    void createProduct(ProductDTO product);

    List<ProductDTO> getAllProducts();

    List<ProductDTO> getProductsByType(ProductType type);
}
