package com.onlineshopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.CartDto;
import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.Product;
import com.onlineshopping.service.CartService;

@RestController
@CrossOrigin
public class CartController {
	@Autowired
	CartService cartService;

	@PostMapping(path = "/addProductTocart")
	public Cart addProductToCart(@RequestBody CartDto cartDto) {
		try {
			Cart c = new Cart();
			c.setCartQuantity(cartDto.getCartQuantity());
			c.setCartTotalAmount(cartDto.getCartTotalAmount());

			return cartService.addProductToCart(c);
		} catch (Exception e) {
			System.out.println("Error!");
		}

		return null;

	}

	@PostMapping(path = "/removeFromCart")
	public void deleteProductsFromCart(@RequestBody Cart cart) {
		try {
			cartService.deleteProductsFromCart(cart.getCartId());
			System.out.println("User deleted Successfully");
		} catch (Exception e) {
			System.out.println("Error!");
		}

	}

	@GetMapping("/viewAllProductsInCart")
	public List<Cart> viewAllProductsInCart(@RequestBody CartDto cartDto,HttpServletRequest request) {
		List<Cart> c= cartService.viewAllProductsInCart();
		return c;

	}
}
