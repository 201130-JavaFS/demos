package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Avenger;
import com.revature.repos.AvengerDAO;

@RestController
@RequestMapping(value="/avenger")
public class AvengerController {
	
	private AvengerDAO dao;
	
	@GetMapping
	public ResponseEntity<List<Avenger>> assemble(){
		return ResponseEntity.status(200).body(dao.findAll());
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<List<Avenger>> findByName(@PathVariable String name){
		Optional<List<Avenger>> opt = dao.findByAveName(name);
		List<Avenger> list = null;
		if(opt.isPresent()) {
			list = opt.get();
		}
		return ResponseEntity.status(200).body(list);
	}
	
	@PostMapping
	public ResponseEntity addAvenger(@RequestBody Avenger a) {
		dao.save(a);
		return ResponseEntity.status(201).build();
	}
	
	@Autowired
	public AvengerController(AvengerDAO dao) {
		super();
		this.dao = dao;
	}

}
