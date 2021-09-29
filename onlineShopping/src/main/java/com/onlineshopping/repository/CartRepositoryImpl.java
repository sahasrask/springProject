package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.onlineshopping.entity.Cart;

@Repository
public class CartRepositoryImpl implements CartRepository{
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public Cart addProductToCart(Cart cart) {
		Cart c=em.merge(cart);
		return c;
	}

	@Transactional
	public void deleteProductsFromCart(int cartId) {
		
		em.remove(em.find(Cart.class, cartId));
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
