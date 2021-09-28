package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.entity.Product;
import com.onlineshopping.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(path="/addProduct")
	public void add(@RequestBody Product product) {
		try {
			productService.add(product);
		}catch(Exception e) {
			System.out.println("Error!");
		}
	}
}
