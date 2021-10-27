package com.mph5.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	@Column
	private String fName;
	private String lName;
	private String phoneNumber;
	private String email;
	private String pan;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customerId, String fName, String lName, String phoneNumber, String email, String pan, String adhar,
			String password) {
		super();
		this.customerId = customerId;
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.pan = pan;
		this.adhar = adhar;
		this.password = password;
	}
	
	private String adhar;
	private String password;
	
	@Override
	public String toString() {
		return "Buyer [customerId=" + customerId + ", fName=" + fName + ", lName=" + lName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", pan=" + pan + ", adhar=" + adhar + ", password=" + password
				+ "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String string) {
		this.phoneNumber = string;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
