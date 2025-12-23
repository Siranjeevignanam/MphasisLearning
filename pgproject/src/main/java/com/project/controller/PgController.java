package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Pg;
import com.project.service.PgService;

@RequestMapping("/pg")
@RestController
public class PgController 

{

	@Autowired
	PgService service;
	
	
	@GetMapping("/details/{id}") 
	public Pg getPgById(@PathVariable Long id) 
	{ 
		return service.getPgById(id); 
		}
	
	@GetMapping("/{city}")
	public List<Pg> getPgByCity(@PathVariable String city)
	{
		return service.getPgByCity(city);
		
	}
	

	@GetMapping("/locality/{locality}")
	public List<Pg> getPgByLocality(@PathVariable String locality)
	{
		return service.getPgByLocality(locality);
		
	}
	
	@PutMapping("/edit/{pgId}")
    public Pg editPg(@PathVariable Long pgId,
                          @RequestBody Pg pgPlace) {
        return service.updatePg(pgId, pgPlace);
    }
	
	
	@PutMapping("/{pgId}/status")
    public Pg  changeAvailability(@PathVariable Long pgId) {
        return service.updateAvailability(pgId);
    }
}
