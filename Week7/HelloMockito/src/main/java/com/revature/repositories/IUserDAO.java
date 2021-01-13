package com.revature.repositories;

import com.revature.models.User;

public interface IUserDAO {
	
	public User findByUsername(String name);
	public User findById(int id);
	
}
