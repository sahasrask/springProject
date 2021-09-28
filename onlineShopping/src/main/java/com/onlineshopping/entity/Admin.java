package com.onlineshopping.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Admin {
	
	@Id
	@SequenceGenerator(name="admin_seq",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "admin_seq")
	int adminId;
	String adminFirstName;
	String adminLastName;
	String adminMobileNumber;
	String adminEmail;
	String adminPassword;
	
	
	
	
	
	public Admin() {
		super();
	}
	public Admin(int adminId, String adminFirstName, String adminLastName, String adminMobileNumber, String adminEmail,
			String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminMobileNumber = adminMobileNumber;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminFirstName() {
		return adminFirstName;
	}
	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}
	public String getAdminLastName() {
		return adminLastName;
	}
	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}
	public String getAdminMobileNumber() {
		return adminMobileNumber;
	}
	public void setAdminMobileNumber(String adminMobileNumber) {
		this.adminMobileNumber = adminMobileNumber;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
//	@OneToMany
//	List<User> user;
	
	
	
	
	
	
	

}
