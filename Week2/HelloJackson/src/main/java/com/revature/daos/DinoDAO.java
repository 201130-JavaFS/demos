package com.revature.daos;

import com.revature.models.Dinosaur;

public class DinoDAO {
	
	private Dinosaur[] dinoArray= {
			new Dinosaur(1, "chicken", true, 2, "omivore", 4.3),
			new Dinosaur(2, "triceritops", false, 4, "herbivore", 6000.3),
			new Dinosaur(3, "T-Rex", true, 2, "carnivore", 10595.8),
			new Dinosaur(4, "velociraptor", true, 2, "carnivore", 7.7)
	};

	public Dinosaur[] getAllDinos() {
		return dinoArray;
	}
	
	public Dinosaur getDinoById(int id) {
		return dinoArray[id-1];
	}

	public void inputDino(Dinosaur dino) {
		Dinosaur[] newArr = new Dinosaur[dinoArray.length+1];
		
		for(int i = 0; i<dinoArray.length; ++i) {
			newArr[i] = dinoArray[i];
		}
		
		dino.setId(newArr.length);
		
		newArr[dinoArray.length] = dino;
		
		dinoArray = newArr;
	}
	
}
