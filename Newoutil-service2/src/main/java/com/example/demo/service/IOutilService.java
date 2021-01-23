package com.example.demo.service;

import java.util.Date;
import java.util.List;



import com.example.demo.entity.Outil;

public interface IOutilService {

		//Crud sur les membres
			public Outil addOutil(Outil m);
			public void deleteOutil(Long id) ;
			public Outil updateOutil(Outil p) ;
			public Outil findOutil(Long id) ;
			public List<Outil> findAll();
			//Filtrage par propriété
			public Outil findBysource(String source);


}
