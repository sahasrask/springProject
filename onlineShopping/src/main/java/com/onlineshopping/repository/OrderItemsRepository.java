package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.CartItems;
import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.OrderItems;

public interface OrderItemsRepository {
	
	List<OrderItems> getAllOrderItems(int orderId);
	long getOrderTotal(int orderId);
	OrderItems addOrderItem(OrderItems orderItem);

}
