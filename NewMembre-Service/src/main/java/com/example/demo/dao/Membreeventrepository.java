package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Membre_Evenement;
import com.example.demo.entities.Membre_Event_Ids;



@Repository
public interface Membreeventrepository extends JpaRepository<Membre_Evenement, Membre_Event_Ids> {
	@Query("select m from Membre_Evenement m where organisateur_id=:x")
	List<Membre_Evenement> findeventId(@Param ("x") Long orgId);
	
}
