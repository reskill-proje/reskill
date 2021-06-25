package com.reskill.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.reskill.product.entity.SubscribedProduct;
import com.reskill.product.utility.NoPK;

public interface SubscribedProductRepository extends CrudRepository<SubscribedProduct, NoPK> {
	
	

}
