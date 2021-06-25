package com.reskill.user.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.reskill.user.utility.NoPK;

@Entity
@Table(name = "wishlist")
public class Wishlist {
	
	@EmbeddedId
	private NoPK customId;

	public NoPK getCustomId() {
		return customId;
	}

	public void setCustomId(NoPK customId) {
		this.customId = customId;
	}

}