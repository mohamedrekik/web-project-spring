package com.example.demo.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;





import lombok.NonNull;


@Entity

public class Publication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String titre;
	@NonNull
	private String type;//article de journal/ manifestation/chapitre de livre/livre/poster
	@Temporal(TemporalType.DATE)
	@NonNull
	private Date dateApparition;
	@NonNull
	private String lien;
	@NonNull
	private String sourcePdf;
	/*@Transient
	Collection<MemberBean> mbrs;*/
	
	public Publication() {
		super();
	}
	public Publication(@NonNull String titre, @NonNull String type, @NonNull Date dateApparition,
			@NonNull String lien, @NonNull String sourcePdf) {
		super();
	
		this.titre = titre;
		this.type = type;
		this.dateApparition = dateApparition;
		this.lien = lien;
		this.sourcePdf = sourcePdf;
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
	
	/*public Collection<MemberBean> getMbrs() {
		return mbrs;
	}
	public void setMbrs(Collection<MemberBean> mbrs) {
		this.mbrs = mbrs;
	}*/
	
}

