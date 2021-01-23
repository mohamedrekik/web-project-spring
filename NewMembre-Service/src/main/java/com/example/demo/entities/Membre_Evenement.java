package com.example.demo.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity

public class Membre_Evenement {

	@EmbeddedId
	private Membre_Event_Ids id;
	@ManyToOne
    @MapsId("organisateur_id")
    private Membre organisateur;
	
	public Membre_Evenement() {
		super();
	}

	public Membre_Evenement(Membre_Event_Ids id, Membre organisateur) {
		super();
		this.id = id;
		this.organisateur = organisateur;
	}

	public Membre_Event_Ids getId() {
		return id;
	}

	public void setId(Membre_Event_Ids id) {
		this.id = id;
	}

	public Membre getOrganisateur() {
		return organisateur;
	}

	public void setOrganisateur(Membre organisateur) {
		this.organisateur = organisateur;
	}	
	
	
}

