package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.dao.PublicationRepository;
import com.example.demo.entity.Publication;

import com.example.demo.service.IPublicationService;

@SpringBootApplication
@EnableDiscoveryClient
public class PublicationServiceApplication implements CommandLineRunner{
	@Autowired
	PublicationRepository publicationRepository;
	@Autowired
    RepositoryRestConfiguration configuration;
	
	@Autowired
    IPublicationService iPublicationService;
	
	public static void main(String[] args) {
		SpringApplication.run(PublicationServiceApplication.class, args);
	}
	public void run(String... args) throws Exception {
		configuration.exposeIdsFor(Publication.class);
		Publication pubs1= new Publication("article", "testing systems", new Date(), "lien", "pdf");
		Publication pubs2= new Publication("chapitre de livre", "towards cloud computing",new Date(), "lien", "pdf");
		Publication pubs3= new Publication("article","blochain systems", new Date(), "lien", "pdf");
		 publicationRepository.save(pubs1);
		 publicationRepository.save(pubs2);
		 publicationRepository.save(pubs3);
		 
		 
		///****affecter un membre à une publication
			
			//1-récupérer la publication par id en invoquant publication-service
			/*MemberBean mbr1=membreProxy.recupererUnMembre(1L).getContent();
			System.out.println(mbr1.getNom()+ "  "+mbr1.getPrenom());
			MemberBean mbr2=membreProxy.recupererUnMembre(2L).getContent();
			System.out.println(mbr2.getNom()+ "  "+mbr2.getPrenom());*/
			
			//2- affecter  member à pub

			/*iPublicationService.affecterpublicationTomember(1L,mbr1.getId());
			iPublicationService.affecterpublicationTomember(2L,mbr1.getId());
			iPublicationService.affecterpublicationTomember(1L,mbr2.getId());*/
			
			//afficher le nombre d'auteurs de la publication 1
			/* List<MemberBean> lstmbrs=iPublicationService.findAuteurparpublication(1L);
			lstmbrs.forEach(r->System.out.println(r.toString()));
			
			
			MemberBean m=membreProxy.recupererUnMembre(1L).getContent();
			System.out.println(m);*/
			
		 
	}

}
