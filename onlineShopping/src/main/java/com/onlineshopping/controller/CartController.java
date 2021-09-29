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

import com.onlineshopping.dto.CartDto;
import com.onlineshopping.dto.ProductDto;
import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.Product;
import com.onlineshopping.service.CartService;
import com.onlineshopping.service.ProductService;

@RestController
@CrossOrigin
public class CartController {
	@Autowired
	CartService cartService;
	@Autowired
	ProductService productService;


	@PostMapping("/addCart")
	public Cart addACartForAUser() 
	{
		return cartService.addCartForaUser();
	}

	@GetMapping("/viewAllProductsInCart")
	public List<Cart> viewAllProductsInCart(@RequestBody CartDto cartDto,HttpServletRequest request) {
		List<Cart> c= cartService.viewAllProductsInCart();
		return c;

	}
}
