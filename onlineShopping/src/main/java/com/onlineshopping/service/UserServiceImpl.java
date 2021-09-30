package com.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.User;
import com.onlineshopping.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repository;
	
	@Override
	public User registerUser(User user) {		
		return repository.registerUser(user);
	}

	@Override
	public User loginUser(String email, String password) {
		return repository.loginUser(email, password);
	}

	@Override
	public User updateUser(User user) {
		
		return repository.updateUser(user);
	}

	@Override
	public User findUserByUserId(int userId) {
		
		return repository.findUserByUserId(userId);
	}

	@Override
	public boolean resetUserPassword(int userId, String password) {
		
		return repository.resetUserPassword(userId, password);
	}

	@Override
	public boolean deleteUserById(int userId) {
		
		return repository.deleteUserById(userId);
	}

	@Override
	public List<Order> getOrdersByUserId(int userId) {
		
		return repository.getOrdersByUserId(userId);
	}

}
