package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;

public interface AdminService {
	
	Admin loginAdmin(String email,String password);
	List<Retailer> viewAllRetailers();
	boolean approveRetailer(int retailerId);
	Retailer findRetailerById(int retailerId);
}
