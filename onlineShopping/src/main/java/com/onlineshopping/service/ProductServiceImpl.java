package com.onlineshopping.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.entity.Product;
import com.onlineshopping.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public int addProduct(Product product) {
		int id=productRepo.saveProduct(product);
		return id;
	}

	@Override
	public Product getProductById(int productId) {
		return productRepo.findProductById(productId);
	}

	@Override
	public void updateProduct(Product product) {
		productRepo.saveProduct(product);
	}

	@Override
	public int removeProduct(int productId) {
		return 0;
	}

	@Override
	public List<Product> viewAllProducts() {
		return productRepo.viewAllProducts();
	}

	@Override
	public List<Product> viewAllProductsOfRetailer(int retailerId) {
		return productRepo.viewAllProductsOfRetailer(retailerId);
	}

	@Override
	public List<Product> viewNotApprovedProducts() {
		return productRepo.viewNotApprovedProducts();
	}

	@Override
	public Product approveProduct(int productId) {
		return productRepo.approveProduct(productId);
	}

	@Override
	public List<Product> viewApprovedProducts() {
		return productRepo.viewApprovedProducts();
	}
}
