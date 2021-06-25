package com.reskill.order.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.reskill.order.entity.Order;


public interface OrderRepository extends CrudRepository<Order, String>{

	public List<Order> findByBuyerId(String buyerId);

	public Optional<Order> findByOrderId(String orderId);

}

