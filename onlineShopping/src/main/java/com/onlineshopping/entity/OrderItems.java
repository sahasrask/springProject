package com.onlineshopping.entity;

import java.util.List;

import javax.persistence.CascadeType;
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
public class OrderItems {
	
	@Id
	@SequenceGenerator(name="order_items_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_items_seq")
	int orderItemId;
	int orderQuantity;
	
	@OneToOne
	@JoinColumn(name="productId")
	Product product;
//	@OneToOne(mappedBy = "orderItem",cascade = CascadeType.ALL)
//	CartItems cartItem;
	
	@ManyToOne
	@JsonIgnore
	Order order;

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	
//
//	public CartItems getCartItem() {
//		return cartItem;
//	}
//
//	public void setCartItem(CartItems cartItem) {
//		this.cartItem = cartItem;
//	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
