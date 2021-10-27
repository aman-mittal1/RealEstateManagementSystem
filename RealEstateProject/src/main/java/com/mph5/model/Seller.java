package com.mph5.model;

import javax.persistence.AttributeOverride;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Seller extends Customer {
	private int sellerId;
	
	@ManyToOne
	@JoinColumn(name = "property_Id", referencedColumnName = "PROPERTY_ID")
	private Property property;

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + "]";
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public Seller() {
		super();
		
	}

	public Seller(int sellerId) {
		super();
		this.sellerId = sellerId;
	}
	
	}