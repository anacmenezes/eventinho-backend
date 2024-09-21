package com.eventinho.vae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventinho.vae.eventinho.Eventinho;
import com.eventinho.vae.eventinho.EventinhoRepository;
import com.eventinho.vae.eventinho.EventinhoRequestDTO;
import com.eventinho.vae.eventinho.EventinhoResponseDTO;

@RestController
@RequestMapping("eventinho")
public class EventinhoController {
	
	@Autowired
    private EventinhoRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveEventinho(@RequestBody EventinhoRequestDTO data){
        Eventinho eventinhoData = new Eventinho(data);
        repository.save(eventinhoData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<EventinhoResponseDTO> findAll(){

        List<EventinhoResponseDTO> eventinhoList = repository.findAll().stream().map(EventinhoResponseDTO::new).toList();
        return eventinhoList;
    }
    
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@DeleteMapping("/{cod}")
	public ResponseEntity<Void> delete(@PathVariable Long cod) {
		repository.deleteById(cod);
		return ResponseEntity.noContent().build();
	}
}
