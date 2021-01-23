package com.example.demo;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.dao.EvenementRepository;
import com.example.demo.entity.Evenement;

@SpringBootApplication
@EnableDiscoveryClient
public class EvenementServiceApplication implements CommandLineRunner{
	@Autowired
	EvenementRepository evenementRepository;
	@Autowired
    RepositoryRestConfiguration configuration;

	public static void main(String[] args) {
		SpringApplication.run(EvenementServiceApplication.class, args);
	}
	public void run(String... args) throws Exception {
		configuration.exposeIdsFor(Evenement.class);
	
		Evenement event1= new Evenement("Tunisia Hack",new Date(),"IIT");
		Evenement event2= new Evenement("PYFAC 6",new Date(), "Nahr el fenounn");
		Evenement event3= new Evenement("CyberSecurity",new Date(), "ENIS");
		Evenement event4= new Evenement("E-Health: Covid-19",new Date(), "CRNS");
		 evenementRepository.save(event1);
		 evenementRepository.save(event2);
		 evenementRepository.save(event3);
		 evenementRepository.save(event4);
	}

}
