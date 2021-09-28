package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.User;

public interface UserService {
	User RegisterUser(User user);
	public boolean loginUser(String email, String password);
	User updateUser(User user);
	User findUserByUserId(int userId);
	public boolean resetUserPassword(int userId,String password);
	boolean deleteUserById(int userId);
	List<Order> getOrdersByUserId(int userId);

}
