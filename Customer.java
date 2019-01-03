package com.cg.banking.beans;

public class Customer {
	private Account[] accounts;
	private int accountNumber;
	private String firstName,lastName;
	private int customerId;
	private Account account;
	
	private Transactions transcations;
	public Customer() {
	
	}
	public Customer(Account[] accounts, int accountNumber, String firstName, String lastName, int customerId,
			Account account,  Transactions transcations) {
		super();
		this.accounts = accounts;
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = customerId;
		this.account = account;
		
		this.transcations = transcations;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Transactions getTranscations() {
		return transcations;
	}
	public void setTranscations(Transactions transcations) {
		this.transcations = transcations;
	}
	
}
	