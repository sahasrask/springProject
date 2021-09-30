package com.onlineshopping.dto;

public class RetailerDto {
	
	String retailerName;
	String retailerEmail;
	String retailerPassword;
	public boolean adminApproval=false;
	
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
	public boolean isAdminApproval() {
		return adminApproval;
	}
	public void setAdminApproval(boolean adminApproval) {
		this.adminApproval = adminApproval;
	} 
	
	
}
