package com.capgemini.bankapplicationsb.service.impl;

import com.capgemini.bankapplicationsb.exceptions.AccountNotFoundException;
import com.capgemini.bankapplicationsb.exceptions.InsufficientAccountBalanceException;
import com.capgemini.bankapplicationsb.exceptions.NegativeAmountException;
import com.capgemini.bankapplicationsb.repository.BankAccountRepository;
import com.capgemini.bankapplicationsb.repository.impl.BankAccountRepositoryImpl;
import com.capgemini.bankapplicationsb.service.BankService;

public class BankAccountServiceImpl implements BankService {

	BankAccountRepository bankRepoObj=new BankAccountRepositoryImpl() ;

	@Override
	public double getBalance(long accountId) {
		return bankRepoObj.getBalance(accountId) ;
	}

	@Override
	public double withdraw(long accountId, double amount) {
		double balance=bankRepoObj.getBalance(accountId) ;
		if(balance==-1)
			return -1 ;
		bankRepoObj.updateBalance(accountId, balance-amount)  ;
		return bankRepoObj.getBalance(accountId) ;
	}

	@Override
	public double deposit(long accountId, double amount) {
		double balance=bankRepoObj.getBalance(accountId) ;
		if(balance==-1)
			return -1 ;
		bankRepoObj.updateBalance(accountId, (balance+amount))  ;
		return bankRepoObj.getBalance(accountId) ;
	}

	@Override
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) {
		boolean found=false ;
		boolean balProblem=false ;
		boolean negAmount=false ;
		if(bankRepoObj.getBalance(fromAcc)<amount)
		{
			throw new InsufficientAccountBalanceException("Your account balance is low!!") ;
		}
		
		if(amount<0)
		{
			throw new NegativeAmountException("You have entered negative amount") ;
		}
		
		if(withdraw(fromAcc, amount)!=-1)
		{
			if(deposit(toAcc, amount)!=-1)
			{
				found=true ;
				return true ;
			}
				
		}
		if(found==false)
		throw new AccountNotFoundException("The Account Id is incorrect!!") ;
		return false ;
	}
}
