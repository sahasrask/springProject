package com.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.entity.OrderItems;
import com.onlineshopping.repository.OrderItemsRepository;

@Service
public class OrderItemsServiceImpl implements OrderItemsService{
	
	@Autowired
	OrderItemsRepository orderItemRepo;

	@Override
	public List<OrderItems> getAllOrderItems(int orderId) {
		// TODO Auto-generated method stub
		return orderItemRepo.getAllOrderItems(orderId);
	}

	@Override
	public long getOrderTotal(int orderId) {
		// TODO Auto-generated method stub
		return orderItemRepo.getOrderTotal(orderId);
	}

	@Override
	public OrderItems addOrderItem(OrderItems orderItem) {
		// TODO Auto-generated method stub
		return orderItemRepo.addOrderItem(orderItem);
	}

}
