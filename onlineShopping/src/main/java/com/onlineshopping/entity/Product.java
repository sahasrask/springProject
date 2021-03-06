package com.onlineshopping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@NamedQuery(name="fetch-all", query="select p from Product p")
public class Product {
	
	@Id
	@SequenceGenerator(name="product_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_seq")
	int productId;
	String productName;
	int productQuantity;
	double productRating;
	String productDescription;
	String productImageURL;
	String productCategory;
	double productPrice;
	boolean adminApproval;
	
//	@ManyToOne
//	@JoinColumn(name="orderId")
//	Order order;	
//	
	@OneToOne(mappedBy = "product")
	@JsonIgnore
	@JoinColumn
	CartItems cartItems;
	
	@OneToOne(mappedBy = "product")
	@JsonIgnore
	@JoinColumn
	OrderItems orderItems;
	
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="retailerId")
	Retailer retailer;
		
	public Product() {}

	public Product(int productId, String productName, int productQuantity, double productRating, String productDescription,
			String productImageURL, String productCategory, double productPrice //, Order order, Cart cart
			) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productRating = productRating;
		this.productDescription = productDescription;
		this.productImageURL = productImageURL;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.adminApproval=false;
//		this.order = order;
//		this.cart = cart;
//		this.retailer = retailer;
	}
	
	public boolean isAdminApproval() {
		return adminApproval;
	}

	public void setAdminApproval(boolean adminApproval) {
		this.adminApproval = adminApproval;
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

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductRating() {
		return productRating;
	}

	public void setProductRating(double productRating) {
		this.productRating = productRating;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductImageURL() {
		return productImageURL;
	}

	public void setProductImageURL(String productImageURL) {
		this.productImageURL = productImageURL;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public CartItems getCartItems() {
		return cartItems;
	}

	public void setCartItems(CartItems cartItems) {
		this.cartItems = cartItems;
	}

	public Retailer getRetailer() {
		return retailer;
	}

	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}

//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}
//
	
//	public Retailer getRetailer() {
//		return retailer;
//	}
//
//	public void setRetailer(Retailer retailer) {
//		this.retailer = retailer;
//	}
	
	
}
