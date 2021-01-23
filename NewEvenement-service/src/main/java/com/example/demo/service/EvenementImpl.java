package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EvenementRepository;
import com.example.demo.entity.Evenement;


@Service
public class EvenementImpl implements IEvenementService {

	@Autowired
	EvenementRepository evenementRepository;
	@Override
	public Evenement addEvenement(Evenement m) {
		evenementRepository.save(m);
		return m;
	}

	@Override
	public void deleteEvenement(Long id) {
		evenementRepository.deleteById(id);
		
	}

	@Override
	public Evenement updateEvenement(Evenement p) {
		return evenementRepository.saveAndFlush(p);
	}

	@Override
	public Evenement findEvenement(Long id) {
		Evenement m= (Evenement)evenementRepository.findById(id).get();
		return m;
	}

	@Override
	public List<Evenement> findAll() {
		return evenementRepository.findAll();
	}

	@Override
	public Evenement findByLieu(String lieu) {
		return evenementRepository.findByLieu(lieu);
	}
	@Override
	public Evenement findByTitre(String titre) {
		return evenementRepository.findByTitre(titre);
	}
}