package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/addAdmin")
	public Admin addOrUpdateAdmin(Admin admin) {
		
		
		return null;
	}
	

}
