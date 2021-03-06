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




import com.example.demo.entity.Publication;


import com.example.demo.service.IPublicationService;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
public class PubicationRestController {
	@Autowired
	IPublicationService iPublicationService;

	
	@GetMapping(value = "/publications")
	public List<Publication> findAllpubications()
	{
		return iPublicationService.findAllPublications();
	}

	@GetMapping(value = "/publications/{id}")
	public Publication findonePublication(@PathVariable Long id)
	{
		return iPublicationService.findPublication(id);
	}
	
	@PostMapping(value = "/publication/new")
	public Publication addPublication(@RequestBody Publication pub)
	{
		return iPublicationService.addPublication(pub);
	}

	
	@PutMapping(value="/publications/update/{id}")
	public Publication updatepublication(@PathVariable String lien, @RequestBody Publication p)
	{
		p.setLien(lien);
		return iPublicationService.updatePublication(p);
	}


	@GetMapping(value = "/publication/{id}")
	public Publication findOnePublicationById(@PathVariable Long id) {
		return iPublicationService.findPublication(id);
	}
	@GetMapping(value = "/publication/search/sourcepdf")
	public Publication findOnePublicationBySource(@RequestParam String sourcePdf) {
		return iPublicationService.findBysourcePdf(sourcePdf);
	}
	@GetMapping(value = "/publication/search/titre")
	public Publication findOnePublicationByTitre(@RequestParam String titre) {
		return iPublicationService.findByTitre(titre);
	}
	@GetMapping(value = "/publication/search/lien")
	public Publication findOnePublicationByLien(@RequestParam String lien) {
		return iPublicationService.findBylien(lien);
	}
	
	/*********************************/

	@DeleteMapping(value = "/publication/{id}")
	public void deletePublication(@PathVariable Long id) {
		iPublicationService.deletePublication(id);
	}
	@PutMapping(value = "/publication/{id}")
	public Publication updatePublication(@PathVariable Long id, @RequestBody Publication p) {
          p.setId(id);
		return iPublicationService.updatePublication(p);
	}
	
	/*@PutMapping(value="/publications/affectmembre")
	public Publication affecter(@RequestParam Long idpub , @RequestParam Long idmbr )
	{
		
	       return iPublicationService.affecterpublicationTomembre(idpub, idmbr);
	}*/
	/*@GetMapping("/membres")
	public CollectionModel<MemberBean>listermembres()
	{
		return membreproxy.listeDesMembres();
		
	}
	@GetMapping("/membres/{id}")
	public EntityModel<MemberBean> listerunmembre(@PathVariable Long id)
	{
		return membreproxy.recupererUnMembre(id);
		
	}
	@GetMapping("/membres/publication/{id}")
	public List<MemberBean>listermembrebypublication(@PathVariable(name="id") Long idpub)
	{
		return iPublicationService.findAuteurparpublication(idpub);		
	}
	
	@GetMapping("/fullpublicationmbr/{id}")
	public Publication findAFullPublicationmbr(@PathVariable(name="id") Long id)
	{
		Publication pub=iPublicationService.findPublication(id);
		pub.setMbrs(iPublicationService.findAuteurparpublication(id));
		return pub;		
	}*/
	/*@GetMapping("/membres/publication/{id}")
	public List<MemberBean>listermembrebypublication(@PathVariable(name="id") Long idpub)
	{
		return iPublicationService.findAuteurparpublication(idpub);		
	}
	
	@GetMapping("/fullpublicationmbr/{id}")
	public Publication findAFullPublicationmbr(@PathVariable(name="id") Long id)
	{
		Publication pub=iPublicationService.findPublication(id);
		pub.setMbrs(iPublicationService.findAuteurparpublication(id));
		return pub;		
	}*/
	
	
}
