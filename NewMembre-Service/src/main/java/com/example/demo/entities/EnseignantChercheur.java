package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.example.demo.EvenementBean;
import com.example.demo.OutilBean;
import com.example.demo.PublicationBean;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("ens")


public class EnseignantChercheur extends Membre implements Serializable{
	private String etablissement;
	private String grade;

	@OneToMany(mappedBy = "encadrant")
	@JsonIgnore
	private Collection<Etudiant> etudiants;

	public EnseignantChercheur() {
		super();
	}
	/**
	 * @param cin
	 * @param nom
	 * @param prenom
	 * @param date
	 * @param photo
	 * @param cv
	 * @param email
	 * @param password
	 */
	public EnseignantChercheur(String cin, String nom, String prenom, Date dateNaiss, String photo, String cv, String email,
			String password,Collection<PublicationBean> pubs, Collection<OutilBean> outils, Collection<EvenementBean> events, String grade, String etablissement) {
		super(cin, nom, prenom, dateNaiss, photo, cv, email, password,pubs,outils,events);
		this.grade = grade;
		this.etablissement = etablissement;
	}
	public String getGrade() {
		return grade;
	}
	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	
}

