package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.User;

@Repository
public class CartRepositoryImpl implements CartRepository{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Cart> viewAllProductsInCart() {
		String jpql="select c from Cart c ";
		Query query= em.createQuery(jpql);
		List<Cart> users= query.getResultList();
		return users;
	}


	@Override
	public Cart addCartForaUser() {
		Cart cart =new Cart();
		cart.setCartQuantity(0);
		cart.setCartTotalAmount(0);
		return cart;
	}



	@Override
	public Cart getCartById(int cartId) {
		// TODO Auto-generated method stub
		return em.find(Cart.class,cartId);
	}


	@Override
	@Transactional
	public Cart incrementCartQuantity(int cartId) {
		Cart c = em.find(Cart.class, cartId);
		System.out.println("Cart=" +c);
		c.setCartQuantity(c.getCartQuantity()+1);
		return c;
	}



	@Override
	@Transactional
	public Cart incrementCartTotalAmount(int cartId,double amount) {
		Cart c = em.find(Cart.class, cartId);
		c.setCartTotalAmount(c.getCartTotalAmount()+amount);
		return c;
	}


	@Override
	public int getCartIdByUserId(int userId) {
		String jpql="select c.cartId from Cart c where c.user.user_id=:id";
		Query query= em.createQuery(jpql);
		query.setParameter("id", userId);
		int cart_id=(int) query.getSingleResult();
		return cart_id;
	}



}
