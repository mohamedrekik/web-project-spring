package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Membre_Evenement;
import com.example.demo.entities.Membre_Event_Ids;
import com.example.demo.entities.Membre_Out_Ids;
import com.example.demo.entities.Membre_Outil;



@Repository
public interface Membreoutrepository extends JpaRepository<Membre_Outil, Membre_Out_Ids> {
	@Query("select m from Membre_Outil m where auteur_id=:x")
	List<Membre_Outil> findoutId(@Param ("x") Long autId);
	
}
