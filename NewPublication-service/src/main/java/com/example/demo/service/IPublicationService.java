package com.example.demo.service;

import java.util.Date;
import java.util.List;




import com.example.demo.entity.Publication;

public interface IPublicationService {
	//Crud sur les publications 
	public Publication addPublication(Publication m);
	public void deletePublication(Long id) ;
	public Publication updatePublication(Publication p) ;
	public Publication findPublication(Long id) ;
	
	//

	public List<Publication> findAllPublications();
	//Filtrage par propriété
	
	public Publication findBysourcePdf(String sourcePdf);
	public Publication findBylien(String lien);

	//Filtrage par propriété
	
	public Publication findByTitre(String titre);
	//public List<Publication> findByDate(Date date);
	//recherche spécifique des publications
	///public List<Publication> findAllPublications();
	public List<Publication> findByType(String type);
	//public void affecterpublicationTomember(Long idpub, Long idauteur);
	//other ..
	
	//public List<MemberBean> findAuteurparpublication(Long idpub);
	
	
}
