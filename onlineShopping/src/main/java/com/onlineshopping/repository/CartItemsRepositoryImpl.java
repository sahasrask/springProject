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
		String jpql="select c from CartItems c where c.cart.cartId=:cid";
		Query query= em.createQuery(jpql);
		query.setParameter("cid", cartId);
		List<CartItems> items= query.getResultList();
		return items;
	}

	@Override
	public long getCartTotal(int cartId) {
		String jpql="select sum(c.product.productPrice) from CartItems c where c.cart.cartId=:cid";
		Query query= em.createQuery(jpql);
		query.setParameter("cid", cartId);
		long total= (long) query.getSingleResult();
		return total;
	}

	@Transactional
	@Override
	public CartItems addCartItem(CartItems cartItem) {
		return em.merge(cartItem);
	}

	@Override
	@Transactional
	public void removeCartItem(int cartItemId) {
		CartItems c=em.find(CartItems.class, cartItemId);
		em.remove(c);
	}

	@Override
	@Transactional
	public void emptyCart(int cartId) {
		String jpql="delete from CartItems c where c.cart.cartId=:cid";
		Query query= em.createQuery(jpql);
		query.setParameter("cid", cartId);
		query.executeUpdate();
	}

	@Override
	public int getThisCart(int cartItemId) {
		// TODO Auto-generated method stub
		String jpql="select c.cart.cartId from CartItems c where cartItemId=:ciid";
		Query query= em.createQuery(jpql);
		query.setParameter("ciid", cartItemId);
		return (int) query.getSingleResult();
	}

	@Override
	public CartItems getCartItemById(int cartItemId) {
		// TODO Auto-generated method stub
		return em.find(CartItems.class, cartItemId);
	}

}
