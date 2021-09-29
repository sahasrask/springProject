package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;

public interface AdminService {
	
	void addOrUpdateAdmin(Admin admin);
	
	Retailer addRetailer(Retailer retailer);
	
	void deleteRetailer(Retailer retailer);
	
	Retailer findRetailerByRetailerId(int userId);
		
	List<Retailer> viewAllRetailers();
	
	List<User> viewAllUsers();
	
	User findUserByUserId(int userId);

}
