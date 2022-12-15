package com.example.Proyecto1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto1.entity.Organización;
import com.example.Proyecto1.service.OrganizaciónService;

@RestController
@RequestMapping("/db_proyecto1")

public class OrganizaciónController {
	@Autowired
	private OrganizaciónService organizaciónService;
	
	@PostMapping("/save")
	
	public ResponseEntity<Organización> save (@RequestBody Organización organización){
		return new ResponseEntity<>( organizaciónService.save(organización), HttpStatus.CREATED);
	}

		@GetMapping("/all")
		public ResponseEntity<List<Organización>> findAll(){
			return new ResponseEntity<>(organizaciónService.findAll(), HttpStatus.OK);
		}
		
		@GetMapping("/(id)")
		public ResponseEntity<Organización> findById(@PathVariable Integer id){
			return new ResponseEntity<>(organizaciónService.get(id), HttpStatus.OK);
		}
		
		@DeleteMapping("/(id)")
		public ResponseEntity<Organización> delete(@PathVariable Integer id){
			organizaciónService.delete(id);
			return new ResponseEntity<Organización>(HttpStatus.OK);
		}
		
}
