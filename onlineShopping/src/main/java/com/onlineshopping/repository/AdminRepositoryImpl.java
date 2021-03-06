package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Cart;
import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;

@Repository
public class AdminRepositoryImpl implements AdminRepository{
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public List<Retailer> viewAllRetailers() {
		String jpql="select r from Retailer r";
		Query query= em.createQuery(jpql);
		List<Retailer> retailers= query.getResultList();
		return retailers;
	}

	@Override
	public boolean approveRetailer(int retailerId) {
		boolean r=em.find(Retailer.class, retailerId).adminApproval=true;
		return r;
	}

	@Override
	public Retailer findRetailerById(int retailerId) {
		Retailer r=em.find(Retailer.class,retailerId);
		return r;
	}

	@Override
	@Transactional
	public Admin loginAdmin(String email, String password) {
		Admin a=null;
		String jpql="select a from Admin a where a.adminEmail=:em and a.adminPassword=:pwd";
		Query query=em.createQuery(jpql);
		query.setParameter("em", email);
		query.setParameter("pwd", password);
		a = (Admin) query.getSingleResult();
		return a;
		
//		try {
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return null;
	}

}


