package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.Order;

public interface OrderService {
	Order createOrder();
	void cancelOrder(Order order);
	Order repeatOrder(Order order);
	Order viewOrderDetails(int orderId);
	List<Order> getOrdersByUserId(int userId);

}
