package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @EqualsAndHashCode @ToString @AllArgsConstructor
public class Hobbit {
	
	private String firstName;
	private String lastName;
	private Long appetite; 
	private int age;
	private String weapon;
	

}
