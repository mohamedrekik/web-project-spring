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



import com.example.demo.entity.Outil;



import com.example.demo.service.IOutilService;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class OutilRestController {
	@Autowired
	IOutilService outilService;
	@GetMapping("/outils")
	public List<Outil> findOutils() {
		return outilService.findAll();
	}
	@GetMapping(value = "/outil/{id}")
	public Outil findOneOutilById(@PathVariable Long id) {
		return outilService.findOutil(id);
	}
	@GetMapping(value = "/outil/search/source")
	public Outil findOneOutilBySource(@RequestParam String source) {
		return outilService.findBysource(source);
	}
	
	/*********************************/
	@PostMapping(value = "/outils/new")
	public Outil addOutil(@RequestBody Outil m) {
		return outilService.addOutil(m);
	}
	@DeleteMapping(value = "/outils/{id}")
	public void deleteOutil(@PathVariable Long id) {
		outilService.deleteOutil(id);
	}
	@PutMapping(value = "/outils/{id}")
	public Outil updateOutil(@PathVariable Long id, @RequestBody Outil p) {
          p.setId(id);
		return outilService.updateOutil(p);
	}
	
}
