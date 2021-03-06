package com.example.demo.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Evenement;




import com.example.demo.service.IEvenementService;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class EvenementRestController {
	@Autowired
	IEvenementService EvenementService;
	@GetMapping("/evenements")
	public List<Evenement> findEvenements() {
		return EvenementService.findAll();
	}
	@GetMapping(value = "/evenement/{id}")
	public Evenement findOneOutilById(@PathVariable Long id) {
		return EvenementService.findEvenement(id);
	}
	@GetMapping(value = "/evenements/search/lieu")
	public Evenement findOneOutilByLieu(@RequestParam String lieu) {
		return EvenementService.findByLieu(lieu);
	}
	
	/*********************************/
	@PostMapping(value = "/evenements")
	public Evenement addEvenement(@RequestBody Evenement m) {
		return EvenementService.addEvenement(m);
	}
	@DeleteMapping(value = "/evenements/{id}")
	public void deleteEvenement(@PathVariable Long id) {
		EvenementService.deleteEvenement(id);
	}
	@PutMapping(value = "/evenements/{id}")
	public Evenement updateEvenement(@PathVariable Long id, @RequestBody Evenement p) {
          p.setId(id);
		return EvenementService.updateEvenement(p);
	}
	
}
