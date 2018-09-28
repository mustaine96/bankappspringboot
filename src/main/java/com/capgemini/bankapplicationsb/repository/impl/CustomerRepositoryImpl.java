package com.capgemini.bankapplicationsb.repository.impl;

import org.springframework.stereotype.Repository;

import com.capgemini.bankapplicationsb.exceptions.AccountNotFoundException;
import com.capgemini.bankapplicationsb.model.Customer;
import com.capgemini.bankapplicationsb.repository.CustomerRepository;
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public Customer authenticate(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateProfile(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePassword(Customer customer, String newPassword, String oldPassword) {
		// TODO Auto-generated method stub
		return false;
	}

}
