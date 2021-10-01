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

@Entity
public class Order {
	
	@Id
	@SequenceGenerator(name="order_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_seq")
	int orderId;
	double totalOrderAmount;
	OrderStatus orderStatus;


	
//	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
//	List<Product> products;
	
	@ManyToOne
	@JoinColumn(name="userId")
	User user;
	
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	List<OrderItems> orderItems;

	
	
	public Order() {
		super();
	}

	

	public Order(int orderId, double totalOrderAmount, OrderStatus orderStatus, User user,
			List<OrderItems> orderItems) {
		super();
		this.orderId = orderId;
		this.totalOrderAmount = totalOrderAmount;
		this.orderStatus = orderStatus;
		this.user = user;
		this.orderItems = orderItems;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotalOrderAmount() {
		return totalOrderAmount;
	}

	public void setTotalOrderAmount(double totalOrderAmount) {
		this.totalOrderAmount = totalOrderAmount;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

//	public List<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	public List<OrderItems> getOrderItems() {
		return orderItems;
	}



	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}

	
}
