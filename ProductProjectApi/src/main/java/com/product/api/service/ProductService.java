package com.product.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.api.model.Product;
import com.product.api.model.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	public List<Product> getProducts() {
		return repository.findAll();
	}

	

	public void saveAll(List<Product> products) {
		repository.saveAll(products);		
	}

	public Object getProductByName(String name) {
	
		return repository.getProductByName(name);
	}

	public Optional<Product> getProductById(int id) {
		return repository.findById(id);
	}

	public Product updateProduct(Product product)
	{
		return repository.save(product);
	}
}
