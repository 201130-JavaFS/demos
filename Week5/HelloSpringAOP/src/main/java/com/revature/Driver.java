package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Avenger;
import com.revature.repos.AvengerDAO;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AvengerDAO dao = ac.getBean(AvengerDAO.class);
		
		Avenger a = dao.getById(1);
		
		Avenger a2 = ac.getBean(Avenger.class);
		
		a2.setAveId(6);
		a2.setAveName("Scarlet Witch");
		a2.setFirstName("Wanda");
		a2.setLastName("Maximoff");
		a2.setPower("Magic hands");
		a2.setPowerLevel(200);
		
		String s = dao.fight(a, "shield smash", 3.2);
		
		dao.fight(a2, "energy bolt", 15.55);
		System.out.println(s);
	}

}
