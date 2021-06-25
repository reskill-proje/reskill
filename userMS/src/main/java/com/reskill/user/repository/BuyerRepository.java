package com.reskill.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.reskill.user.entity.Buyer;

public interface BuyerRepository extends CrudRepository<Buyer, String> {
	
	public Buyer findByPhoneNumber(String phoneNumber);
	
	public Buyer findByEmail(String email);
	
	public Buyer findByBuyerId(String id);

}