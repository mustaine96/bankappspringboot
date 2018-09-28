package com.capgemini.bankapplicationsb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bankapplicationsb.exceptions.AccountNotFoundException;
import com.capgemini.bankapplicationsb.model.Customer;
import com.capgemini.bankapplicationsb.repository.impl.CustomerRepositoryImpl;
import com.capgemini.bankapplicationsb.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepositoryImpl custRepoObj ;

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
