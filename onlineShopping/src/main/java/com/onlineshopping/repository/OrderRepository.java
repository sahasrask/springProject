package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.User;

public interface OrderRepository {
	Order createOrder();
	void cancelOrder(Order order);
	Order repeatOrder(Order order);
	Order viewOrderDetails(int orderId);
	List<Order> getOrdersByUserId(int userId);
}
