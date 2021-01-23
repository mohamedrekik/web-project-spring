package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.example.demo.entity.Evenement;

//@RepositoryRestController
@Repository

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
	Evenement findByLieu(String lieu);
	Evenement findByTitre(String titre);
	//List<Evenement> findByDate(Date dateRealisation);
}