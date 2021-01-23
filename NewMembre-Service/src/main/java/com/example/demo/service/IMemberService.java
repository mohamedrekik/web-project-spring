package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.EvenementBean;

import com.example.demo.OutilBean;
import com.example.demo.PublicationBean;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;
import com.example.demo.entities.Membre_Publication;


public interface IMemberService {
	//Crud sur les membres 
	public Membre addMember(Membre m);
	public void deleteMember(Long id) ;
	public Membre updateMember(Membre p) ;
	public Membre findMember(Long id) ;
	public List<Membre> findAll();
	//Filtrage par propriété
	public Membre findByCin(String cin);
	public Membre findByEmail(String email);
	public List<Membre> findByNom(String nom);
	//recherche spécifique des étudiants
	public List<Etudiant> findAllEtudiants();
	public List<Etudiant> findByDiplome(String diplome);
	public Etudiant findEtudiant(Long id);
	//recherche spécifique des enseignants
	public EnseignantChercheur findEnseignant(Long id);
	public List<EnseignantChercheur> findAllEnseignants();
	public List<EnseignantChercheur> findByGrade(String grade);
	public List<EnseignantChercheur> findByEtablissement(String etablissement);
	
	//other ..
	
	public Etudiant affecterencadrantToetudiant(Long idetd, Long idens);
	
	//public void affecterpublicationtoauteur(Long idauteur, Long idpub);
	///public List<MemberBean> findAuteurparpublication(Long idpub);
	
	// publication ** 
	public ArrayList<Membre> findAuteurparpublication(Long idpublication) ;
	public void affecterauteurTopublication(Long idauteur, Long idpub);
	public List<PublicationBean> findPublicationparauteur(Long idauteur);
	
	// outil ** 
	
	public void affecterauteurTooutil(Long idauteur, Long idout);
	public List<OutilBean> findOutilparauteur(Long idauteur);
	
	// evenement ** 
	
	public void affecterorganisateurToevenement(Long idorganisateur, Long idevent);
	public List<EvenementBean> findEvenementparorganisateur(Long idorganisateur);
}
