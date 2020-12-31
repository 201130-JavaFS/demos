package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Pokemon;
import com.revature.models.Trainer;
import com.revature.repositories.IPokemonDAO;
import com.revature.repositories.ITrainerDAO;
import com.revature.services.PokeService;

@RestController
@RequestMapping(value="pokemon")
@CrossOrigin
public class PokeController {
	
	private PokeService ps;
	
	@GetMapping
	public ResponseEntity<List<Trainer>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(ps.findAllTrainers());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Trainer> getTrainer(@PathVariable("id") int id) {
		return ResponseEntity.status(HttpStatus.OK).body(ps.findTrainerById(id));
	}
	
	@PostMapping
	public  ResponseEntity<List<Trainer>> newTrainer(@RequestBody Trainer t) {
		ps.insertTrainer(t);
		return ResponseEntity.status(HttpStatus.OK).body(ps.findAllTrainers());
	}
	
	@PutMapping
	public ResponseEntity<List<Trainer>> newPokemon(@RequestBody Pokemon p) {
		ps.insertPokemon(p);
		return ResponseEntity.status(HttpStatus.OK).body(ps.findAllTrainers());
	}

	@Autowired
	public PokeController(PokeService ps) {
		super();
		this.ps = ps;
	}

	
	
	
}
