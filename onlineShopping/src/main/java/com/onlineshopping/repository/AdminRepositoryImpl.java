package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.onlineshopping.entity.Admin;
import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.Product;
import com.onlineshopping.entity.Retailer;
import com.onlineshopping.entity.User;

@Repository
public class AdminRepositoryImpl implements AdminRepository{
	
	@PersistenceContext
	EntityManager em;

	@Transactional
	public void addOrUpdateAdmin(Admin admin) {
		em.merge(admin);  //persistence state
		
	}
	
	public List<User> viewAllUsers() {
		String jpql="select a from Admin a.user.User";
		Query query= em.createQuery(jpql);
		List<User> users= query.getResultList();
		return users;
	}

	public User findUserByUserId(int userId) {
		User u=em.find(User.class, userId);
		return u;
	}


	@Transactional
	public void addProduct(Product product) {
		em.merge(product);
	}

	public List<Product> viewAllProducts() {
		String jpql="select p from Product p";
		Query query= em.createQuery(jpql);
		List<Product> product= query.getResultList();
		return product;
	}

	public Product findProductById(int productId) {
		Product p=em.find(Product.class, productId);
		return p;
	}

//	public void deleteProducts(Product productId) {
//		String jpql="delete a from Admin a where a.product.productId=:pid";
//		Query query=em.createQuery(jpql);
//		query.setParameter("pid", productId);
//		
//	}
	
//	@Transactional
//	public Retailer addRetailer(Retailer retailer) {
//		Retailer persistedRetailer=em.merge(retailer);  
//		return persistedRetailer;
//	}
//
//	public void deleteRetailer(Retailer retailer) {
//		em.remove(retailer);
//		
//	}

//	public List<Order> viewOrders() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
//	public Product updateProductPrice(int productId,int productPrice) {
//		String jpql="update Product p set productPrice=:price where ProductId=:pid";
//		Query query=em.createQuery(jpql);
//		query.setParameter("price", productPrice);
//		query.setParameter("pid", productId);
//		Product p=(Product) query.getResultList();
//		return p;
//	} 



//	@Override
//	public List<Order> viewOrders(User user) {
//		
//		return null;
//	}

//	@Override
//	public List<Retailer> viewAllRetailers() {
//		String jpql="select r from Retailer r";
//		Query query= em.createQuery(jpql);
//		List<Retailer> retailer= query.getResultList();
//		return retailer;
//	}
//
//	@Override
//	public Retailer findRetailerByRetailerId(int retailerId) {
//		Retailer r=em.find(Retailer.class, retailerId);
//		return r;

	}


