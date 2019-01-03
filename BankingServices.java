package com.cg.banking.Services;

import com.cg.banking.Exceptions.CustomerdetailsNotFoundException;
import com.cg.banking.beans.Account;
import com.cg.banking.beans.Address;
import com.cg.banking.beans.Transactions;
import com.cg.banking.beans.Customer;
import com.cg.banking.Exceptions.CustomerdetailsNotFoundException;


public interface BankingServices {
	int acceptCustomerDetails(Account[] accounts, int accountNumber, String firstName, String lastName, int customerId,Account account ,Transactions transactions);
	
	int calculateIntrest(int associateId)throws CustomerdetailsNotFoundException;
	Customer getCustomerDetails(int CustomerId)throws CustomerdetailsNotFoundException;

	Customer[]getAllCustomerDetails();
	 int acceptCustomerDetails(Account[] accounts, int accountNumber, String firstName, String lastName, int customerId,
				int accountNo,int accountBalance,String accountType,String transactionId,int timeStamp,String transactionLocation,String modeOfTransaction,String transactionStatus);
	
	
	
	
			
	
	
}
