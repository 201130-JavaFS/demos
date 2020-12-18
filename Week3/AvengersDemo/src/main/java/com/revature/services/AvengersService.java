package com.revature.services;

import java.util.List;

import com.revature.models.Avenger;
import com.revature.repos.AvengerDAO;
import com.revature.repos.AvengerDAOImpl2;

public class AvengersService {
	
	private AvengerDAO aDao = new AvengerDAOImpl2();
	
	public List<Avenger> avengersAssemble() {
		return aDao.findAll();
	}
}
