package com.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;
import com.onlineshopping.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository adminrepo;
//
////	@Override
////	public void addOrUpdateAdmin(Admin admin) {
////		
////		adminrepo.addOrUpdateAdmin(admin);
////	}
//
////	@Override
////	public Retailer addRetailer(Retailer retailer) {
////		// TODO Auto-generated method stub
////		return adminrepo.addRetailer(retailer);
////	}
////
////	@Override
////	public void deleteRetailer(Retailer retailer) {
////		adminrepo.deleteRetailer(retailer);
////		
////	}
//
////	@Override
////	public Retailer findRetailerByRetailerId(int retailerId) {
////		// TODO Auto-generated method stub
////		return adminrepo.findRetailerByRetailerId(retailerId);
////	}
////
////	@Override
////	public List<Retailer> viewAllRetailers() {
////		// TODO Auto-generated method stub
////		return adminrepo.viewAllRetailers();
////	}
//
//	@Override
//	public List<User> viewAllUsers() {
//		// TODO Auto-generated method stub
//		return adminrepo.viewAllUsers();
//	}
//
//	@Override
//	public User findUserByUserId(int userId) {
//		// TODO Auto-generated method stub
//		return adminrepo.findUserByUserId(userId);
//	}
//
//	@Override
//	public void addProduct(Product product) {
//		// TODO Auto-generated method stub
//		adminrepo.addProduct(product);
//	}
//
//	@Override
//	public List<Product> viewAllProducts() {
//		// TODO Auto-generated method stub
//		return adminrepo.viewAllProducts();
//	}
//
//	@Override
//	public Product findProductById(int productId) {
//		// TODO Auto-generated method stub
//		return adminrepo.findProductById(productId);
//	}

	@Override
	public void addOrUpdateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> viewAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
