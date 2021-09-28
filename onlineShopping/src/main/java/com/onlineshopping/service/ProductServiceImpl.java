package com.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.entity.Product;
import com.onlineshopping.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public int add(Product product) {
		int id=productRepo.save(product);
		return id;
	}

	@Override
	public Product get(int productId) {
		return productRepo.findProductById(productId);
	}

	@Override
	public void update(Product product) {
		productRepo.save(product);
	}

	@Override
	public int remove(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
