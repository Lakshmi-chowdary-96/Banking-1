package com.cg.banking.beans;

public class Transactions {
	private String transactionId,timeStamp,transactionLocation,modeOfTransaction,transactionStatus;
	private int amount;
	public Transactions() {
	
	}
	public Transactions(String transactionId, String timeStamp, String transactionLocation, String modeOfTransaction,
			String transactionStatus, int amount) {
		super();
		this.transactionId = transactionId;
		this.timeStamp = timeStamp;
		this.transactionLocation = transactionLocation;
		this.modeOfTransaction = modeOfTransaction;
		this.transactionStatus = transactionStatus;
		this.amount = amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getTransactionLocation() {
		return transactionLocation;
	}
	public void setTransactionLocation(String transactionLocation) {
		this.transactionLocation = transactionLocation;
	}
	public String getModeOfTransaction() {
		return modeOfTransaction;
	}
	public void setModeOfTransaction(String modeOfTransaction) {
		this.modeOfTransaction = modeOfTransaction;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
	
	
	