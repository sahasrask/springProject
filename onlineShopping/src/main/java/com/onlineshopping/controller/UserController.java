package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.service.UserService;



@RestController
public class UserController {
	 @Autowired
	UserService userService;
	 
	 
}
