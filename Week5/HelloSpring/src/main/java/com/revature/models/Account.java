package com.revature.models;

import java.util.Objects;

import org.springframework.stereotype.Repository;

//Since this is a stereotype annotation so it doesn't matter to spring which one of the 4 we use. 
@Repository
public class Account {
	
	private double amount;
	private String type;
	
	public Account() {
		super();
	}

	public Account(double amount, String type) {
		super();
		this.amount = amount;
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Override
	public int hashCode() {
		return Objects.hash(amount, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Account other = (Account) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Account [amount=" + amount + ", type=" + type + "]";
	}
	
	

}
