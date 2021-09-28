package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.User;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		Order o = em.merge(order);
		return o;
	}

	@Override
	public void cancelOrder(Order order) {
		// TODO Auto-generated method stub
		em.remove(order);
	}

	@Override
	public Order repeatOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		Order o = em.merge(order);
		return o;
	}

	@Override
	public List<Order> viewOrderHistory(User user) {
		// TODO Auto-generated method stub
		return em.find(null, user);
	}

	@Override
	public Order viewOrderDetails(int orderId) {
		// TODO Auto-generated method stub
		return em.find(Order.class, orderId);
	}

}
