package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.services.DinoService;

public class DinoServlet extends HttpServlet {

	private DinoService ds = new DinoService();

	// return all my dinosaurs when I receive a GET request.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri = req.getRequestURI();

		String possibleId = uri.replace("/HelloJackson/dinos/", "");
		
		if (!possibleId.equals("")) {
			int id  = 0;

			try {
				id = Integer.parseInt(possibleId);
			} catch (NumberFormatException e) {

			}
			if(id<1) {
				res.setStatus(406);
			}else {
				ds.getOneDino(res, id);
				res.setStatus(200);
				res.setContentType("application/json");
			}
		} else {
		res.setContentType("application/json");
		ds.getDinos(res);
		res.setStatus(200);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ds.createDino(req);
		res.setStatus(201);
		// returns updated array
		ds.getDinos(res);
	}

}
