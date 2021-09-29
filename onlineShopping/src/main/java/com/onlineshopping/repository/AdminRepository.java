package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;

public interface AdminRepository {
	
void addOrUpdateAdmin(Admin admin);
	
	List<User> viewAllUsers();
	
	User findUserByUserId(int userId);
	
	void addProduct(Product product);
	
	List<Product> viewAllProducts();
	
	Product findProductById(int productId);
	


	
}
