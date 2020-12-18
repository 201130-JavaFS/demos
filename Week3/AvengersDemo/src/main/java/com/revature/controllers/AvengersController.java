package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Avenger;
import com.revature.services.AvengersService;

public class AvengersController {

	private AvengersService as = new AvengersService();
	private ObjectMapper om = new ObjectMapper();
	
	public void getAllAvengers(HttpServletResponse res) throws IOException {
		List<Avenger> list = as.avengersAssemble();
		String json = om.writeValueAsString(list);
		res.getWriter().print(json);
		res.setStatus(200);		
	}

}
