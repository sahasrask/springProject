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

import com.onlineshopping.dto.LoginDto;
import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	@GetMapping(path="/viewAllRetailers")
	public List<Retailer> viewAllRetailers(){
		try {
			return adminService.viewAllRetailers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	@PostMapping(path="/approveRetailer")
	public boolean approveRetailer(@RequestParam("retailerId") int retailerId, HttpServletRequest request)
	{
		adminService.approveRetailer(retailerId);
		return true;
	}
	
	@PostMapping("/loginAdmin")
	public Admin login(@RequestBody LoginDto admin) {
		return adminService.loginAdmin(admin.getEmail(), admin.getPassword());
	}
	
//	@PostMapping("/addAdmin")
//	public void addOrUpdateAdmin(@RequestBody AdminDto adminDto) {
//		
//		Admin admin=new Admin();
//		admin.setAdminFirstName(adminDto.getAdminFirstName());
//		admin.setAdminLastName(adminDto.getAdminLastName());
//		admin.setAdminEmail(adminDto.getAdminEmail());
//		admin.setAdminMobileNumber(adminDto.getAdminMobileNumber());
//		admin.setAdminPassword(adminDto.getAdminPassword());
//		
//		adminService.addOrUpdateAdmin(admin);
//
//	}
	
//	@GetMapping(path="/viewAllProductss")
//	public List<Retailer> viewAllProducts(){
//		try {
//			return adminService.viewAllRetailers();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	@PostMapping("/addProducts")
//	public void addProduct(@RequestBody ProductDto productDto) {
//		
//			
//			Product p=new Product();
//			p.setProductName(productDto.getProductName());
//			p.setProductQuantity(productDto.getProductQuantity());
//			p.setProductDescription(productDto.getProductDescription());
//			p.setProductPrice(productDto.getProductPrice());
//			p.setProductRating(productDto.getProductRating());
//			p.setProductCategory(productDto.getProductCategory());
//			p.setProductImageURL(productDto.getProductImageURL());
//			
//			adminService.addProduct(p);
//		
//	}
//	
//	@GetMapping(path="/viewAllusers")
//	public List<User> viewAllUsers(){
//		try {
//			return adminService.viewAllUsers();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

}



