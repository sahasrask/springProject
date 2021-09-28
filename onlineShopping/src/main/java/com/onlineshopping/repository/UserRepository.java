package com.onlineshopping.repository;

import com.onlineshopping.entity.User;

public interface UserRepository {
	User RegisterUser(User user);
	User LoginUser(User user);
	User updateUser(User user);
	User findUserByUserId(int userId);
	User resetUserPassword(User userId);
	User deleteUserById(int userId);
}
