package com.mph5.model;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Seller extends Customer {
	@Id
	private int sellerId;
	
	@Column
	@Embedded
	private Customer customer;
	
	@OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
	private List<Property> property;


	  public Seller(int sellerId, Customer customer) {
		super();
		this.sellerId = sellerId;
		this.customer = customer;
	}

	  public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	  public int getSellerId() {
		return sellerId;
	}

	  public void setsellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", customer=" + customer + "]";
	}
	
	}
