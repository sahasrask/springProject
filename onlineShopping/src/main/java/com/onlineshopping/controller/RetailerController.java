package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.LoginDto;
import com.onlineshopping.dto.ProductDto;
import com.onlineshopping.dto.RetailerDto;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;
import com.onlineshopping.service.RetailerService;

@RestController
@CrossOrigin
public class RetailerController {
	
	@Autowired
	RetailerService retailerService;
	
	@PostMapping(path="/addRetailerProducts")
	public void add(@RequestBody ProductDto productDto,@RequestParam("retailerId") int retailerId) {
		try {

			
			Product p=new Product();
			p.setProductName(productDto.getProductName());
			p.setProductQuantity(productDto.getProductQuantity());
			p.setProductDescription(productDto.getProductDescription());
			p.setProductPrice(productDto.getProductPrice());
			p.setProductRating(productDto.getProductRating());
			p.setProductCategory(productDto.getProductCategory());
			p.setProductImageURL(productDto.getProductImageURL());
			p.setRetailer(retailerService.getRetailerById(retailerId));
			
			retailerService.addProducts(p);
		}catch(Exception e) {
			System.out.println("Error!");
		}
		
	}
	
	
	@PostMapping(path="/deleteProduct")
	public void delete(@RequestParam("productId") int productId) {
		try {
			retailerService.deleteProduct(productId);
		}catch(Exception e) {
			System.out.println("couldnot delete");
		}
		
	}
	
	@PostMapping(path="/addRetailer")
	public Retailer addRetailer(@RequestBody RetailerDto retailerDto) {
		try {
			Retailer retailer=new Retailer();
			retailer.setRetailerName(retailerDto.getRetailerName());
			retailer.setRetailerEmail(retailerDto.getRetailerEmail());
			retailer.setRetailerPassword(retailerDto.getRetailerPassword());
			
			return retailerService.addRetailer(retailer);
			
		}catch(Exception e) {
			System.out.println("could not add");
		}
		return null;
		
	}

	@PostMapping("/loginRetailer")
	public Retailer login(@RequestBody LoginDto user) {
		return retailerService.loginRetailer(user.getEmail(), user.getPassword());
	}
}
