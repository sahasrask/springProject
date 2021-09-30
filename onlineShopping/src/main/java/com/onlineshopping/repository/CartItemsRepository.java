package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.CartItems;

public interface CartItemsRepository {
	List<CartItems> getAllCartItems(int cartId);
	long getCartTotal(int cartId);
	CartItems addCartItem(CartItems cartItem);
	void removeCartItem(int cartItemId);
	void emptyCart(int cartId);
}
