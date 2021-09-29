package com.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.ProductDto;
import com.onlineshopping.entity.Product;
import com.onlineshopping.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(path="/addProduct")
	public int add(@RequestBody ProductDto productDto) {
		try {
<<<<<<< HEAD
			productService.addProduct(product);
=======
			Product p=new Product();
			p.setProductName(productDto.getProductName());
			p.setProductQuantity(productDto.getProductQuantity());
			p.setProductDescription(productDto.getProductDescription());
			p.setProductPrice(productDto.getProductPrice());
			p.setProductRating(productDto.getProductRating());
			p.setProductCategory(productDto.getProductCategory());
			
			return productService.add(p);
>>>>>>> branch 'master' of https://github.com/sahasrask/springProject.git
		}catch(Exception e) {
			System.out.println("Error!");
		}
		return -1;
	}
	
	@GetMapping(path="/viewAllProducts")
	public List<Product> viewAllProducts(){
		try {
			return productService.viewAllProduct();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
