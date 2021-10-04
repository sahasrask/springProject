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

	@Override
	public List<Retailer> viewAllRetailers() {
		return adminrepo.viewAllRetailers();
	}

	@Override
	public boolean approveRetailer(int retailerId) {
		return adminrepo.approveRetailer(retailerId);
	}

	@Override
	public Retailer findRetailerById(int retailerId) {
		return adminrepo.findRetailerById(retailerId);
	}

	@Override
	public Admin loginAdmin(String email, String password) {
		return adminrepo.loginAdmin(email, password);
	}


}
