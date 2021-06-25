package com.reskill.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.reskill.order.entity.ProductsOrdered;
import com.reskill.order.utility.NoPk;


public interface ProductsOrderedRepository extends CrudRepository<ProductsOrdered, NoPk>{

}
