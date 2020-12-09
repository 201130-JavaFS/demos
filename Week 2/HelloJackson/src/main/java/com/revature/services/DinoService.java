package com.revature.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.daos.DinoDAO;
import com.revature.models.Dinosaur;

public class DinoService {
	
	private DinoDAO dd = new DinoDAO();
	private ObjectMapper om = new ObjectMapper();

	public void getDinos(HttpServletResponse res) throws IOException {
		Dinosaur[] arr = dd.getAllDinos();
		//Changes Java array to JSON array. 
		String json = om.writeValueAsString(arr);
		//res.getWriter().print(json) works as well. 
		//Prints the JSON string to the body of the response. 
		PrintWriter pw = res.getWriter();
		pw.print(json);
	}

	public void createDino(HttpServletRequest req) throws IOException {
		//Getting information out of the body of the request
		
		BufferedReader reader = req.getReader();
		
		StringBuilder s = new StringBuilder();
		
		String line = reader.readLine();
		//This gets each line of the Request's body and appends it to the StringBuilder
		while(line != null) {
			s.append(line);
			line = reader.readLine(); 
		}
		
		String body = new String(s); 
		
		Dinosaur dino = om.readValue(body, Dinosaur.class);
		
		dd.inputDino(dino);
	}
}
