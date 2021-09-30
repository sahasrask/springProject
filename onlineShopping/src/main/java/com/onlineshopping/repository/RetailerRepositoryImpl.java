package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;

@Repository
public class RetailerRepositoryImpl implements RetailerRepository
{
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public void addProducts(Product product) {
		em.merge(product);
	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		Product p=em.find(Product.class, productId);
		em.remove(p);
	}

	@Override
	@Transactional
	public void addRetailer(Retailer retailer) {
		// TODO Auto-generated method stub
		em.merge(retailer);
		
	}

	@Override
	public Retailer getRetailerById(int retailerId) {
		Retailer r=em.find(Retailer.class, retailerId);
		return r;
		
	}

}
