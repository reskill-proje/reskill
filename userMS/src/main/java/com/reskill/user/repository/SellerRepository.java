package com.reskill.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.reskill.user.entity.Seller;

public interface SellerRepository extends CrudRepository<Seller, String> {
	
	public Seller findByPhoneNumber(String phoneNumber);
	
	public Seller findByEmail(String email);
	
	public Seller findBySellerId(String id);

}
