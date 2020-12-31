package com.revature.models;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Avenger {
	
	private int aveId;
	private String aveName;
	private String power;
	private String firstName;
	private String lastName;
	private int powerLevel;
	
	public Avenger() {
		super();
	}
	
	public Avenger(int aveId, String aveName, String power, String firstName, String lastName, int powerLevel) {
		super();
		this.aveId = aveId;
		this.aveName = aveName;
		this.power = power;
		this.firstName = firstName;
		this.lastName = lastName;
		this.powerLevel = powerLevel;
	}
	public Avenger(String aveName, String power, String firstName, String lastName, int powerLevel) {
		super();
		this.aveName = aveName;
		this.power = power;
		this.firstName = firstName;
		this.lastName = lastName;
		this.powerLevel = powerLevel;
	}
	public int getAveId() {
		return aveId;
	}
	public void setAveId(int aveId) {
		this.aveId = aveId;
	}
	public String getAveName() {
		return aveName;
	}
	public void setAveName(String aveName) {
		this.aveName = aveName;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
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
		return Objects.hash(aveId, aveName, firstName, lastName, power, powerLevel);
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
		return aveId == other.aveId && Objects.equals(aveName, other.aveName)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(power, other.power) && powerLevel == other.powerLevel;
	}
	@Override
	public String toString() {
		return "Avenger [aveId=" + aveId + ", aveName=" + aveName + ", power=" + power + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", powerLevel=" + powerLevel + "]";
	}
	
	

}
