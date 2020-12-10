package com.revature.services;

import java.util.List;

import com.revature.models.Avenger;
import com.revature.repos.AvengerDAO;
import com.revature.repos.AvengerDAOImpl;

public class AvengersService {
	
	private AvengerDAO aDao = new AvengerDAOImpl();
	
	public List<Avenger> avengersAssemble() {
		return aDao.findAll();
	}
}
