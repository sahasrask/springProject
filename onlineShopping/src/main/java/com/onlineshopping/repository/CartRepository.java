package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Product;

public interface CartRepository {
	Product addProductToCart(Product product);
	List<Product> addProductsToCart(List<Product> products);
	void deleteProductsFromCart(Product product);
	List<Product> checkOut(List<Product> products);
	List<Product> viewAllProductsInCart();
}
