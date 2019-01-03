package com.cg.banking.bankingutill;

import com.cg.banking.beans.Customer;


public class BankingUtill {
	private static int Customer_ID_COUNTER=101;
	private static int Customer_IDX=0;
	public static Customer[] associates=new Customer[10];
	public static Customer[] customer;
	public static int getCustomer_ID_COUNTER() {
		return ++Customer_ID_COUNTER;
	}
	public static int getCustomer_IDX() {
		return Customer_IDX++;

}
}
