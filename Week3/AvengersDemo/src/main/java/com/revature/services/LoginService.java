package com.revature.services;

public class LoginService {

	public boolean login(String username, String password) {
		if(username.equals("agent") && password.equals(((Integer)"cellist".hashCode()).toString())) {
			return true;
		}
		return false;
	}
}
