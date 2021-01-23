package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Membre_Pub_Ids;
import com.example.demo.entities.Membre_Publication;


@Repository
public interface Publicationmbrrepository extends JpaRepository<Membre_Publication, Membre_Pub_Ids> {
	
	@Query("select m from Membre_Publication m where publication_id=:y")
	List<Membre_Publication> findmbrId(@Param ("y") Long pubId);
	
}
