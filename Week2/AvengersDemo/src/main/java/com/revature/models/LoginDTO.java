package com.revature.models;

public class LoginDTO {
	
	public String username;
	public String password;
	
	public LoginDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public LoginDTO() {
		super();
	}
	
	

}
