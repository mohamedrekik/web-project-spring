package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity

public class Evenement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String titre;
	
	@Temporal(TemporalType.DATE)
	@NonNull
	private Date dateRealisation;
	
	@NonNull
	private String lieu;

	public Evenement() {
		super();
	}
	

	public Evenement(@NonNull String titre, @NonNull Date dateRealisation, @NonNull String lieu) {
		super();
		this.titre = titre;
		this.dateRealisation = dateRealisation;
		this.lieu = lieu;
	}


	public Evenement(Long id, @NonNull String titre, @NonNull Date dateRealisation, @NonNull String lieu) {
		super();
		this.id = id;
		this.titre = titre;
		this.dateRealisation = dateRealisation;
		this.lieu = lieu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDateRealisation() {
		return dateRealisation;
	}

	public void setDateRealisation(Date dateRealisation) {
		this.dateRealisation = dateRealisation;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	
}
	