package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;

public interface RetailerRepository 
{
	void addProducts(Product product);
	void deleteProduct(int productId);
	void addRetailer(Retailer retailer);
	Retailer getRetailerById(int retailerId);
	
}
