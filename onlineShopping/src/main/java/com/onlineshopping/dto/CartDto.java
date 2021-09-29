package com.onlineshopping.dto;

import java.util.List;

import com.onlineshopping.entity.Product;

public class CartDto {
	int cartQuantity;
	int cartTotalAmount;
	int productid;
	
	public int getCartQuantity() {
		return cartQuantity;
	}
	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}
	public int getCartTotalAmount() {
		return cartTotalAmount;
	}
	public void setCartTotalAmount(int cartTotalAmount) {
		this.cartTotalAmount = cartTotalAmount;
	}
//	public List<Integer> getProductIds() {
//		return productIds;
//	}
//	public void setProductIds(List<Integer> productIds) {
//		this.productIds = productIds;
//	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}

	
}
