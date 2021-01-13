package com.revature.repositories;

import com.revature.models.User;

public class UserDAO implements IUserDAO {

	@Override
	public User findByUsername(String name) {
		return new User(2, "Testy", "McTestface");
	}

	@Override
	public User findById(int id) {
		return null;
	}

}
