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

		switch (URI) {
		case "avengers":
			if (req.getSession(false) != null) {
				ac.getAllAvengers(res);
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
