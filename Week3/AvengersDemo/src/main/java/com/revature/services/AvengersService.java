package com.revature.services;

import java.util.List;

import com.revature.models.Avenger;
import com.revature.models.AvengerDTO;
import com.revature.models.Home;
import com.revature.repos.AvengerDAO;
import com.revature.repos.AvengerDAOImpl2;
import com.revature.repos.HomeDAO;
import com.revature.repos.HomeDAOImpl2;

public class AvengersService {
	
	private AvengerDAO aDao = new AvengerDAOImpl2();
	private HomeDAO hDao = new HomeDAOImpl2();
	
	public List<Avenger> avengersAssemble() {
		return aDao.findAll();
	}

	public Avenger findById(int id) {
		return aDao.findById(id);
	}

	public boolean addAvenger(AvengerDTO ad) {
		Avenger a;
		if(ad.homeString.equals("")) {
			a = new Avenger(ad.supName, ad.supPower, ad.firstName, ad.lastName, ad.powerLevel, null);
		} else {
			Home h = hDao.findByName(ad.homeString);
			a = new Avenger(ad.supName, ad.supPower, ad.firstName, ad.lastName, ad.powerLevel, h);
		}
		return aDao.addAvenger(a);
	}
}
