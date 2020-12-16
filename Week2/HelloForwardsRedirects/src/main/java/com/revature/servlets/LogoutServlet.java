package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
		//normally you would send back to a home page with a logout servlet. You could achieve that with an "" parameter. 
		res.sendRedirect("http://www.google.com");
	}

}
