package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Publication;

@Repository
//@RepositoryRestController
public interface PublicationRepository extends JpaRepository<Publication, Long> {
	Publication findByTitre(String titre);
	//List<Publication> findByDate(Date dateApparition);
	List<Publication> findByType(String type);
	Publication findBylien(String lien);
	Publication findBysourcePdf(String sourcePdf);

	//List<Publication> findAllPublications();
}

