package com.revature.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.models.Avenger;
import com.revature.repos.AvengerDAO;

@Controller
@RequestMapping(value="/avenger")
public class AvengerController {
	
	private AvengerDAO dao;

	@Autowired
	public AvengerController(AvengerDAO dao) {
		super();
		this.dao = dao;
	}
	
	@RequestMapping(method=RequestMethod.GET) //Ensures a get request to /avenger (defined above) uses this method
	@ResponseBody //this makes sure any data sent back in the body is in JSON format.
	public List<Avenger> assemble() {
		return Arrays.asList(dao.getAll());
	}
	
	
	
}
