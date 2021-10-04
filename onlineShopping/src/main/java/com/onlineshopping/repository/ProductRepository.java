package com.onlineshopping.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.onlineshopping.entity.Product;

public interface ProductRepository {
	int saveProduct(Product product);
	Product findProductById(int productId);
	List<Product> viewAllProducts();
	List<Product> viewAllProductsOfRetailer(int retailerId);
	List<Product> viewProductsByCategory(String productCategory);
	List<Product> viewProductByPrice(double productPrice);
	List<Product> viewProductsByRating(double productRating);
	List<Product> viewNotApprovedProducts();
	List<Product> viewApprovedProducts();
	Product approveProduct(int productId);
}
