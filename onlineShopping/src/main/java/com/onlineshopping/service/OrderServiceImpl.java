package com.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.entity.Order;
import com.onlineshopping.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepo;

	@Override
	public Order createOrder() {
		return orderRepo.createOrder();
	}

	@Override
	public void cancelOrder(Order order) {
		// TODO Auto-generated method stub
		orderRepo.cancelOrder(order);
		
	}

	@Override
	public Order repeatOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepo.repeatOrder(order);
	}

	@Override
	public Order viewOrderDetails(int orderId) {
		// TODO Auto-generated method stub
		return orderRepo.viewOrderDetails(orderId);
	}

}
