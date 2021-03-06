package com.capgemini.bankapplicationsb.model;

import java.time.LocalDate;

public class Customer {

	private long customerId ;
	private String customerName ;
	private String password ;
	private String email ;
	private LocalDate dateOfBirth;
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", password=" + password
				+ ", email=" + email + ", address=" + address + ", account=" + account + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}

	private String address ;
	private BankAccount account ;
	public Customer(long customerId, String customerName, String password, String email, String address,
			BankAccount account) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.account = account;
	}
	public Customer() {
		super();
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
}
