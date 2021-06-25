package com.reskill.user.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.reskill.user.entity.Cart;
import com.reskill.user.utility.NoPK;

public interface CartRepository extends CrudRepository<Cart, NoPK> {
	
	
	public List<Cart> findByCustomPKBuyerId(String id); 
	
	public void deleteByCustomPKBuyerIdAndCustomPKProdId(String buyId,String prodId);
	
	public Cart findByCustomPKBuyerIdAndCustomPKProdId(String buyId,String ProdId);

}