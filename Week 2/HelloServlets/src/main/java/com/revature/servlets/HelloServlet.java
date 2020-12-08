package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	
	/*
	 * We are overriding the doGet method, so the service method of our HelloServlet will
	 * delegate here if it receives a GET request. 
	 * 
	 * Note the method signature of the doGet method. It will be the same for any of the "do" methods
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//A print writer created from the response will write to that response object. We can use this to write HTML directly
		PrintWriter pw = res.getWriter();
		pw.print("<h1>Hello from your doGet method</h1>");
		res.setStatus(202);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		pw.print("<h1>Hello from your doPost method</h1>");
		res.setStatus(200);
	}

}
