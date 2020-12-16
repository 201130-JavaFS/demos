package com.revature.repos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Account;
import com.revature.services.AccountService;

public class AccountDAO {
	
	private static final Logger log = LogManager.getLogger(AccountDAO.class);
	
	Account[] array = {new Account(6000.0, "Checking"), new Account(500.35, "Savings")};
	
	public Account findById(int id) {
		log.info("I am in the DAO getting account number "+id);
		
		return array[id]; 
	}

}
