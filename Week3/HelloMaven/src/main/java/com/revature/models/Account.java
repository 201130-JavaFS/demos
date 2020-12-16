package com.revature.models;

public class Account {
	
	public double balance;
	public String type;
	
	public Account(double balance, String type) {
		super();
		this.balance = balance;
		this.type = type;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", type=" + type + "]";
	}
	
	

}
