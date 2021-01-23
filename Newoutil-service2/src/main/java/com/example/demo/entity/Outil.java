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

public class Outil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@NonNull
	private Date dateGeneration;
	
	@NonNull
	private String source;

	public Outil() {
		super();
	}

	
	public Outil(@NonNull Date dateGeneration, @NonNull String source) {
		super();
		this.dateGeneration = dateGeneration;
		this.source = source;
	}


	public Outil(Long id, @NonNull Date dateGeneration, @NonNull String source) {
		super();
		this.id = id;
		this.dateGeneration = dateGeneration;
		this.source = source;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDateGeneration() {
		return dateGeneration;
	}


	public void setDateGeneration(Date dateGeneration) {
		this.dateGeneration = dateGeneration;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}

	
	
}
	