package com.revature.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Avenger;

//JpaRepository takes 2 generics. The first is the entity that is being persisted. 
//The second is the Primary Key type. 
public interface AvengerDAO extends JpaRepository<Avenger, Integer> {
	
	public Optional<List<Avenger>> findByAveName(String name);
	
}
