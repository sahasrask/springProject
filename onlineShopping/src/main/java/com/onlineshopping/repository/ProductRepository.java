package com.onlineshopping.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.onlineshopping.entity.Product;

public interface ProductRepository {
	Product findProductById(int productId);
	List<Product> viewAllProducts();
	List<Product> viewProductsByCategory(String productCategory);
	List<Product> viewProductByPrice(int productPrice);
	List<Product> viewProductsByRating(int productRating);
}
