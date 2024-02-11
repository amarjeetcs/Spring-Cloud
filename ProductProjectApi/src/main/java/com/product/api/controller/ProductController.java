package com.product.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.model.Product;
import com.product.api.service.ProductService;

@RestController
@RequestMapping("/Product")
public class ProductController {
	@Autowired
	private ProductService service;

	@PostMapping("/createProduct")
	public Product createProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@PostMapping("/createMultipleProducts")
	public List<Product> createProducts(@RequestBody List<Product> products) {
		// Assuming you have a ProductService
		service.saveAll(products);
		return products;
	}
	@GetMapping("/getProductList/{name}")
	public Object getProductByName(@PathVariable String name)
	{
		return service.getProductByName(name);
	}

	@GetMapping("/getProductList")
	public List<Product> getProducts()
	{
		return service.getProducts();
	}
	
	@GetMapping("/getProductById/{id}")
	public Optional<Product> getProductById(@PathVariable Integer id)
	{
		return service.getProductById(id);
	}
	
	@PutMapping("/updateProduct")
	public Product update(@RequestBody Product product)
	{
		return service.saveProduct(product);
	}

	
}