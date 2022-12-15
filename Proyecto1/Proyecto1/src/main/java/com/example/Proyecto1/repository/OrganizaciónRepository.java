package com.example.Proyecto1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proyecto1.entity.Organización;

@Repository

public interface OrganizaciónRepository extends JpaRepository<Organización, Integer>{

	

}
