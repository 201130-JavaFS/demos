package com.revature.repos;

import org.springframework.stereotype.Repository;

import com.revature.exceptions.SocialDistancingException;
import com.revature.models.Avenger;

@Repository
public class AvengerDAO {

	public static Avenger[] team = {
			(new Avenger(1, "Captian America", "World's number 1 pretty boy", "Steve", "Rogers", 15)),
			(new Avenger(2, "Iron Man", "Super genius and he knows it", "Tony", "Stark", 55)),
			(new Avenger(3, "Black Widow", "Don't Ask", "Natasha", "Romanonov", 9000)),
			(new Avenger(4, "Groot", "super cute as a baby", "I am", "Groot", 3)),
			(new Avenger(5, "Thor", "Stars in a Loriael hair products commercial", "Thor", "Odinson", 45)) };

	public Avenger[] getAll() {
		return team;
	}

	public Avenger getById(int id) {
		if (id > team.length || id < 1) {
			return null;
		}
		return team[id - 1];
	}

	public String fight(Avenger a, String attack, double distance) {
		if(distance<6) {
			throw new SocialDistancingException();
		}
		return new String(a.getAveName() + " attacks a bad guy with "+ attack + " from "+distance+" feet away.");
	}

}
