package com.ecommerce.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.product.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Long>{
	
	@Query("select p from Product p where p.category.code = ?1")
	List<Product> findByCategory(String category);
}
