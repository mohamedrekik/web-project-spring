package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.dao.OutilRepository;
import com.example.demo.entity.Outil;

@SpringBootApplication
@EnableDiscoveryClient
public class OutilService2Application implements CommandLineRunner{
	@Autowired
	OutilRepository evenementRepository;
	@Autowired
    RepositoryRestConfiguration configuration;

	public static void main(String[] args) {
		SpringApplication.run(OutilService2Application.class, args);
	}
	public void run(String... args) throws Exception {
		configuration.exposeIdsFor(Outil.class);
	
		Outil outil1= new Outil(new Date(),"lien1");
		Outil outil2= new Outil(new Date(), "lien2");
		Outil outil3= new Outil(new Date(), "lien3");
	
		 evenementRepository.save(outil1);
		 evenementRepository.save(outil2);
		 evenementRepository.save(outil3);
	
	}

}
