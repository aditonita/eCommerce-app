package com.shop.repository;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	@Query("SELECT p FROM Product p WHERE p.type = ?1")
	List<Product> getProductsByType(ProductType type);
}
