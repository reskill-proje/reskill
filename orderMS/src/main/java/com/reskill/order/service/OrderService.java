package com.reskill.order.service;


import java.util.List;

import com.reskill.order.DTO.CartDTO;
import com.reskill.order.DTO.OrderDTO;
import com.reskill.order.DTO.OrderedPlacedDTO;
import com.reskill.order.DTO.ProductDTO;
import com.reskill.order.exception.OrderException;



public interface OrderService {
	
	public List<OrderDTO> viewAllOrders() throws OrderException;

	public OrderedPlacedDTO placeOrder(List<ProductDTO> productList, List<CartDTO> cartList, OrderDTO order) throws OrderException;

	public List<OrderDTO> viewOrdersByBuyer(String buyerId)throws OrderException;

	public OrderDTO viewOrder(String orderId) throws OrderException;

	public String reOrder(String buyerId, String orderId) throws OrderException;



}
