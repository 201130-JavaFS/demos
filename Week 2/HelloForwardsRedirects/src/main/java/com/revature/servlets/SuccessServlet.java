package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet{
	
	//This is bad practice but it is possible and so I am showing it.
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<h2>Welcome "+req.getParameter("userId")+"!</h2>");
		pw.print("<a href='logout'>Click here to log out.</a>");
	}
}
