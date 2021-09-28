package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.onlineshopping.entity.Cart;

public class CartRepositoryImpl implements CartRepository{
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public Cart addProductToCart(Cart cart) {
		Cart persistedPerson=em.merge(cart);
		return null;
	}


	public void deleteProductsFromCart(int cartId) {
		String jpql="delete c from Cart c where c.cartId=:cid";
		Query query=em.createQuery(jpql);
		query.setParameter("cid", cartId);
	}

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

}
