package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.onlineshopping.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public int saveProduct(Product product) {
		Product p=em.merge(product);		
		return p.getProductId();
	}

	@Override
	public Product findProductById(int productId) {
		return em.find(Product.class, productId);
	}

	@Override
	@Transactional
	public List<Product> viewAllProducts() {
		return em.createNamedQuery("fetch-all").getResultList();
	}

	@Override
	public List<Product> viewProductsByCategory(String productCategory) {
	   return em.createQuery("select p from Product p where p.productCategory=:category")
			   .setParameter("category", productCategory)
			   .getResultList();
	}

	@Override
	public List<Product> viewProductByPrice(double productPrice) {
		return (List<Product>) em.createQuery("select p from Product p where p.productPrice <=: price")
				   .setParameter("price", productPrice)
				   .getResultList();
	}

	@Override
	public List<Product> viewProductsByRating(double productRating) {
		return (List<Product>) em.createQuery("select p from Product p where p.productRating=: rating")
				   .setParameter("rating", productRating)
				   .getResultList();
	}

}
