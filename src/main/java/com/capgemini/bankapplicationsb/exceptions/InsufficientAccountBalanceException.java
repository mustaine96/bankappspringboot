package com.capgemini.bankapplicationsb.exceptions;

public class InsufficientAccountBalanceException extends Exception {

	public InsufficientAccountBalanceException(String message)
	{
		super(message);
	}
}
