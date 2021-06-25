package com.reskill.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.reskill.user.entity.Wishlist;
import com.reskill.user.utility.NoPK;


public interface WishlistRepository extends CrudRepository<Wishlist, NoPK> {

}