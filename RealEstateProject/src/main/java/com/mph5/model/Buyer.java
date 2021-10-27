package com.mph5.model;

<<<<<<< HEAD

import javax.persistence.AttributeOverride;
=======
>>>>>>> fbbceeafb01cb4dfe0802600f6d3c02eb0bfa3e4
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

<<<<<<< HEAD
=======

>>>>>>> fbbceeafb01cb4dfe0802600f6d3c02eb0bfa3e4

@Entity
public class Buyer extends Customer {
	private int buyerId;

	@Override
	public String toString() {
		return "Buyer [buyerId=" + buyerId + "]";
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Buyer(int buyerId) {
		super();
		this.buyerId = buyerId;
	}
	
	}
