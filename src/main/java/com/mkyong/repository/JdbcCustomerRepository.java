package com.mkyong.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mkyong.Customer;

@Repository
public class JdbcCustomerRepository implements CustomerRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
    public int save(Customer customer) {
        return jdbcTemplate.update(
                "insert into customer (id, name, orderid) values(?,?,?)",
                customer.getId(), customer.getName(), customer.getOrderid());
	}

	public int count() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select count(*) from customer", Integer.class);
		//return jdbcTemplate.queryForObject("select count(*) from customers", Integer.class);
	}

}
