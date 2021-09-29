package com.onlineshopping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Cart {
	
	@Id
	@SequenceGenerator(name="cart_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cart_seq")
	int cartId;
	int cartQuantity;
	int cartTotalAmount;
//	List<Integer> productIds;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	User user;
	@OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
	List<CartItems> cartItems;
		
	public Cart() {
		super();
	}

	public Cart(int cartId, int cartQuantity, int cartTotalAmount, User user//, List<Product> products
			) {
		this.cartId = cartId;
		this.cartQuantity = cartQuantity;
		this.cartTotalAmount = cartTotalAmount;
		this.user = user;
//		this.products = products;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CartItems> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItems> cartItems) {
		this.cartItems = cartItems;
	}

//	public List<Integer> getProductIds() {
//		return productIds;
//	}
//
//	public void setProductIds(List<Integer> productIds) {
//		this.productIds = productIds;
//	}
	
//	public List<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}	
//	
	
}
