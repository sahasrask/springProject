package com.onlineshopping.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.dto.ProductDto;
import com.onlineshopping.entity.Product;
import com.onlineshopping.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(path="/addProduct")
	public int add(@RequestBody ProductDto productDto) {
		try {	
			Product p=new Product();
			p.setProductName(productDto.getProductName());
			p.setProductQuantity(productDto.getProductQuantity());
			p.setProductDescription(productDto.getProductDescription());
			p.setProductPrice(productDto.getProductPrice());
			p.setProductRating(productDto.getProductRating());
			p.setProductCategory(productDto.getProductCategory());
			p.setProductImageURL(productDto.getProductImageURL());
			
			return productService.addProduct(p);
		}catch(Exception e) {
			System.out.println("Error!");
		}
		return -1;
	}
	
	@GetMapping(path="/viewAllProducts")
	public List<Product> viewAllProducts(){
		try {
			return productService.viewAllProducts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(path="/viewAllProductsOfRetailer")
	public List<Product> viewAllProductsOfRetailer(@RequestParam("retailerId") int retailerId, HttpServletRequest request){
		try {
			return productService.viewAllProductsOfRetailer(retailerId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(path="/displayProduct")
	public Product displayProduct(@RequestParam("productId") int id, HttpServletRequest request){
		try {
			Product p=productService.getProductById(id);
			//reading the project's deployed folder location
			String projPath = request.getServletContext().getRealPath("/");
			String tempDownloadPath = projPath + "downloads/";
			//creating a folder within the project where we will place the profile pic of the customer getting fetched
			File f = new File(tempDownloadPath);
			if(!f.exists())
				f.mkdir();
			
				String targetFile = tempDownloadPath + p.getProductImageURL().substring(11);
				
				//the original location where the uploaded images are present
				String uploadedImagesPath = "f:/uploads/";
				String sourceFile = uploadedImagesPath + p.getProductImageURL().substring(11);
				System.out.println("sourceFile = "+ sourceFile);
				System.out.println("targetFile = "+ targetFile);
				try {
					FileCopyUtils.copy(new File(sourceFile), new File(targetFile));
				} catch (IOException e) {
					e.printStackTrace();
					//maybe for this customer there is no profile pic
				}
			
			return p;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(path="/viewNotApprovedProducts")
	public List<Product> viewNotApprovedProducts(){
		try {
			return productService.viewNotApprovedProducts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(path="/viewApprovedProducts")
	public List<Product> viewApprovedProducts(HttpServletRequest request){
		try {
			List<Product> products=productService.viewApprovedProducts();
			
			//reading the project's deployed folder location
			String projPath = request.getServletContext().getRealPath("/");
			String tempDownloadPath = projPath + "downloads/";
			//creating a folder within the project where we will place the profile pic of the customer getting fetched
			File f = new File(tempDownloadPath);
			if(!f.exists())
				f.mkdir();
			
			for(Product p: products) {
				String targetFile = tempDownloadPath + p.getProductImageURL().substring(11);
				
				//the original location where the uploaded images are present
				String uploadedImagesPath = "f:/uploads/";
				String sourceFile = uploadedImagesPath + p.getProductImageURL().substring(11);
				System.out.println("sourceFile = "+ sourceFile);
				System.out.println("targetFile = "+ targetFile);
				try {
					FileCopyUtils.copy(new File(sourceFile), new File(targetFile));
				} catch (IOException e) {
					e.printStackTrace();
					//maybe for this customer there is no profile pic
				}
			}
			return products;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping(path="/approveProduct")
	public Product approveProduct(@RequestParam("productId") int id, HttpServletRequest request)
	{
		return productService.approveProduct(id);
	}
	

}
