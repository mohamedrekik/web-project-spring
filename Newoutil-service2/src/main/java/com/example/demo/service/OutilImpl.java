package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.OutilRepository;

import com.example.demo.entity.Outil;



@Service
public class OutilImpl implements IOutilService {

	@Autowired
	OutilRepository outilRepository;
	@Override
	public Outil addOutil(Outil m) {
		outilRepository.save(m);
		return m;
	}

	@Override
	public void deleteOutil(Long id) {
		outilRepository.deleteById(id);
		
	}

	@Override
	public Outil updateOutil(Outil p) {
		return outilRepository.saveAndFlush(p);
	}

	@Override
	public Outil findOutil(Long id) {
		Outil m= (Outil)outilRepository.findById(id).get();
		return m;
	}

	@Override
	public List<Outil> findAll() {
		return outilRepository.findAll();
	}

	@Override
	public Outil findBysource(String source) {
		return outilRepository.findBysource(source);
	}

}