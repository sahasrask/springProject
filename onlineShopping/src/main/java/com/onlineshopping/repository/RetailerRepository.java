package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Product;

public interface RetailerRepository {
	List<Product> addProducts(List<Product> products);
	List<Product> stageProducts(List<Product> products);
	Product updateProduct(Product product);
}
