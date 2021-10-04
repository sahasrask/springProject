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
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Retailer 
{
	@Id
	@SequenceGenerator(name="ret_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ret_seq")
	int retailerId;
	String retailerName;
	String retailerEmail;
	String retailerPassword;
	public boolean adminApproval=false; 
	
	
	@OneToMany(mappedBy = "retailer",cascade = CascadeType.ALL)
	@JsonIgnore
	List<Product> product;
	
	@ManyToOne
	@JoinColumn(name="adminId")
	Admin admin;
	
	
	public Retailer() {
		super();
	}

	
	public Retailer(int retailerId, String retailerName, String retailerEmail, String retailerPassword,
			boolean adminApproval, List<Product> product, Admin admin) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.retailerEmail = retailerEmail;
		this.retailerPassword = retailerPassword;
		this.adminApproval = adminApproval;
		this.product = product;
		this.admin = admin;
	}




	public int getRetailerId() {
		return retailerId;
	}


	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}


	public String getRetailerName() {
		return retailerName;
	}


	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}


	public String getRetailerEmail() {
		return retailerEmail;
	}


	public void setRetailerEmail(String retailerEmail) {
		this.retailerEmail = retailerEmail;
	}


	public String getRetailerPassword() {
		return retailerPassword;
	}


	public void setRetailerPassword(String retailerPassword) {
		this.retailerPassword = retailerPassword;
	}


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
	this.product = product;
	}


	public boolean isAdminApproval() {
		return adminApproval;
	}


	public void setAdminApproval(boolean adminApproval) {
		this.adminApproval = adminApproval;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
	
	

}
