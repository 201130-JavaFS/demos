package com.revature.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.revature.models.Flashcard;

@FeignClient(name="flashcard")
public interface FlashcardClient {
	
	@GetMapping()
	public List<Flashcard> findAll();
	
	@GetMapping("/port")
	public String retrievePort();
	

}
