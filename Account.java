package com.cg.banking.beans;

public class Account {
	private int accountNo;
	private float accountBalance;
	private String accountType;
	private Transactions[] transactions;
	public Account() {
		
	}
	public Account(int accountNo, String accountType,float accountBalance,  Transactions[] transactions) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		this.transactions = transactions;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Transactions[] getTransactions() {
		return transactions;
	}
	public void setTransactions(Transactions[] transactions) {
		this.transactions = transactions;
	}
	
}
	