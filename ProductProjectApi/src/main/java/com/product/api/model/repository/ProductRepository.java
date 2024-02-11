package com.product.api.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.api.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	Object getProductByName(String name);

	Product updateProduct(Product product);



}
