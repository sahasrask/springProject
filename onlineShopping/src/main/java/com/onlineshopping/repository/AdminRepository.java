package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;

public interface AdminRepository {
	Admin addOrUpdateAdmin(Admin admin);
	
	//Product addProducts(Product products);
	
	void deleteProducts(Product product);
	
	Retailer addRetailer(Retailer retailer);
	
	void deleteRetailer(Retailer retailer);
	
	//List<Order> viewOrders();
	
//	List<Product> updateProducts(List<Product> products);
	Product updateProductPrice(int productId,int productPrice);
	
	List<User> viewAllUsers();
	
	User findUserByUserId(int userId);
}
