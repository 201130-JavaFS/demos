package com.revature.services;

public class LoginService {

	public boolean login(String username, String password) {
		if(username.equals("agent") && password.equals("cellist")) {
			return true;
		}
		return false;
	}
}
