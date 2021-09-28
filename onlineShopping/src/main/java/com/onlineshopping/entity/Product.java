package com.onlineshopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {
	
	@Id
	@SequenceGenerator(name="product_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_seq")
	int productId;
	String productName;
	int productRating;
	int quantity;
	String description;
	int productQuantity;
	String productDescription;
	String imageURL;
	String productCategory;
	int productPrice;
	

	@ManyToOne
	@JoinColumn(name="orderId")
	Order order;
	
	
	@ManyToOne
	@JoinColumn(name="cartId")
	Cart cart;
	
	
	@ManyToOne
	@JoinColumn(name="retailerId")
	Retailer retailer;
	
	

	public Product() {
	}


	public Product(int productId, String productName, int productRating, int productQunatity, String productDescription,
			String imageURL, String productCategory, int productPrice, Order order, Cart cart, Retailer retailer) {
		this.productId = productId;
		this.productName = productName;
		this.productRating = productRating;
		this.productQuantity = productQunatity;
		this.productDescription = productDescription;
		this.imageURL = imageURL;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.order = order;
		this.cart = cart;
		this.retailer = retailer;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductRating() {
		return productRating;
	}


	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}


	public int getProductQunatity() {
		return productQuantity;
	}


	public void setProductQunatity(int productQunatity) {
		this.productQuantity = productQunatity;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public String getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}


	public Retailer getRetailer() {
		return retailer;
	}


	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}

	
	
	
	
	
	
}
