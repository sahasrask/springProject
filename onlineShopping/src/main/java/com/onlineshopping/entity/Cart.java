package com.onlineshopping.entity;

import java.io.Serializable;
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

import org.hibernate.engine.jdbc.SerializableBlobProxy;
import org.hibernate.type.SerializableType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cart implements Serializable{
	
	@Id
	@SequenceGenerator(name="cart_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cart_seq")
	int cartId;
	int cartQuantity;
	double cartTotalAmount;
//	List<Integer> productIds;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	User user;
	@OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
	@JsonIgnore
	List<CartItems> cartItems;
		
	public Cart() {
		
	}

	public Cart(int cartId, int cartQuantity, int cartTotalAmount, User user//, List<Product> products
			) {
		this.cartId = cartId;
		this.cartQuantity = cartQuantity;
		this.cartTotalAmount = cartTotalAmount;
		this.user = user;
		//this.products = products;
	}


	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getCartQuantity() {
		return this.cartQuantity;
	}

	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}

	public double getCartTotalAmount() {
		return this.cartTotalAmount;
	}

	public void setCartTotalAmount(double cartTotalAmount) {
		this.cartTotalAmount = cartTotalAmount;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CartItems> getCartItems() {
		return this.cartItems;
	}

	public void setCartItems(List<CartItems> cartItems) {
		this.cartItems = cartItems;
	}

	
}
