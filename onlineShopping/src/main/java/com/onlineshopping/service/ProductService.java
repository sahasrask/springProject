package com.onlineshopping.service;

import com.onlineshopping.entity.Product;

public interface ProductService {
	int add(Product product);
	Product get(int productId);
	void update(Product product);
	int remove(int productId);
}
