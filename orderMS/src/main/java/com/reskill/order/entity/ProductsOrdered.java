package com.reskill.order.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.reskill.order.utility.NoPk;



@Entity
@Table(name = "products_ordered")
public class ProductsOrdered {
	
	@EmbeddedId
	private NoPk noPrimaryKeys;
	
	private String sellerId;	
	private Integer quantity;
	public NoPk getNoPrimaryKeys() {
		return noPrimaryKeys;
	}
	public void setNoPrimaryKeys(NoPk noPrimaryKeys) {
		this.noPrimaryKeys = noPrimaryKeys;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
