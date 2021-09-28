package com.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;
import com.onlineshopping.repository.AdminRepository;

public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository adminrepo;

	@Override
	public Admin addOrUpdateAdmin(Admin admin) {
		
		return adminrepo.addOrUpdateAdmin(admin);
	}

	@Override
	public Retailer addRetailer(Retailer retailer) {
		// TODO Auto-generated method stub
		return adminrepo.addRetailer(retailer);
	}

	@Override
	public void deleteRetailer(Retailer retailer) {
		adminrepo.deleteRetailer(retailer);
		
	}

	@Override
	public Retailer findRetailerByRetailerId(int retailerId) {
		// TODO Auto-generated method stub
		return adminrepo.findRetailerByRetailerId(retailerId);
	}

	@Override
	public List<Retailer> viewAllRetailers() {
		// TODO Auto-generated method stub
		return adminrepo.viewAllRetailers();
	}

	@Override
	public List<User> viewAllUsers() {
		// TODO Auto-generated method stub
		return adminrepo.viewAllUsers();
	}

	@Override
	public User findUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return adminrepo.findUserByUserId(userId);
	}

}
