package com.mph5.model;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;


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
