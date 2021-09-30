package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.CartItems;

public interface CartItemsService {
	List<CartItems> getAllCartItems(int cartId);
	long getCartTotal(int cartId);
	CartItems addCartItem(CartItems cartItem);
	void removeCartItem(CartItems cartItem);

}