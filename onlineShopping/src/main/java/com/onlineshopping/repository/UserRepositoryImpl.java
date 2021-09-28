package com.onlineshopping.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@PersistenceContext
	EntityManager em;
	@Override
	public User RegisterUser(User user) {
		User persistedUser = em.merge(user);
		return persistedUser;
	}

	@Override
	public boolean loginUser(String email, String password){
		
		String jpql="select count(u) from User u where u.email=:em and u.password=:pwd";
		Query query=em.createQuery(jpql);
		query.setParameter("em", email);
		query.setParameter("pwd", password);
		Long count=(Long)query.getSingleResult();
		
		return count>0?true:false;
	}

	@Override
	public User updateUser(User user) {
		
		User u=em.merge(user);
		return u;
	}

	@Override
	public User findUserByUserId(int userId) {
		User u=em.find(User.class, userId);
		return u;
	}

	@Override
	public boolean resetUserPassword(int userId,String password) {
		String jpql="update User u set u.password=:pwd where u.userId=:userId ";
		Query query=em.createQuery(jpql);
		query.setParameter("pwd", password);
		query.setParameter("userId", userId);
        Long count=(Long)query.getSingleResult();
		
		return count>0?true:false;
	}

	@Override
	public boolean deleteUserById(int userId) {
		String jpql="delete from User u where u.userId=:userId";
		Query query=em.createQuery(jpql);
		query.setParameter("userId", userId);
        Long count=(Long)query.getSingleResult();
		
		return count>0?true:false;
	}

	@Override
	public List<Order> getOrdersByUserId(int userId) {
		User u=em.find(User.class, userId);
		 return u.getOrders();
	
	}

}
