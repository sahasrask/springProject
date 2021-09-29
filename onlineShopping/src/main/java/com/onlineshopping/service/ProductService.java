package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.Product;

public interface ProductService {
<<<<<<< HEAD
	int addProduct(Product product);
	Product getProduct(int productId);
	void updateProduct(Product product);
	int removeProduct(int productId);
=======
	int add(Product product);
	Product get(int productId);
	void update(Product product);
	int remove(int productId);
	List<Product> viewAllProduct();
>>>>>>> branch 'master' of https://github.com/sahasrask/springProject.git
}
