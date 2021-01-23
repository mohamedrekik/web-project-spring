package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.PublicationRepository;



import com.example.demo.entity.Publication;


@Service
public class IPublicationImpl implements IPublicationService {

	@Autowired
	PublicationRepository publicationRepository;

	
	
	public Publication addPublication(Publication m) {
		publicationRepository.save(m);
		return m;
	}

	
	public void deletePublication(Long id) {
		
		publicationRepository.deleteById(id);

	}
	public Publication updatePublication(Publication m) {
		
		return publicationRepository.saveAndFlush(m);
	}
	public Publication findPublication(Long id) {
		Publication m= (Publication)publicationRepository.findById(id).get();
		return m;
	}
	public List<Publication> findAllPublications() {
		
		return publicationRepository.findAll();
	}
	
	

	public Publication findByTitre(String titre) {
		return publicationRepository.findByTitre(titre);
	}
	
	/*public List<Publication> findByDate(Date dateApparition) {
		return publicationRepository.findByDate(dateApparition);
	}*/
	public List<Publication> findByType(String type) {
		return publicationRepository.findByType(type);
	}
	@Override
	public Publication findBysourcePdf(String sourcePdf) {
		return publicationRepository.findBysourcePdf(sourcePdf);
	}

	@Override
	public Publication findBylien(String lien) {
		return publicationRepository.findBylien(lien);
	}


	/// other ..
	
	/*@Override
	public void affecterpublicationTomember(Long idpub, Long idauteur) {
		Publication pub= publicationRepository.findById(idpub).get();
		Membre_Publication mbs= new Membre_Publication();
		mbs.setPublication(pub);
		mbs.setId(new Membre_Pub_Ids(idpub, idauteur));
		publicationmbrrepository.save(mbs);
	}
	*/
	
	
	
	
}
