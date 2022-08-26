package com.mkyong.repository;

import com.mkyong.Customer;

public interface CustomerRepository {
	
	int save(Customer c);
	
	int count();

}
