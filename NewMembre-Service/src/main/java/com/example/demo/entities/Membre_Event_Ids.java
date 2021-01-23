package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable

public class Membre_Event_Ids  implements Serializable{
	
	private Long event_id;
	private Long organisateur_id;
	public Membre_Event_Ids() {
		super();
	}
	public Membre_Event_Ids(Long event_id, Long organisateur_id) {
		super();
		this.event_id = event_id;
		this.organisateur_id = organisateur_id;
	}
	public Long getEvent_id() {
		return event_id;
	}
	public void setEvent_id(Long event_id) {
		this.event_id = event_id;
	}
	public Long getOrganisateur_id() {
		return organisateur_id;
	}
	public void setOrganisateur_id(Long organisateur_id) {
		this.organisateur_id = organisateur_id;
	}
	
	
}
