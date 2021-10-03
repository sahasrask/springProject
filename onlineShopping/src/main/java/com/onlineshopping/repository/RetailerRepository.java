package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;

public interface RetailerRepository 
{
	void addProducts(Product product);
	void deleteProduct(int productId);
	Retailer addRetailer(Retailer retailer);
	Retailer getRetailerById(int retailerId);
	Retailer loginRetailer(String email, String password);
	
}
