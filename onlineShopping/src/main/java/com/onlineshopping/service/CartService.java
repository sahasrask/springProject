package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.Cart;

public interface CartService {
	Cart addProductToCart(Cart cart);
	void deleteProductsFromCart(int cartId);
	//List<Product> checkOut(List<Product> products);
	List<Cart> viewAllProductsInCart();

}
