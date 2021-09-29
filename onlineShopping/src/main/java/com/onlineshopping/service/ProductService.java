package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.Product;

public interface ProductService {
	int add(Product product);
	Product get(int productId);
	void update(Product product);
	int remove(int productId);
	List<Product> viewAllProduct();
}
