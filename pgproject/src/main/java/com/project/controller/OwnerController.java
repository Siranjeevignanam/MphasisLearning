package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Owner;
import com.project.model.Pg;
import com.project.service.OwnerService;
import com.project.service.PgService;

@RestController
@RequestMapping("/pg/owner")
public class OwnerController {
	
	@Autowired
	OwnerService ownerservice;
@Autowired
PgService pgservice;

	@GetMapping("/{id}") 
	public Owner getOwnerById(@PathVariable Long id) 
	{ 
		return ownerservice.getOwnerById(id); 
		}
	
	
	
	
	@PostMapping("/places/add")
	public Pg addPg(@RequestBody Pg pg) {
	    return pgservice.addPg(pg);
	}

	@GetMapping("/places")
	public List<Pg> getAllPg()
	{
		return pgservice.getAllPg();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePg(@PathVariable Long id)
	{
		pgservice.deletePg(id);
	}
	
	
}
