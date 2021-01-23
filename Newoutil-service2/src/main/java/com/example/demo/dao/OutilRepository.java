package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Outil;

//@RepositoryRestControlle

@Repository

public interface OutilRepository extends JpaRepository<Outil, Long>{
		Outil findBysource(String source);
		//Outil findByid(Long id);
		//List<Outil> findByDate(Date dateGeneration);
}
