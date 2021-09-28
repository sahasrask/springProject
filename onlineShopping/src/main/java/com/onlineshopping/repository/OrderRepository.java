package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.User;

public interface OrderRepository {
	Order createOrder(Order order);
	void cancelOrder(Order order);
	Order repeatOrder(Order order);
	Order updateOrder(Order order);
	List<Order> viewOrderHistory(User user);
	Order viewOrderDetails(int orderId);
}
