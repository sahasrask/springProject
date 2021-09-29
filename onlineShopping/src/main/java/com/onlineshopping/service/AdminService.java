package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;

public interface AdminService {
	
	
	
	//Retailer addRetailer(Retailer retailer);
	
	//void deleteRetailer(Retailer retailer);
	
	//Retailer findRetailerByRetailerId(int userId);
		
	//List<Retailer> viewAllRetailers();
	void addOrUpdateAdmin(Admin admin);
	
	List<User> viewAllUsers();
	
	User findUserByUserId(int userId);
	
	void addProduct(Product product);
	
	List<Product> viewAllProducts();
	
	Product findProductById(int productId);

}
