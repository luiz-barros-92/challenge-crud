package com.luizbarros.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizbarros.crud.dto.ClientDTO;
import com.luizbarros.crud.services.ClientService;

@RestController
@RequestMapping (value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping(value = "/{id}")
	public ClientDTO findById(@PathVariable Long id) {		
		return service.findById(id);
	}
	
	@GetMapping
	public Page <ClientDTO> findAll(Pageable pageable) {		
		return service.findAll(pageable);
	}
}