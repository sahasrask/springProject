package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.CartDto;
import com.onlineshopping.dto.ProductDto;
import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.Order;
import com.onlineshopping.service.CartService;
import com.onlineshopping.service.OrderService;

@RestController
@CrossOrigin("*")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/addOrder")
	public void addOrder(@RequestBody Cart cart,@RequestParam("cartId") int cartId)
	{
		Cart c=cartService.getCartById(cartId);
		Order o=orderService.createOrder();
		o.setTotalOrderAmount(c.getCartTotalAmount());
	}
	
	

}
