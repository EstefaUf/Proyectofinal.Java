package com.example.Proyecto1.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Proyecto1.entity.Organización;
import com.example.Proyecto1.service.OrganizaciónService;
import com.example.Proyecto1.service.PersonaService;

public class PersonaController {

	@GetMapping("/all")
	public ResponseEntity<List<Organización>> findAll(){
		return new ResponseEntity<>( OrganizaciónService.findAll(), HttpStatus.OK);
	}
}
