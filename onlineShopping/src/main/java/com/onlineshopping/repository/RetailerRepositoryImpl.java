package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;

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
	public Retailer addRetailer(Retailer retailer) {
		return em.merge(retailer);
	}

	@Override
	public Retailer getRetailerById(int retailerId) {
		Retailer r=em.find(Retailer.class, retailerId);
		return r;
		
	}

	@Override
	public Retailer loginRetailer(String email, String password) {
		String jpql="select r from Retailer r where r.retailerEmail=:em and r.retailerPassword=:pwd";
		Query query=em.createQuery(jpql);
		query.setParameter("em", email);
		query.setParameter("pwd", password);
		Retailer r;
		r= (Retailer) query.getSingleResult();
		//User u =em.find(User.class, email);
		return r;
	}

}
