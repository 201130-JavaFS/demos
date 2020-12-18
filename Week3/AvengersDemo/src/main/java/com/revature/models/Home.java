package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Home {
	
	@Id
	private String homeName;
	
	private String stAddr;
	private String city;
	private String state;
	private String zip;
	
	public Home() {
		super();
	}

	public Home(String homeName, String stAddr, String city, String state, String zip) {
		super();
		this.homeName = homeName;
		this.stAddr = stAddr;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getHomeName() {
		return homeName;
	}

	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	public String getStAddr() {
		return stAddr;
	}

	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((homeName == null) ? 0 : homeName.hashCode());
		result = prime * result + ((stAddr == null) ? 0 : stAddr.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Home other = (Home) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (homeName == null) {
			if (other.homeName != null)
				return false;
		} else if (!homeName.equals(other.homeName))
			return false;
		if (stAddr == null) {
			if (other.stAddr != null)
				return false;
		} else if (!stAddr.equals(other.stAddr))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Home [homeName=" + homeName + ", stAddr=" + stAddr + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}
	
	
	

}
