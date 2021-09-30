package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.CartItemsDto;
import com.onlineshopping.dto.UserDto;
import com.onlineshopping.entity.CartItems;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.User;
import com.onlineshopping.service.CartItemsService;
import com.onlineshopping.service.CartService;
import com.onlineshopping.service.ProductService;

@CrossOrigin("*")
@RestController
public class CartItemsController {
@Autowired
CartItemsService cartItemsService;
@Autowired
ProductService productService;
@Autowired
CartService cartService;
@PostMapping(path="/addItem")
public CartItems addCartItem(@RequestBody CartItemsDto dto) {
	try {
		 CartItems item= new CartItems();
		 Product p = new Product();
		 p=productService.getProductById(dto.getProductId());
		 item.setProduct(p);
		 item.setQuantity(dto.getQuantity());
		 item.setCart(cartService.getCartById(dto.getCartId()));
		 cartService.incrementCartQuantity(dto.getCartId());
		 cartService.incrementCartTotalAmount(dto.getCartId(),item.getQuantity()*p.getProductPrice());
		 return cartItemsService.addCartItem(item);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
}
