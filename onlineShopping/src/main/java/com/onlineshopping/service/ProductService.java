package com.onlineshopping.service;

import com.onlineshopping.entity.Product;

public interface ProductService {
	int addProduct(Product product);
	Product getProduct(int productId);
	void updateProduct(Product product);
	int removeProduct(int productId);
}
