//package com.onlineshopping.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.onlineshopping.dto.CartItemsDto;
//import com.onlineshopping.dto.OrderItemDto;
//import com.onlineshopping.entity.CartItems;
//import com.onlineshopping.entity.OrderItems;
//import com.onlineshopping.service.OrderItemsService;
//import com.onlineshopping.service.OrderService;
//
//@RestController
//@CrossOrigin("*")
//public class OrderItemsController {
//	
//	@Autowired
//	OrderItemsService orderItemService;
//	
//	@PostMapping(path="/addItem")
//	public OrderItems add(@RequestBody OrderItemDto orderItemDto) {
//		
//		OrderItems item=new OrderItems();
//		
//		return item;
//		
//	
//	}
//	
//
//}
