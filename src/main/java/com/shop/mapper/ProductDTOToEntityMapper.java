package com.shop.mapper;

import com.shop.domain.Product;
import com.shop.domain.Stoc;
import com.shop.domain.enums.ProductType;
import com.shop.domain.model.ProductDTO;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class ProductDTOToEntityMapper implements Converter<ProductDTO, Product> {

    @Override
    public Product convert(ProductDTO productDTO) {
        return Product.builder()
                      .id(LocalDateTime.now().toString())
                      .name(productDTO.getName())
                      .price(new BigDecimal(productDTO.getPrice()))
                      .stoc(Stoc.builder()
                                .stoc(productDTO.getStoc())
                                .build())
                      .type(ProductType.valueOf(productDTO.getType()))
                      .build();
    }
}
