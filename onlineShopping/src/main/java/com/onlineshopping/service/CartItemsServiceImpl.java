package com.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.entity.CartItems;
import com.onlineshopping.repository.CartItemsRepository;
@Service
public class CartItemsServiceImpl implements CartItemsService {
	@Autowired
	private CartItemsRepository repository;
	@Override
	public List<CartItems> getAllCartItems(int cartId) {
		// TODO Auto-generated method stub
		return repository.getAllCartItems(cartId);
	}

	@Override
	public long getCartTotal(int cartId) {
		// TODO Auto-generated method stub
		return repository.getCartTotal(cartId);
	}

	@Override
	public CartItems addCartItem(CartItems cartItem) {
		// TODO Auto-generated method stub
		return repository.addCartItem(cartItem);
	}

	@Override
	public void removeCartItem(CartItems cartItem) {
		// TODO Auto-generated method stub
		repository.removeCartItem(cartItem);
		
	}

}
