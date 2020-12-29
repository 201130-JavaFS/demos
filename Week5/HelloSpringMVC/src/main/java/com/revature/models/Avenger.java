package com.revature.models;

import java.util.Objects;

public class Avenger {
	
	private int id;
	private String supName;
	private String supPower;
	private String firstName;
	private String lastName;
	private int powerLevel;
	
	public Avenger() {
		super();
	}

	public Avenger(int id, String supName, String supPower, String firstName, String lastName, int powerLevel) {
		super();
		this.id = id;
		this.supName = supName;
		this.supPower = supPower;
		this.firstName = firstName;
		this.lastName = lastName;
		this.powerLevel = powerLevel;
	}

	public Avenger(String supName, String supPower, String firstName, String lastName, int powerLevel) {
		super();
		this.supName = supName;
		this.supPower = supPower;
		this.firstName = firstName;
		this.lastName = lastName;
		this.powerLevel = powerLevel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getSupPower() {
		return supPower;
	}

	public void setSupPower(String supPower) {
		this.supPower = supPower;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName, powerLevel, supName, supPower);
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
		Avenger other = (Avenger) obj;
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lastName, other.lastName)
				&& powerLevel == other.powerLevel && Objects.equals(supName, other.supName)
				&& Objects.equals(supPower, other.supPower);
	}

	@Override
	public String toString() {
		return "Avenger [id=" + id + ", supName=" + supName + ", supPower=" + supPower + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", powerLevel=" + powerLevel + "]";
	}
	
	

}
