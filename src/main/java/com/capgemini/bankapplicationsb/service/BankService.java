package com.capgemini.bankapplicationsb.service;

import com.capgemini.bankapplicationsb.exceptions.AccountNotFoundException;
import com.capgemini.bankapplicationsb.exceptions.InsufficientAccountBalanceException;
import com.capgemini.bankapplicationsb.exceptions.NegativeAmountException;

public interface BankService {
	
	public double getBalance(long accountId);
	public double withdraw(long accountId, double amount);
	public double deposit(long accountId, double amount);
	public boolean fundTransfer(long fromAcc, long toAcc, double amount);


}
