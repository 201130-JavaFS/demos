package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		
		String username = req.getParameter("userId");
		String password = req.getParameter("password");
		
		RequestDispatcher rd = null;
		PrintWriter pw = res.getWriter();
		
		//normally this logic would be in your service layer and get the password/username from database
		if(username.equals("RevAssoc")&&password.equals("password")) {
			//When getting the request dispatcher I can state the relative path I want to forward to as a String Parameter.
			rd = req.getRequestDispatcher("success");
			rd.forward(req, res);
		} else {
			rd = req.getRequestDispatcher("index.html");
			//this goes back to the client
			rd.include(req, res);
			pw.print("<span style='color:red; text-align:center'>"
					+ "Invalid Username and/or Password</span>");
		}
	}

}
