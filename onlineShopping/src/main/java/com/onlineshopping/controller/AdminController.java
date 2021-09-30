package com.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.AdminDto;
import com.onlineshopping.dto.ProductDto;
import com.onlineshopping.dto.UserDto;
import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.User;
import com.onlineshopping.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/addAdmin")
	public void addOrUpdateAdmin(@RequestBody AdminDto adminDto) {
		
		Admin admin=new Admin();
		admin.setAdminFirstName(adminDto.getAdminFirstName());
		admin.setAdminLastName(adminDto.getAdminLastName());
		admin.setAdminEmail(adminDto.getAdminEmail());
		admin.setAdminMobileNumber(adminDto.getAdminMobileNumber());
		admin.setAdminPassword(adminDto.getAdminPassword());
		
		adminService.addOrUpdateAdmin(admin);

	}
	
	@GetMapping(path="/viewAllProductss")
	public List<Product> viewAllProducts(){
		try {
			return adminService.viewAllProducts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/addProducts")
	public void addProduct(@RequestBody ProductDto productDto) {
		
			
			Product p=new Product();
			p.setProductName(productDto.getProductName());
			p.setProductQuantity(productDto.getProductQuantity());
			p.setProductDescription(productDto.getProductDescription());
			p.setProductPrice(productDto.getProductPrice());
			p.setProductRating(productDto.getProductRating());
			p.setProductCategory(productDto.getProductCategory());
			p.setProductImageURL(productDto.getProductImageURL());
			
			adminService.addProduct(p);
		
	}
	
	@GetMapping(path="/viewAllusers")
	public List<User> viewAllUsers(){
		try {
			return adminService.viewAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
