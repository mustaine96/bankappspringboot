package com.capgemini.bankapplicationsb.service;

import com.capgemini.bankapplicationsb.exceptions.AccountNotFoundException;
import com.capgemini.bankapplicationsb.model.Customer;

public interface CustomerService {

	public Customer authenticate(Customer customer);
	public Customer updateProfile(Customer customer);
	public boolean updatePassword(Customer customer,String newPassword,String oldPassword);

}
