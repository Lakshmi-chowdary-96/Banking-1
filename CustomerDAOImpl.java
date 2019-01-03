package com.cg.banking.daoservices;

import com.cg.banking.bankingutill.BankingUtill;
import com.cg.banking.beans.Customer;

public class CustomerDAOImpl  implements CustomerDAO{

	@Override
	public Customer save(Customer customer) {
		customer.setCustomerId(BankingUtill.getCustomer_ID_COUNTER());
		BankingUtill.customer[BankingUtill.getCustomer_IDX()]=customer;
		return customer;
	}

	@Override
	public boolean update(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer findOne(int associateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
