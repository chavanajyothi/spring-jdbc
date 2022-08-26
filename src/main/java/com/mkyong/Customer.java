package com.mkyong;

public class Customer {
	
	private Long id;
    private String name;
    private int orderid;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Customer(Long id, String name, int orderid) {
		super();
		this.id = id;
		this.name = name;
		this.orderid = orderid;
	}
    
    
}
