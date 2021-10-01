package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshopping.entity.CartItems;
import com.onlineshopping.entity.OrderItems;

@Repository
public class OrderItemsRepositoryImpl implements OrderItemsRepository{
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<OrderItems> getAllOrderItems(int orderId) {
		String jpql="select o from OrderItems o where o.order.orderId=:oid";
		Query query= em.createQuery(jpql);
		query.setParameter("oid", orderId);
		List<OrderItems> items= query.getResultList();
		return items;
	}

	@Override
	public long getOrderTotal(int orderId) {
		String jpql="select sum(o.order.totalOrderAmount) from OrderItems o where o.order.orderId=:oid";
		Query query= em.createQuery(jpql);
		query.setParameter("oid", orderId);
		long total= (long) query.getSingleResult();
		return total;
	}

	@Override	
	@Transactional
	public OrderItems addOrderItem(OrderItems orderItem) {
		return em.merge(orderItem);
	}

	

}
