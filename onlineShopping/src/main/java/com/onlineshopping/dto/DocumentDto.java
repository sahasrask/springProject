package com.onlineshopping.dto;

import org.springframework.web.multipart.MultipartFile;

public class DocumentDto {
	private int retailerId;
	private MultipartFile productImage;
	public int getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	public MultipartFile getProductImage() {
		return productImage;
	}
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
	
	
	
}