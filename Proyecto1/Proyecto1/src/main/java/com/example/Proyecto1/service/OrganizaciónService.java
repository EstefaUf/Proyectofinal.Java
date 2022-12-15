package com.example.Proyecto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto1.entity.Organización;
import com.example.Proyecto1.repository.OrganizaciónRepository;

@Service

public class OrganizaciónService {

	
		@Autowired
	private OrganizaciónRepository organizaciónRepository;
	
	public  List<Organización> findAll() {
		return organizaciónRepository.findAll();
	}
	
	public Organización save(Organización organización) {
		return organizaciónRepository.save(organización);
	}
	
	
	

	public Organización get(Integer id) {
		return organizaciónRepository.findById(id).get();
	}
	
	public void delete (Integer id) {
		organizaciónRepository.deleteById(id);
	}
}
