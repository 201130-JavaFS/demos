package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controllers.AvengersController;

public class MasterServlet extends HttpServlet {
	
	private AvengersController ac = new AvengersController();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
		res.setContentType("application/json");
		// By default tomcat will send back a successful status code if it finds a
		// servlet method.
		// Because all requests will hit this method, we are defaulting to not found and
		// will override for success requests.
		res.setStatus(404);
		
		final String URI = req.getRequestURI().replace("/AvengersDemo/", "");
		
		switch (URI) {
		case "avengers":
			ac.getAllAvengers(res);
		}
	}

}
