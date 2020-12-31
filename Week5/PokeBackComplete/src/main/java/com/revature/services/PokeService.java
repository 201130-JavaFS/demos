package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Pokemon;
import com.revature.models.Trainer;
import com.revature.repositories.IPokemonDAO;
import com.revature.repositories.ITrainerDAO;

@Service
public class PokeService {
	
	private IPokemonDAO pdao;
	private ITrainerDAO tdao;
	
	@Autowired
	public PokeService(IPokemonDAO pdao, ITrainerDAO tdao) {
		super();
		this.pdao = pdao;
		this.tdao = tdao;
	}

	public List<Trainer> findAllTrainers() {
		return tdao.findAll();
	}

	public Trainer findTrainerById(int id) {
		return tdao.findById(id);
	}

	public void insertTrainer(Trainer t) {
		tdao.insert(t);
	}

	public void insertPokemon(Pokemon p) {
		pdao.insert(p);
	}
	
	
	
	
	
	
	

}
