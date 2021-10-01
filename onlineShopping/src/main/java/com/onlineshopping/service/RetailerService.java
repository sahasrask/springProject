package com.onlineshopping.service;

import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;

public interface RetailerService {
	void addProducts(Product product);
	void deleteProduct(int productId);
	void addRetailer(Retailer retailer);
	Retailer getRetailerById(int retailerId);
}
