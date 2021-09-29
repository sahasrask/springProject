package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.AdminDto;
import com.onlineshopping.entity.Admin;
import com.onlineshopping.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
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
	

}
