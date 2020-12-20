package com.revature.models;

import java.util.Objects;

public class AvengerDTO {
	
	public int supId;
	public String supName;
	public String supPower;
	public String firstName;
	public String lastName;
	public int powerLevel;
	public String homeString;
	public AvengerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AvengerDTO(int supId, String supName, String supPower, String firstName, String lastName, int powerLevel,
			String homeString) {
		super();
		this.supId = supId;
		this.supName = supName;
		this.supPower = supPower;
		this.firstName = firstName;
		this.lastName = lastName;
		this.powerLevel = powerLevel;
		this.homeString = homeString;
	}
	public AvengerDTO(String supName, String supPower, String firstName, String lastName, int powerLevel,
			String homeString) {
		super();
		this.supName = supName;
		this.supPower = supPower;
		this.firstName = firstName;
		this.lastName = lastName;
		this.powerLevel = powerLevel;
		this.homeString = homeString;
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, homeString, lastName, powerLevel, supId, supName, supPower);
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
		AvengerDTO other = (AvengerDTO) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(homeString, other.homeString)
				&& Objects.equals(lastName, other.lastName) && powerLevel == other.powerLevel && supId == other.supId
				&& Objects.equals(supName, other.supName) && Objects.equals(supPower, other.supPower);
	}
	@Override
	public String toString() {
		return "AvengerDTO [supId=" + supId + ", supName=" + supName + ", supPower=" + supPower + ", firstName="
				+ firstName + ", lastName=" + lastName + ", powerLevel=" + powerLevel + ", homeString=" + homeString
				+ "]";
	}
	
	

}
