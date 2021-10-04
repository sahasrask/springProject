package com.onlineshopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
			Product p=new Product();
			p.setProductName(productDto.getProductName());
			p.setProductQuantity(productDto.getProductQuantity());
			p.setProductDescription(productDto.getProductDescription());
			p.setProductPrice(productDto.getProductPrice());
			p.setProductRating(productDto.getProductRating());
			p.setProductCategory(productDto.getProductCategory());
			p.setProductImageURL(productDto.getProductImageURL());
			
			return productService.addProduct(p);
		}catch(Exception e) {
			System.out.println("Error!");
		}
		return -1;
	}
	
	@GetMapping(path="/viewAllProducts")
	public List<Product> viewAllProducts(){
		try {
			return productService.viewAllProducts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(path="/viewAllProductsOfRetailer")
	public List<Product> viewAllProductsOfRetailer(@RequestParam("retailerId") int retailerId, HttpServletRequest request){
		try {
			return productService.viewAllProductsOfRetailer(retailerId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(path="/displayProduct")
	public Product displayProduct(@RequestParam("productId") int id, HttpServletRequest request){
		try {
			return productService.getProductById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(path="/viewNotApprovedProducts")
	public List<Product> viewNotApprovedProducts(){
		try {
			return productService.viewNotApprovedProducts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping(path="/approveProduct")
	public Product approveProduct(@RequestParam("productId") int id, HttpServletRequest request)
	{
		return productService.approveProduct(id);
	}
	

}
