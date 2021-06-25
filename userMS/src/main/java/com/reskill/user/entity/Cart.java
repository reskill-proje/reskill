package com.reskill.user.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.reskill.user.utility.NoPK;

@Entity
@Table(name = "cart")
public class Cart {
	
	@EmbeddedId
	private NoPK customPK;
	
	private Integer quantity;

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public NoPK getCustomPK() {
		return customPK;
	}

	public void setCustomPK(NoPK customPK) {
		this.customPK = customPK;
	}

		
	
}