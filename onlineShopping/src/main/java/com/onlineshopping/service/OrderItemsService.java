package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.OrderItems;

public interface OrderItemsService {
	
	List<OrderItems> getAllOrderItems(int orderId);
	long getOrderTotal(int orderId);
	OrderItems addOrderItem(OrderItems orderItem);

}
