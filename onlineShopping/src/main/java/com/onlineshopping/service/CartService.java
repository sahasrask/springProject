package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.Cart;

public interface CartService {
	List<Cart> viewAllProductsInCart();
	Cart addCartForaUser();
	Cart getCartById(int cartId);
	Cart incrementCartQuantity(int cartId);
	Cart incrementCartTotalAmount(int cartId,double amount);
	

}
