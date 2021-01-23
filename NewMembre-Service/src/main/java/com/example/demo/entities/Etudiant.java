package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.example.demo.EvenementBean;
import com.example.demo.OutilBean;
import com.example.demo.PublicationBean;
@Entity
@DiscriminatorValue("etd")
public class Etudiant extends Membre implements Serializable {
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	private String sujet;
	private String diplome;
	@ManyToOne
	private EnseignantChercheur encadrant;
	
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
	
	public Etudiant() {
		super();
	}
	public Etudiant(String cin, String nom, String prenom, Date date, String photo, String cv, String email,
			String password,Collection<PublicationBean> pubs,Collection<OutilBean> outils,Collection<EvenementBean> events, Date dateInscription, String sujet, String diplome, EnseignantChercheur encadrant) {
		super(cin, nom, prenom, date, photo, cv, email, password,pubs,outils,events);
		// TODO Auto-generated constructor stub
		this.dateInscription = dateInscription;
		this.sujet = sujet;
		this.diplome = diplome;
		this.encadrant = encadrant;
	}
	
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public void setEncadrant(EnseignantChercheur ens) {
		this.encadrant=ens;
		
	}
	public EnseignantChercheur getEncadrant() {
		return encadrant;
	}
}