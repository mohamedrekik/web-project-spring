package com.example.demo.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.EvenementBean;
import com.example.demo.OutilBean;


@FeignClient(value = "outil-service")
public interface OutilProxy {
	@GetMapping(value = "/outils")
	CollectionModel<OutilBean> listeDesOutils();

	@GetMapping( value = "/outil/{id}")
	EntityModel<OutilBean> recupererUnOutil(@PathVariable("id") Long id);

}
