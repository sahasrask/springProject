package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Product;

public interface ProductRepository {
	int save(Product product);
	Product findProductById(int productId);
	List<Product> viewAllProducts();
	List<Product> viewProductsByCategory(String productCategory);
	List<Product> viewProductByPrice(double productPrice);
	List<Product> viewProductsByRating(double productRating);
}
