package com.capgemini.bankapplicationsb.repository.impl;

import org.springframework.stereotype.Repository;

import com.capgemini.bankapplicationsb.repository.BankAccountRepository;
@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository {

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		return false;
	}

}
