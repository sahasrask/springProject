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
		// TODO Auto-generated method stub
		return adminrepo.viewAllRetailers();
	}

	@Override
	public boolean approveRetailer(int retailerId) {
		// TODO Auto-generated method stub
		return adminrepo.approveRetailer(retailerId);
	}

	@Override
	public Retailer findRetailerById(int retailerId) {
		// TODO Auto-generated method stub
		return adminrepo.findRetailerById(retailerId);
	}


}
