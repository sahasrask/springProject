package com.onlineshopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.CartItemsDto;
import com.onlineshopping.dto.UserDto;
import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.CartItems;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.User;
import com.onlineshopping.service.CartItemsService;
import com.onlineshopping.service.CartService;
import com.onlineshopping.service.ProductService;

@RestController
@CrossOrigin("*")
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


@GetMapping("/viewAllCartItems")
public List<CartItems> viewAllProductsInCart(@RequestParam("cartId") int cartid,HttpServletRequest request) {
	List<CartItems> c= cartItemsService.getAllCartItems(cartid);
	return c;
}

@PostMapping("/emptyCart")
public void emptyCart(@RequestParam("cartId") int cartid,HttpServletRequest request) {
	cartItemsService.emptyCart(cartid);		
}

@PostMapping("/removeCartItem")
public void removeCartItem(@RequestParam("cartItemId") int cartItemId,HttpServletRequest request) {
	cartItemsService.removeCartItem(cartItemId);		
}


}
