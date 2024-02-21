package com.springcore.lifecycle;

public class Pizza {
	
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	  
	
	//@postconstruct
	public void start() {
		System.out.println("starting method");
	}
	
	//@predestroy
	public void end() {
		System.out.println("ending method");
	}
	
	
	

	
}
