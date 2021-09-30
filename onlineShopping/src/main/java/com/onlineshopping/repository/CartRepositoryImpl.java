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
	
	

//	public List<Product> checkOut(List<Product> products) {
//		// TODO Auto-generated method stub
//		return null;
//	}

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
	public Cart incrementCartQuantity(int cartId) {
		// TODO Auto-generated method stub
		Cart c = em.find(Cart.class, cartId);
		c.setCartQuantity(c.getCartQuantity()+1);
		return null;
	}



	@Override
	public Cart incrementCartTotalAmount(int cartId,double amount) {
		// TODO Auto-generated method stub
		Cart c = em.find(Cart.class, cartId);
		c.setCartTotalAmount(c.getCartTotalAmount()+amount);
		return null;
	}



}
