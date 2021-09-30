package com.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.repository.RetailerRepository;


@Service
public class RetailerServiceImpl implements RetailerService{
	
	@Autowired
	RetailerRepository retailerRepo;

	@Override
	public void addProducts(Product product) {
		
		retailerRepo.addProducts(product);
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		retailerRepo.deleteProduct(productId);
		
	}

	@Override
	public void addRetailer(Retailer retailer) {
		// TODO Auto-generated method stub
		retailerRepo.addRetailer(retailer);
		
	}

	@Override
	public Retailer getRetailerById(int retailerId) {
		return retailerRepo.getRetailerById(retailerId);
	}

}
