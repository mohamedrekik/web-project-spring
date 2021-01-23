package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.entity.Evenement;


public interface IEvenementService {

		//Crud sur les membres
			public Evenement addEvenement(Evenement m);
			public void deleteEvenement(Long id) ;
			public Evenement updateEvenement(Evenement p) ;
			public Evenement findEvenement(Long id) ;
			public List<Evenement> findAll();
			//Filtrage par propriété
			public Evenement findByLieu(String lieu);
			public Evenement findByTitre(String titre);


}
