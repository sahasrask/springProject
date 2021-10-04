package com.onlineshopping.repository;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.OrderStatus;
import com.onlineshopping.entity.User;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public Order createOrder() {
		Order order =new Order();
		order.setTotalOrderAmount(0);
		return em.merge(order);	
	}

	@Override
	public void cancelOrder(Order order) {
		em.remove(order);
	}

	@Override
	public Order repeatOrder(Order order) {
		return null;
	}

	@Override
	public Order viewOrderDetails(int orderId) {
		return em.find(Order.class, orderId);
	}

	@Override
	public List<Order> getOrdersByUserId(int userId) {
		// TODO Auto-generated method stub
		String jpql="select o from Order o where o.user.user_id=:uid";
		Query query=em.createQuery(jpql);
		query.setParameter("uid", userId);
		return query.getResultList();
	}

}
