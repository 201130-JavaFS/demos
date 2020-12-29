package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Account;
import com.revature.models.User;

public class Driver {

	public static void main(String[] args) {
		//Create an Application Context Spring Container
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
		User u = (User) ac.getBean("user");
		
		System.out.println(u);
		
		User u2 = new User();
		System.out.println(u2);
		
		u.setId(1);
		u.setName("Harry");
		u.getAccount().setAmount(55865.63);
		u.getAccount().setType("Checking");
		
		System.out.println(u);
		
		u2.setId(2);
		u2.setName("Larry");
		//I have to add a new account object to my User here because the frame did not provide one for me.
		u2.setAccount(new Account());
		u2.getAccount().setAmount(865.63);
		u2.getAccount().setType("Checking");
		
		System.out.println(u2);
		
		
		System.out.println("============================");
		//Once we made our user bean prototype scoped this returns a new user. However since the account is 
		//still singleton scope our u3 user and u user both share the same account. 
		User u3 = (User) ac.getBean("user");
		System.out.println(u3);
		
	}

}
