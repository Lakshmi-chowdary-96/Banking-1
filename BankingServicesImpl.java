package com.cg.banking.Services;

import com.cg.banking.Exceptions.CustomerdetailsNotFoundException;
import com.cg.banking.beans.Account;
import com.cg.banking.beans.Customer;
import com.cg.banking.beans.Transactions;
import com.cg.banking.daoservices.CustomerDAO;
import com.cg.banking.daoservices.CustomerDAOImpl;


public class BankingServicesImpl implements BankingServices {
	private CustomerDAO customerDAO=new CustomerDAOImpl();

	@Override
	public int acceptCustomerDetails(Account[] accounts, int accountNumber, String firstName, String lastName,
			int customerId, Account account, Transactions transactions) {
		Customer customer;
		customerDAO.save(customer);
		return customer.getCustomerId();
		return 0;
	}
	

	@Override
	public int calculateIntrest(int associateId) throws CustomerdetailsNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerDetails(int CustomerId) throws CustomerdetailsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer[] getAllCustomerDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int acceptCustomerDetails(Account[] accounts, int accountNumber, String firstName, String lastName,
			int customerId, int accountNo, int accountBalance, String accountType, String transactionId, int timeStamp,
			String transactionLocation, String modeOfTransaction, String transactionStatus) {
		// TODO Auto-generated method stub
		return 0;
	}

	