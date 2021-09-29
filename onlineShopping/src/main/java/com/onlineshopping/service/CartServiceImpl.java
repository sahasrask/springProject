package com.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlineshopping.entity.Cart;
import com.onlineshopping.repository.CartRepository;

@Component
public class CartServiceImpl implements CartService {
	@Autowired
	CartRepository repository;
	
	@Override
	public Cart addProductToCart(Cart cart) {
		return repository.addProductToCart(cart);
	}

	@Override
	public void deleteProductsFromCart(int cartId) {
		repository.deleteProductsFromCart(cartId);

	}

	@Override
	public List<Cart> viewAllProductsInCart() {
		
		return repository.viewAllProductsInCart();
	}

}
