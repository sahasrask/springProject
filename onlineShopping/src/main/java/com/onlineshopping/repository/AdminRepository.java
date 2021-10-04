package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;

public interface AdminRepository {
	
	List<Retailer> viewAllRetailers();
	
	boolean approveRetailer(int retailerId);
	
	Retailer findRetailerById(int retailerId);

}
