package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.CartItems;
@Repository
public class CartItemsRepositoryImpl implements CartItemsRepository {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<CartItems> getAllCartItems(int cartId) {
		// TODO Auto-generated method stub
		String jpql="select c from CartItems c where cartId=:cid";
		Query query= em.createQuery(jpql);
		query.setParameter("cid", cartId);
		List<CartItems> items= query.getResultList();
		return items;
	}

	@Override
	public long getCartTotal(int cartId) {
		String jpql="select sum(c.product.productPrice) from CartItems c where cartId=:cid";
		Query query= em.createQuery(jpql);
		query.setParameter("cid", cartId);
		long total= (long) query.getSingleResult();
		return total;
	}
	@Transactional
	@Override
	public CartItems addCartItem(CartItems cartItem) {
		// TODO Auto-generated method stub
		return em.merge(cartItem);
	}
	@Transactional
	@Override
	public void removeCartItem(CartItems cartItem) {
		// TODO Auto-generated method stub
		em.remove(cartItem);

	}

}
