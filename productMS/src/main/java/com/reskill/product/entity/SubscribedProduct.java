package com.reskill.product.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.reskill.product.utility.NoPK;

@Entity
@Table(name = "subscribed_product")
public class SubscribedProduct {
	
	@EmbeddedId
	private NoPK customId;

	public NoPK getCustomId() {
		return customId;
	}

	public void setCustomId(NoPK customId) {
		this.customId = customId;
	}
	
	

}
