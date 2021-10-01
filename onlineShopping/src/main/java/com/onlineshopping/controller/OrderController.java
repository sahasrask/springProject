package com.onlineshopping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.CartDto;
import com.onlineshopping.dto.ProductDto;
import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.CartItems;
import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.OrderItems;
import com.onlineshopping.entity.OrderStatus;
import com.onlineshopping.service.CartItemsService;
import com.onlineshopping.service.CartService;
import com.onlineshopping.service.OrderItemsService;
import com.onlineshopping.service.OrderService;

@RestController
@CrossOrigin("*")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	CartService cartService;
	
	@Autowired
	CartItemsService cartItemsService;
	
	@Autowired
	OrderItemsService orderItemsService;
	
	@PostMapping("/addOrder")
	public Order addOrder(@RequestParam("cartId") int cartId)
	{
		Order o=orderService.createOrder();
		List<CartItems> cli= cartItemsService.getAllCartItems(cartId);
		List<OrderItems> oli= new ArrayList<OrderItems>();
		int orderId =o.getOrderId();
		double totalAmount=0;
		for(CartItems c: cli)
		{
			OrderItems item =new OrderItems();
			item.setOrderQuantity(c.getQuantity());
			item.setOrder(o);
			item.setProduct(c.getProduct());
			oli.add(orderItemsService.addOrderItem(item));
			totalAmount+=c.getProduct().getProductPrice()*c.getQuantity();
			
		}
		o.setOrderItems(oli);
		o.setTotalOrderAmount(totalAmount);
		o.setOrderStatus(OrderStatus.APPROVED);
		cartItemsService.emptyCart(cartId);
		return o;
	 }
	
	

}
