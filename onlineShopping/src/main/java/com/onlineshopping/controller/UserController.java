package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.UserDto;
import com.onlineshopping.entity.User;
import com.onlineshopping.service.UserService;



@RestController
public class UserController {
	 @Autowired
	UserService userService;
	 
	 @PostMapping(path = "/register")
		public User register(@RequestBody UserDto user) {
		 try {
			 User u= new User();
			 u.setFirstName(user.getFirstName());
			 u.setLastName(user.getLastName());
			 u.setMobile(user.getMobile());
			 u.setPassword(user.getPassword());
			 u.setEmail(user.getEmail());			 
			 return userService.registerUser(u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return null;
		}
		
	
	 
	 
}