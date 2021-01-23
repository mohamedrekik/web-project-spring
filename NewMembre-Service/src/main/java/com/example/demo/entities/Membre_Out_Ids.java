package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable

public class Membre_Out_Ids  implements Serializable{
	
	private Long out_id;
	private Long auteur_id;
	public Membre_Out_Ids() {
		super();
	}
	public Membre_Out_Ids(Long out_id, Long auteur_id) {
		super();
		this.out_id = out_id;
		this.auteur_id = auteur_id;
	}
	public Long getOut_id() {
		return out_id;
	}
	public void setOut_id(Long out_id) {
		this.out_id = out_id;
	}
	public Long getAuteur_id() {
		return auteur_id;
	}
	public void setAuteur_id(Long auteur_id) {
		this.auteur_id = auteur_id;
	}
	
	
	
}
