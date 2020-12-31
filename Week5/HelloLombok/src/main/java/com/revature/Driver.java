package com.revature;

import com.revature.models.Hobbit;

public class Driver {

	public static void main(String[] args) {
		Hobbit h1 = new Hobbit("Bilbo", "Baggins", 8000L, 111, "Sting");
		Hobbit h2 = new Hobbit();
		
		h2.setAge(51);
		h2.setFirstName("Frodo");
		h2.setLastName("Baggins");
		h2.setAppetite(4500L);
		h2.setWeapon("Deus ex Hawkina");
		
		System.out.println(h1);
		System.out.println(h2);
		
	}

}
