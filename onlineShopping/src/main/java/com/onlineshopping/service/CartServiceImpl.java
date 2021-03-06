package com.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshopping.entity.Cart;
import com.onlineshopping.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	CartRepository repository;

	@Override
	public List<Cart> viewAllProductsInCart() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	@Override
	public Cart addCartForaUser() {
		// TODO Auto-generated method stub
		return repository.addCartForaUser();
	}
	
	@Override
	public Cart getCartById(int cartId) {
		// TODO Auto-generated method stub
		return repository.getCartById(cartId);
	}
	
	@Override
	public Cart incrementCartQuantity(int cartId) {
		// TODO Auto-generated method stub
		return repository.incrementCartQuantity(cartId);
	}
	
	@Override
	public Cart incrementCartTotalAmount(int cartId, double amount) {
		// TODO Auto-generated method stub
		return repository.incrementCartTotalAmount(cartId, amount);
	}
	
	@Transactional
	@Override
	public int getCardIdByUserId(int userId) {
		return repository.getCartIdByUserId(userId);
	}

	@Override
	public Cart updateCart(Cart c) {
		// TODO Auto-generated method stub
		return repository.updateCart(c);
	}

	@Override
	public void emptyCart(int cartId) {
		// TODO Auto-generated method stub
		repository.emptyCart(cartId);
		
	}
	
	
}
