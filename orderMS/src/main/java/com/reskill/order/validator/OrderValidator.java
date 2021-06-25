package com.reskill.order.validator;

import com.reskill.order.DTO.CartDTO;
import com.reskill.order.DTO.OrderDTO;
import com.reskill.order.DTO.ProductDTO;
import com.reskill.order.exception.OrderException;

public class OrderValidator {
	
	public static void validateOrder(OrderDTO order) throws OrderException {
		
		//Address must be within 100 characters
		if(!validateAddress(order.getAddress()))
			throw new OrderException("Invalid number of address characters.");		
		
	}
	
	public static void validateStock(CartDTO cart, ProductDTO product) throws OrderException {
				
		//Check if the required quantity of product is available in the stock
		if(!validateStock(product.getStock(),cart.getQuantity()))
			throw new OrderException("Insufficient stock");	
	}
	
	
	private static boolean validateAddress(String address) {		
		return (address.length()>0 &&address.length()<100);		
	}
	
	private static boolean validateStock(Integer stock, Integer quantity) {		
		return stock>=quantity;		
	}
}

