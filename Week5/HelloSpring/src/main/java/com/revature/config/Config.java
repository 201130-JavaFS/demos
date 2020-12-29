package com.revature.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature")
public class Config {
	
//	@Bean(name = "user")
//	@Scope("prototype")
//	public User getUser() {
//		//we include the getAccount method to wire our user bean with the account bean dependency. 
//		return new User(getAccount());
//	}
//	
//	@Bean(name="account")
//	public Account getAccount() {
//		return new Account();
//	}

}
