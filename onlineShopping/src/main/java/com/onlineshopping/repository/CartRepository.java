package com.onlineshopping.repository;

import java.util.List;

import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.Product;

public interface CartRepository {
	Cart addProductToCart(Cart cart);
	void deleteProductsFromCart(int cartId);
	//List<Product> checkOut(List<Product> products);
	List<Cart> viewAllProductsInCart();

	Cart addCartForaUser();
	Cart getCartById(int cartId);
	Cart incrementCartQuantity(int cartId);
	Cart incrementCartTotalAmount(int cartId,double amount);
	
}
 	 	