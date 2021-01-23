package com.example.demo.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity

public class Membre_Outil {

	@EmbeddedId
	private Membre_Out_Ids id;
	@ManyToOne
    @MapsId("auteur_id")
    private Membre auteur;
	
	public Membre_Outil() {
		super();
	}

	public Membre_Outil(Membre_Out_Ids id, Membre auteur) {
		super();
		this.id = id;
		this.auteur = auteur;
	}

	public Membre_Out_Ids getId() {
		return id;
	}

	public void setId(Membre_Out_Ids id) {
		this.id = id;
	}

	public Membre getAuteur() {
		return auteur;
	}

	public void setAuteur(Membre auteur) {
		this.auteur = auteur;
	}

	
	
}
