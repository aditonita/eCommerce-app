package com.shop.service;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;
import com.shop.domain.model.ProductDTO;
import com.shop.mapper.ProductDTOToEntityMapper;
import com.shop.mapper.ProductEntityToDTOMapper;
import com.shop.repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;

	@Autowired
	private ProductDTOToEntityMapper productDTOToEntityMapper;
	@Autowired
	private ProductEntityToDTOMapper productEntityToDTOMapper;

	@Override
	public void createProduct(ProductDTO productDTO) {
		Product product = productDTOToEntityMapper.convert(productDTO);
		repo.save(product);
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		return repo.findAll()
				   .stream()
				   .map(productEntityToDTOMapper::convert)
				   .collect(Collectors.toList());
	}

	@Override
	public List<ProductDTO> getProductsByType(ProductType type) {
		return repo.getProductsByType(type)
				   .stream()
				   .map(productEntityToDTOMapper::convert)
				   .collect(Collectors.toList());
	}

}
