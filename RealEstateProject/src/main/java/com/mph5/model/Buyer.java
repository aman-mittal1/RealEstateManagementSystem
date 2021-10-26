package com.mph5.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Buyer {
	@Id
	private int buyerId;
	
	@Column
	@Embedded
	private Customer customer;

	public Buyer(int buyerId, Customer customer) {
		super();
		this.buyerId = buyerId;
		this.customer = customer;
	}

	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Buyer [buyerId=" + buyerId + ", customer=" + customer + "]";
	}
	
	}
