package com.onlineshopping.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartItems implements Serializable {
@Id
@SequenceGenerator(name="cart_items_seq",initialValue = 1,allocationSize = 1)
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cart_items_seq")
int cartItemId;
int quantity;
@OneToOne
@JoinColumn(name="productId")
Product product;
@ManyToOne
@JsonIgnore
@JoinColumn(name="cartId")
Cart cart;
public int getCartItemId() {
	return cartItemId;
}
public void setCartItemId(int cartItemId) {
	this.cartItemId = cartItemId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}


}
