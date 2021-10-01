package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.Product;

public interface CartRepository {
	List<Cart> viewAllProductsInCart();
	Cart addCartForaUser();
	Cart getCartById(int cartId);
	Cart incrementCartQuantity(int cartId);
	Cart incrementCartTotalAmount(int cartId,double amount);
	int getCartIdByUserId(int userId);
	Cart updateCart(Cart c);
	void emptyCart(int cartId);
}
 	 	