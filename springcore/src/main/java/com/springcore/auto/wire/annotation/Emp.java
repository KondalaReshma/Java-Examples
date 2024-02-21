package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	
	private Address  address;
	
	

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor is used ");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		
		System.out.println("setter injection is used");
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	
	
	
}
