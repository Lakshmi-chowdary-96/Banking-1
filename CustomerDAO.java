package com.cg.banking.daoservices;

import com.cg.banking.beans.Customer;

public interface CustomerDAO {
Customer save(Customer customer);
	boolean update(Customer customer);
	Customer findOne(int associateId);
	Customer[] findAll();

}
