package com.onlineshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onlineshopping.entity.Order;
import com.onlineshopping.entity.OrderStatus;
import com.onlineshopping.repository.OrderRepository;
import com.onlineshopping.repository.OrderRepositoryImpl;

@SpringBootApplication
public class OnlineShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingApplication.class, args);
		/*
		 * OrderRepository repository= new OrderRepositoryImpl(); Order order= new
		 * Order(); order.setOrderStatus(OrderStatus.APPROVED);
		 * repository.createOrder(order);
		 */
		}

}
