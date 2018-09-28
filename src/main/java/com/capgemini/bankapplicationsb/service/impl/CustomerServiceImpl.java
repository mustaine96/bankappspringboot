package com.capgemini.bankapplicationsb.service.impl;

import com.capgemini.bankapplicationsb.exceptions.AccountNotFoundException;
import com.capgemini.bankapplicationsb.model.Customer;
import com.capgemini.bankapplicationsb.repository.impl.CustomerRepositoryImpl;
import com.capgemini.bankapplicationsb.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepositoryImpl custRepoObj=new CustomerRepositoryImpl() ;

	@Override
	public Customer authenticate(Customer customer) {
		return custRepoObj.authenticate(customer) ;

	}

	@Override
	public Customer updateProfile(Customer customer) {
		return custRepoObj.updateProfile(customer) ;

	}

	@Override
	public boolean updatePassword(Customer customer, String newPassword, String oldPassword) {
		return custRepoObj.updatePassword(customer, newPassword,oldPassword);

	}

}
