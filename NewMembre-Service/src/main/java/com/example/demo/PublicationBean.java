package com.example.demo;


import java.util.Date;




//Java bean non persistant ayant les mêmes attributs que l'entité Publication
//@Data
//@JavaBean
public class PublicationBean {
	private Long id;
	private String titre;
	private String type;//article de journal/ manifestation/chapitre de livre/livre/poster
	private Date dateApparition;
	private String lien;
	private String sourcePdf;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateApparition() {
		return dateApparition;
	}
	public void setDateApparition(Date dateApparition) {
		this.dateApparition = dateApparition;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public String getSourcePdf() {
		return sourcePdf;
	}
	public void setSourcePdf(String sourcePdf) {
		this.sourcePdf = sourcePdf;
	}
	
	
}
