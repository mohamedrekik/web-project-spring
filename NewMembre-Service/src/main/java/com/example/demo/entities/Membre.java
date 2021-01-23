package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.example.demo.EvenementBean;
import com.example.demo.OutilBean;
import com.example.demo.PublicationBean;


import lombok.NonNull;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name = "type_mbr", discriminatorType = DiscriminatorType.STRING, length = 3)

//@RequiredArgsConstructor
 public  abstract class Membre implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	private String cin;

	
	private String nom;


	private String prenom;


	@Temporal(TemporalType.DATE)
	private Date dateNaiss;

	private String photo;
	
	private String cv;
	
	private String email;
	@NonNull
	private String password;
	@Transient
	Collection<PublicationBean> pubs;
	@Transient
	Collection<OutilBean> outils;
	@Transient
	Collection<EvenementBean> events;
	public Membre() {
		super();	
		}
	
	public Membre(String cin, String nom, String prenom, Date date, String photo, String cv, String email,
			String password,Collection<PublicationBean> pubs ,Collection<OutilBean> outils,Collection<EvenementBean> events) {
		super();
	
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = date;
		this.photo = photo;
		this.cv = cv;
		this.email = email;
		this.password = password;
		this.pubs = pubs;
		this.outils = outils;
		this.events = events;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate() {
		return dateNaiss;
	}

	public void setDate(Date date) {
		this.dateNaiss = date;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Collection<PublicationBean> getPubs() {
		return pubs;
	}
	public void setPubs(Collection<PublicationBean> pubs) {
		this.pubs = pubs;
	}
	
	public Collection<OutilBean> getOutils() {
		return outils;
	}
	public void setOutils(Collection<OutilBean> outils) {
		this.outils = outils;
	}
	public Collection<EvenementBean> getEvents() {
		return events;
	}
	public void setEvents(Collection<EvenementBean> events) {
		this.events = events;
	}
}
