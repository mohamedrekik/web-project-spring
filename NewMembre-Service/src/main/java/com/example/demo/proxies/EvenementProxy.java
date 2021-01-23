package com.example.demo.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.EvenementBean;


@FeignClient(value = "evenement-service")
public interface EvenementProxy {
	@GetMapping(value = "/evenements")
	CollectionModel<EvenementBean> listeDesEvenements();

	@GetMapping( value = "/evenement/{id}")
	EntityModel<EvenementBean> recupererUnEvenement(@PathVariable("id") Long id);

}
