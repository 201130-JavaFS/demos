package com.revature.services;

import com.revature.models.User;
import com.revature.repositories.IUserDAO;

public class UserService {

	private IUserDAO dao;
	
	public UserService(IUserDAO dao) {
		super();
		this.dao = dao;
	}

	public boolean loginWithId(int id, String password) {
		User u = dao.findById(id);

		try {
			System.out.println(u);
		if (u.getPassword().equals(password)) {
			return true;
		}} catch (Exception e) {
			
		}
		return false;
	}

	public boolean loginWithName(String name, String password) {
		User u = dao.findByUsername(name);
		
		try {
			System.out.println(u);
		if (u.getPassword().equals(password)) {
			return true;
		}
		} catch (Exception e) {
			
		}
		return false;
	}

}
