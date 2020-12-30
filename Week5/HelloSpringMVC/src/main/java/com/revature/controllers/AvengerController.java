package com.revature.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Avenger;
import com.revature.repos.AvengerDAO;

@RestController
@RequestMapping(value="/avenger")
//@ResponseBody //Adds the @ResponseBody to every method in the controller at compile time. 
public class AvengerController {
	
	private AvengerDAO dao;

	@Autowired
	public AvengerController(AvengerDAO dao) {
		super();
		this.dao = dao;
	}
	
	@RequestMapping(method=RequestMethod.GET) //Ensures a get request to /avenger (defined above) uses this method
	//@ResponseBody //this makes sure any data sent back in the body is in JSON format.
	public List<Avenger> assemble() {
		return Arrays.asList(dao.getAll());
	}
	
	@GetMapping("/{id}")//GetMapping will indicate a get request goes here to the path specified, in this case we specified a path param.
	public ResponseEntity<Avenger> getOneAvenger(@PathVariable("id") int id) {//@PathVariable allows you to get the path variable you specified 
																				//in the mapping. 
		Avenger a = dao.getById(id);
		if(a==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); //sends back an empty body with a no content status code.
		}
		return ResponseEntity.status(HttpStatus.OK).body(a);//Sends back the avenger in the body of the response and a 200 status code.
	}
	
	@PutMapping
	public ResponseEntity<Avenger> updateAvenger(@RequestBody Avenger a){//@RequestBody converts JSON from the request into the object we indicated. 
		a = dao.update(a); 
		if(a==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(a);
	}
	
}
