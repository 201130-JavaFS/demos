package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controllers.AvengersController;
import com.revature.controllers.LoginController;

public class MasterServlet extends HttpServlet {

	private AvengersController ac = new AvengersController();
	private LoginController lc = new LoginController();

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("application/json");
		// By default tomcat will send back a successful status code if it finds a
		// servlet method.
		// Because all requests will hit this method, we are defaulting to not found and
		// will override for success requests.
		res.setStatus(404);

		final String URI = req.getRequestURI().replace("/AvengersDemo/", "");
		
		//split on "/" to determine the portions of the URI
		String[] portions = URI.split("/");
		
		

		switch (URI) {
		case "avengers":
			//Make sure logged in
			if (req.getSession(false) != null && (boolean) req.getSession().getAttribute("loggedin")) {
				//Check the HTTP verb
				if (req.getMethod().equals("GET")) {
					//check if getting 1 or all Avengers
					if (portions.length == 2) {
						int id = Integer.parseInt(portions[1]);
						ac.getAvenger(res, id);
					} else if (portions.length == 1) {
						ac.getAllAvengers(res);
					}
				} else if (req.getMethod().equals("POST")) {
					ac.addAvenger(req, res);
				}
			} else {
				res.setStatus(403);
			}
			break;
		case "login":
			lc.login(req, res);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
