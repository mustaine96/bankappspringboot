package com.capgemini.bankapplicationsb.model;

public class BankAccount {

	private long accountId ;
	private String accountType ;
	private double balance ;
	public BankAccount(long accountId, String accountType, double balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}
	public BankAccount() {
		super();
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
