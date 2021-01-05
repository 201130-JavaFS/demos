package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode @ToString
public class Avenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aveId;
	private String aveName;
	private String power;
	private String firstName;
	private String lastName;
	private int powerLevel;
	
	public Avenger(String aveName, String power, String firstName, String lastName, int powerLevel) {
		super();
		this.aveName = aveName;
		this.power = power;
		this.firstName = firstName;
		this.lastName = lastName;
		this.powerLevel = powerLevel;
	}
	
	

}
