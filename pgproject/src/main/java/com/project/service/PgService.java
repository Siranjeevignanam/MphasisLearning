package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Owner;
import com.project.model.Pg;
import com.project.repository.PgRepository;

@Service
public class PgService {

	@Autowired
	OwnerService ownerservice;
	
	@Autowired
	PgRepository repo;
	
	public List<Pg> getPgByCity(String city)
	{
		return repo.findByCity(city);
	}
	
	public List<Pg> getPgByLocality(String locality)
	{
		return repo.findByLocality(locality);
	}
	
	public Pg getPgById(Long id) {
	    return repo.findById(id).orElse(null);
	}
	
	public Pg addPg(Pg pg) {
	    if (pg.getOwner() != null && pg.getOwner().getOwnerId() != null) {
	        Owner owner = ownerservice.getOwnerById(pg.getOwner().getOwnerId());
	        pg.setOwner(owner);
	    }
	    return repo.save(pg);
	}


}
