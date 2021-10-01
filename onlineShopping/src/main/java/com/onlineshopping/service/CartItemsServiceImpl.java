package com.onlineshopping.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.CartItems;
import com.onlineshopping.repository.CartItemsRepository;
@Service
public class CartItemsServiceImpl implements CartItemsService {
	@Autowired
	private CartItemsRepository repository;

	@Override
	public List<CartItems> getAllCartItems(int cartId) {
		return repository.getAllCartItems(cartId);
	}

	@Override
	public long getCartTotal(int cartId) {
		return repository.getCartTotal(cartId);
	}

	@Override
	public CartItems addCartItem(CartItems cartItem) {
		return repository.addCartItem(cartItem);
	}

	@Override
	public void removeCartItem(int cartItemId) {
		repository.removeCartItem(cartItemId);		
	}

	@Override
	public void emptyCart(int cartId) {
		repository.emptyCart(cartId);		
	}

	@Override
	public int getThisCart(int cartItemId) {
		// TODO Auto-generated method stub
		return repository.getThisCart(cartItemId);
	}

	@Override
	public CartItems getCartItemById(int cartItemId) {
		// TODO Auto-generated method stub
		return repository.getCartItemById(cartItemId);
	}

}
